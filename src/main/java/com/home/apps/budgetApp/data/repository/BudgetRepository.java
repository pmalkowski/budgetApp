package com.home.apps.budgetApp.data.repository;

import com.home.apps.budgetApp.data.models.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget,Integer> {
}
