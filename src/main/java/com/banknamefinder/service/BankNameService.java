package com.banknamefinder.service;

import com.banknamefinder.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BankNameService {

    private final XmlToInstitutionObjectBuilder institutionObjectBuilder;
    private final IBANtoBankNameService ibaNtoBankNameService;

    public BankNameSortedCode extractBankNameAndSortCodes(Institution institution) {
        String institutionName = institution.getNazwaInstytucji();
        List<String> nrRozliczeniowy = institution.getBanks().stream()
                .map(Banks::getSortCodes)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .map(SortCode::getNrRozliczeniowy)
                .toList();
        return BankNameSortedCode
                .builder().bankName(institutionName).sortedCodes(nrRozliczeniowy).build();
    }


    public Optional<String> returningBankNameFromIBan(String iban) {
        return institutionObjectBuilder.institutionsObjectBuilder().stream().map(this::extractBankNameAndSortCodes)
                .filter(bankNameSortedCode -> bankNameSortedCode.getSortedCodes().contains(iban))
                .map(BankNameSortedCode::getBankName)
                .findAny();
    }

    public BankNameBuilder creatingResponseObjectForBankName(String iban) {
        BankNameBuilder bankNameBuilder = new BankNameBuilder();
        String extractedIban = ibaNtoBankNameService.extractSortCode(iban);
        bankNameBuilder.setBankName(returningBankNameFromIBan(extractedIban).orElse("Nazwy banku nie znaleziono"));
        bankNameBuilder.setReceivedAccountNumber(iban);
        return bankNameBuilder;
    }
}
