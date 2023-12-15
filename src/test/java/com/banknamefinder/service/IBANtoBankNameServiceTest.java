package com.banknamefinder.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class IBANtoBankNameServiceTest {


    IBANtoBankNameService ibaNtoBankNameService = new IBANtoBankNameService();

    @ParameterizedTest
    @MethodSource("getIbanNumbers")
    @DisplayName("Testing extractSortCodes method in IBANtoBankNameService")
    void extractSortCodes(List<String> givenIbanNumbers, String expectedSortedCode) {
        givenIbanNumbers.forEach(ibanNumber -> {
            String sortCode = ibaNtoBankNameService.extractSortCode(ibanNumber);
            Assertions.assertThat(sortCode).isEqualTo(expectedSortedCode);
        });
    }

    private static Stream<Arguments> getIbanNumbers() {
        return Stream.of(Arguments.of(ibanNumbersNBP(), "10101371")
                , Arguments.of(ibanNumbersBGZBNPPARIBAS(), "16001462")
                , Arguments.of(ibanNumbersBankSpoldzielczyBrodnica(), "94841222")
                , Arguments.of(ibanNumbersBankDeutscheBank(), "19101048")
                , Arguments.of(ibanNumbersBankPKO(), "10201853")
                , Arguments.of(ibanNumbersBankBNPParibas(), "16001462")
                , Arguments.of(ibanNumbersBankGospodarkiZywnosciowej(), "20300045")
                , Arguments.of(ibanNumbersBankSantander(), "10901102")
        );
    }

    private static List<String> ibanNumbersNBP() {
        String iban = "PL 35 1010 1371 0034 1822 2100 0000";
        String iban1 = "PL35101013710034182221000000";
        String iban2 = "35101013710034182221000000";
        String iban3 = "35 1010 1371 0034 1822 2100 0000";
        String iban4 = "PL 35 1010 1371 ";
        String iban5 = "PL 35 1010 1371";
        String iban6 = "PL3510101371";
        String iban7 = "PL 1010 1371";
        String iban8 = "10101371";
        String iban9 = "PL35 1010 1371 0034 1822 2100 0000";
        return List.of(iban, iban1, iban2, iban3, iban4, iban5, iban6, iban7, iban8);

    }

    private static List<String> ibanNumbersBGZBNPPARIBAS() {
        String iban = "PL 02 1600 1462 1873 2443 8000 0001";
        String iban1 = "PL02 1600 1462 1873 2443 8000 0001";
        String iban2 = "02160014621873244380000001";
        String iban3 = "02 1600 1462 1873 2443 8000 0001";
        String iban4 = "PL 02 1600 1462 ";
        String iban5 = "PL 02 1600 1462";
        String iban6 = "PL0216001462";
        String iban7 = "PL 1600 1462 ";
        String iban8 = "16001462";
        return List.of(iban, iban1, iban2, iban3, iban4, iban5, iban6, iban7, iban8);
    }

    private static List<String> ibanNumbersBankSpoldzielczyBrodnica() {
        String iban = "PL 92 9484 1222 2035 0006 1737 0001";
        String iban1 = "PL92 9484 1222 2035 0006 1737 0001";
        String iban2 = "92948412222035000617370001";
        String iban3 = "92 9484 1222 2035 0006 1737 0001";
        String iban4 = "PL 92 9484 1222 ";
        String iban5 = "PL 92 9484 1222";
        String iban6 = "PL9294841222";
        String iban7 = "PL 94841222";
        String iban8 = "94841222";
        return List.of(iban, iban1, iban2, iban3, iban4, iban5, iban6, iban7, iban8);
    }

    private static List<String> ibanNumbersBankDeutscheBank() {
        String iban = "PL 26 1910 1048 2625 3796 7929 0001";
        String iban1 = "PL26 1910 1048 2625 3796 7929 0001";
        String iban2 = "26191010482625379679290001";
        String iban3 = "26 1910 1048 2625 3796 7929 0001";
        String iban4 = "PL 26 1910 1048 ";
        String iban5 = "PL 26 1910 1048";
        String iban6 = "PL2619101048";
        String iban7 = "PL 1910 1048 ";
        String iban8 = "PL19101048";
        return List.of(iban, iban1, iban2, iban3, iban4, iban5, iban6, iban7, iban8);
    }

    private static List<String> ibanNumbersBankPKO() {
        String iban = "PL 88 1020 1853 0000 9302 0014 7512";
        String iban1 = "PL88 1020 1853 0000 9302 0014 7512";
        String iban2 = "88102018530000930200147512";
        String iban3 = "88 1020 1853 0000 9302 0014 7512";
        String iban4 = "PL 88 1020 1853 ";
        String iban5 = "PL 88 1020 1853";
        String iban6 = "PL8810201853";
        String iban7 = "PL 1020 1853 ";
        String iban8 = "PL10201853 ";
        return List.of(iban, iban1, iban2, iban3, iban4, iban5, iban6, iban7, iban8);
    }

    private static List<String> ibanNumbersBankBNPParibas() {
        String iban = "PL 30 1600 1462 1811 9047 3000 0001";
        String iban1 = "PL30 1600 1462 1811 9047 3000 0001";
        String iban2 = "30160014621811904730000001";
        String iban3 = "30 1600 1462 1811 9047 3000 0001";
        String iban4 = " 30 1600 1462 ";
        String iban5 = "30 1600 1462";
        String iban6 = "3016001462";
        String iban7 = " 1600 1462 ";
        String iban8 = "16001462";
        return List.of(iban, iban1, iban2, iban3, iban4, iban5, iban6, iban7, iban8);
    }

    private static List<String> ibanNumbersBankGospodarkiZywnosciowej() {
        String iban = "PL 54 2030 0045 1110 0000 02";
        String iban1 = "PL54 2030 0045 1110 0000 0275 ";
        String iban2 = "54203000451110000002750150";
        String iban3 = "54 2030 0045 1110 0000 0275 0150";
        String iban4 = "PL 54 2030 0045 ";
        String iban5 = "PL 54 2030 0045";
        String iban6 = "PL5420300045";
        String iban7 = "PL 2030 0045 ";
        String iban8 = "20300045";
        return List.of(iban, iban1, iban2, iban3, iban4, iban5, iban6, iban7, iban8);
    }

    private static List<String> ibanNumbersBankSantander() {
        String iban = "PL 74 1090 1102 0000 0001 3079 5026";
        String iban1 = "PL74 1090 1102 0000 0001 3079 5026";
        String iban2 = "74109011020000000130795026";
        String iban3 = "74 1090 1102 0000 0001 3079 5026";
        String iban4 = " PL 74 1090 1102 ";
        String iban5 = "PL 74 1090 1102";
        String iban6 = "PL7410901102";
        String iban7 = "PL 1090 1102 ";
        String iban8 = "10901102";
        return List.of(iban, iban1, iban2, iban3, iban4, iban5, iban6, iban7, iban8);
    }

}