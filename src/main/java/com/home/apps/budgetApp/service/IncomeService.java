package com.home.apps.budgetApp.service;

import com.home.apps.budgetApp.data.models.Income;
import com.home.apps.budgetApp.data.payloads.request.IncomeRequest;
import com.home.apps.budgetApp.data.payloads.response.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface IncomeService {
    MessageResponse createIncome(IncomeRequest incomeRequest);
    Optional<Income> updateIncome(Integer incomeId, IncomeRequest incomeRequest);
    void deleteIncome(Integer incomeId);
    Income getASingleIncome(Integer incomeId);
    List<Income> getAllIncome();
}
