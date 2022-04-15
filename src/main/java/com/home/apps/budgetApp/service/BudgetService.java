package com.home.apps.budgetApp.service;

import com.home.apps.budgetApp.data.models.Budget;
import com.home.apps.budgetApp.data.payloads.request.BudgetRequest;
import com.home.apps.budgetApp.data.payloads.response.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface BudgetService {
    MessageResponse createBudget(BudgetRequest budgetRequest);
    Optional<Budget> updateBudget (Integer budgetId, BudgetRequest budgetRequest);
    void deleteBudget (Integer budgetId);
    Budget getASingleBudget (Integer budgetId);
    List<Budget> getAllBBudgets();

}
