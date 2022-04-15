package com.home.apps.budgetApp.service;

import com.home.apps.budgetApp.data.models.Expenses;
import com.home.apps.budgetApp.data.payloads.request.ExpensesRequest;
import com.home.apps.budgetApp.data.payloads.response.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ExpensesService {
    MessageResponse createExpense(ExpensesRequest expensesRequest);
    Optional<Expenses> updateExpenses(Integer expenseId,ExpensesRequest expensesRequest);
    void deleteExpenses (Integer expenseId);
    Expenses getASingleExpenses(Integer expenseId);
    List<Expenses> getAllExpenses();
}
