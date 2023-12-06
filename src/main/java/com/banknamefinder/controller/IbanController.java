package com.banknamefinder.controller;

import com.banknamefinder.model.BankNameBuilder;
import com.banknamefinder.service.BankNameService;
import com.banknamefinder.service.IBANtoBankNameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IbanController {

    private final BankNameService bankNameService;


    @GetMapping(value = "/iban", produces = MediaType.APPLICATION_JSON_VALUE)
    public BankNameBuilder ibanCtr(@RequestParam String iban) {
        return bankNameService.creatingResponseObjectForBankName(iban);
    }

}
