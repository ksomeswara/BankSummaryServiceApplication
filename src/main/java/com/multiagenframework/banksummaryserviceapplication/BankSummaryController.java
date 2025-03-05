package com.multiagenframework.banksummaryserviceapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bank-summary")
public class BankSummaryController {
    @GetMapping
    public String getBankSummary() {
        return "Static Bank Summary: Account Balance $1000";
    }
}