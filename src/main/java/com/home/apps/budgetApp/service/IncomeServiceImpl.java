package com.home.apps.budgetApp.service;

import com.home.apps.budgetApp.data.models.Income;
import com.home.apps.budgetApp.data.payloads.request.IncomeRequest;
import com.home.apps.budgetApp.data.payloads.response.MessageResponse;
import com.home.apps.budgetApp.data.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncomeServiceImpl implements IncomeService{

    @Autowired
    private IncomeRepository incomeRepository;

    @Override
    public MessageResponse createIncome(IncomeRequest incomeRequest) {
        Income newIncome = new Income();
        newIncome.setOwner(incomeRequest.getOwner());
        newIncome.setAmount(incomeRequest.getAmount());
        newIncome.setDate(incomeRequest.getDate());
        incomeRepository.save(newIncome);
        return new MessageResponse("New income has been added");
    }

    @Override
    public Optional<Income> updateIncome(Integer incomeId, IncomeRequest incomeRequest) {
        return Optional.empty();
    }

    @Override
    public void deleteIncome(Integer incomeId) {

    }

    @Override
    public Income getASingleIncome(Integer incomeId) {
        return null;
    }

    @Override
    public List<Income> getAllIncome() {
        return null;
    }
}
