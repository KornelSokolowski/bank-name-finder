package com.banknamefinder.controller;

import com.banknamefinder.model.BankNameBuilder;
import com.banknamefinder.service.BankNameService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class IbanController {

    private final BankNameService bankNameService;
    private final Logger logger = LoggerFactory.getLogger(IbanController.class);

    @GetMapping(value = "/iban", produces = MediaType.APPLICATION_JSON_VALUE)
    public BankNameBuilder ibanCtr(@RequestParam String iban, HttpSession session) {
        String sessionId = session.getId();
        MDC.put("sessionid", sessionId);
        logger.info("Session number from  " + sessionId, IbanController.class.getSimpleName());
        logger.info("Request from /iban " + iban);
        return bankNameService.creatingResponseObjectForBankName(iban);
    }
}
