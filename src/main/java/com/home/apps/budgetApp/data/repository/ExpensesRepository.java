package com.home.apps.budgetApp.data.repository;

import com.home.apps.budgetApp.data.models.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpensesRepository extends JpaRepository<Expenses,Integer> {
}
