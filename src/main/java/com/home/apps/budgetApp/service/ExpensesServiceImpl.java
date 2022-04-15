package com.home.apps.budgetApp.service;


import com.home.apps.budgetApp.data.models.Expenses;
import com.home.apps.budgetApp.data.payloads.request.ExpensesRequest;
import com.home.apps.budgetApp.data.payloads.response.MessageResponse;
import com.home.apps.budgetApp.data.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpensesServiceImpl implements ExpensesService{

    @Autowired
    ExpensesRepository expensesRepository;

    @Override
    public MessageResponse createExpense(ExpensesRequest expensesRequest) {
        Expenses newExpenses = new Expenses();
        newExpenses.setAmount(expensesRequest.getAmount());
        newExpenses.setDate(expensesRequest.getDate());
        newExpenses.setOwner(expensesRequest.getOwner());
        newExpenses.setBudget(expensesRequest.getBudget());
        newExpenses.setName(expensesRequest.getName());
        expensesRepository.save(newExpenses);
        return new MessageResponse("New expense has been added");
    }

    @Override
    public Optional<Expenses> updateExpenses (Integer expenseId, ExpensesRequest expensesRequest){return Optional.empty();}

    @Override
    public void deleteExpenses(Integer expenseId){}

    @Override
    public Expenses getASingleExpenses(Integer expenseId) {
        return null;
    }

    @Override
    public List<Expenses> getAllExpenses(){return expensesRepository.findAll();}

}
