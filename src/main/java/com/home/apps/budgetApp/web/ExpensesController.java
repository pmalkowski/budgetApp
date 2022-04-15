package com.home.apps.budgetApp.web;


import com.home.apps.budgetApp.data.models.Expenses;
import com.home.apps.budgetApp.data.payloads.request.ExpensesRequest;
import com.home.apps.budgetApp.data.payloads.response.MessageResponse;
import com.home.apps.budgetApp.service.ExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {

    @Autowired
    ExpensesService expensesService;

    @PostMapping("/add")
    public ResponseEntity<MessageResponse> addExpense(@RequestBody ExpensesRequest expense){
        MessageResponse newExpense = expensesService.createExpense(expense);
        return new ResponseEntity<>(newExpense, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Expenses>> getAllExpenses(){
        List<Expenses> getAllExpenses=expensesService.getAllExpenses();
        return new ResponseEntity<>(getAllExpenses,HttpStatus.OK);
    }

    @GetMapping("/hello")
    public String echo() {
        return "Hello World!";
    }
}
