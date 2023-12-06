package com.banknamefinder.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IBANtoBankNameService {
    public String extractSortCode(String iban) {
        String trimmedIban = iban.trim();
        int ibanLength = trimmedIban.length();
        switch (ibanLength) {
            case 14, 15, 16, 35, 34, 32, 28, 26, 29 -> {
                return extractingSortedCodeFromIbanWith2635Digits(iban);
            }
            case 8, 9, 11 -> {
                return formattedIban(iban);
            }
            case 10, 12, 13 -> {
                return extractingIbanWithPLAnd8Digits(iban);
            }
            default -> {
                return iban;
            }
        }
    }

    private String formattedIban(String iban) {
        return iban.trim().replaceAll("[^0-9]+", "");
    }


    private String extractingIbanWithPLAnd8Digits(String iban) {
        String cutted = iban.trim().replaceAll("[^0-9]+", "");
        if (iban.contains("PL") && cutted.length() == 10) {
            return iban.trim().replaceAll("[^0-9]+", "").substring(2, 10);
        } else if (cutted.length() == 10) {
            return extractingSortedCodeFromIbanWith2635Digits(iban);
        } else return iban.trim().replaceAll("[^0-9]+", "");
    }

    private String extractingSortedCodeFromIbanWith2635Digits(String iban) {
        return formattedIban(iban).substring(2, 10);
    }
}
