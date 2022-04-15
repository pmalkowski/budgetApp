package com.home.apps.budgetApp.service;

import com.home.apps.budgetApp.data.models.Budget;
import com.home.apps.budgetApp.data.payloads.request.BudgetRequest;
import com.home.apps.budgetApp.data.payloads.response.MessageResponse;
import com.home.apps.budgetApp.data.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BudgetServiceImpl implements BudgetService{

    @Autowired
    private BudgetRepository budgetRepository;

    @Override
    public MessageResponse createBudget(BudgetRequest budgetRequest) {
        Budget newBudget = new Budget();
        newBudget.setBudget_name(budgetRequest.getBudget_name());
        newBudget.setPlan(budgetRequest.getPlan());
        newBudget.setRealization_date(budgetRequest.getRealization_date());
        budgetRepository.save(newBudget);
        return new MessageResponse("New Budger has been added");
    }

    @Override
    public Optional<Budget> updateBudget(Integer budgetId, BudgetRequest budgetRequest) {
        return Optional.empty();
    }

    @Override
    public void deleteBudget(Integer budgetId) {
        if(budgetRepository.getById(budgetId).getId().equals(budgetId)){
            budgetRepository.deleteById(budgetId);
        }
    }

    @Override
    public Budget getASingleBudget(Integer budgetId) {
        return null;
    }

    @Override
    public List<Budget> getAllBBudgets() {
        return null;
    }
}
