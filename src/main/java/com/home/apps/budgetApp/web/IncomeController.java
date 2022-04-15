package com.home.apps.budgetApp.web;

import com.home.apps.budgetApp.data.payloads.request.IncomeRequest;
import com.home.apps.budgetApp.data.payloads.response.MessageResponse;
import com.home.apps.budgetApp.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/income")
public class IncomeController {

    @Autowired
    IncomeService incomeService;

    @PostMapping("/add")
    public ResponseEntity<MessageResponse> addIncome(@RequestBody IncomeRequest income){
        MessageResponse newIncome=incomeService.createIncome(income);
        return new ResponseEntity<>(newIncome, HttpStatus.CREATED);
    }
}
