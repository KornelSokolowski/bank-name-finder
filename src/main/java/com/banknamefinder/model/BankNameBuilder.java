package com.banknamefinder.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class BankNameBuilder {
    private String bankName;
    private String receivedAccountNumber;
}
