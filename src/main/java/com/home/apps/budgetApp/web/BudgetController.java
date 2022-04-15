package com.home.apps.budgetApp.web;

import com.home.apps.budgetApp.data.payloads.request.BudgetRequest;
import com.home.apps.budgetApp.data.payloads.response.MessageResponse;
import com.home.apps.budgetApp.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/budget")
public class BudgetController {

    @Autowired
    BudgetService budgetService;

    @PostMapping("/add")
    public ResponseEntity<MessageResponse> addBudget(@RequestBody BudgetRequest budget){
        MessageResponse newBudget=budgetService.createBudget(budget);
        return new ResponseEntity<>(newBudget, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<MessageResponse> deleteBudget(@PathVariable("id") Integer id){
        budgetService.deleteBudget(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
