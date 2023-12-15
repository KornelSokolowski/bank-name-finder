package com.banknamefinder.controller;

import com.banknamefinder.model.BankNameBuilder;
import com.banknamefinder.service.BankNameService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(IbanController.class)
@RunWith(SpringRunner.class)
class IbanControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private BankNameService bankNameService;

    @Test
    @DisplayName("Should return Bank Name and given account number")
    void ibanCtr() throws Exception {
        when(bankNameService.creatingResponseObjectForBankName("94841222")).thenReturn(prepareIbanResponse());
        mockMvc.perform(get("/iban")
                        .param("iban", "94841222"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.bankName").value("Bank Spółdzielczy w Brodnicy"))
                .andExpect(jsonPath("$.receivedAccountNumber").value("94841222"));
verify(bankNameService,times(1)).creatingResponseObjectForBankName("94841222");
    }

    private BankNameBuilder prepareIbanResponse() {
        BankNameBuilder bankNameBuilder = new BankNameBuilder();
        bankNameBuilder.setBankName("Bank Spółdzielczy w Brodnicy");
        bankNameBuilder.setReceivedAccountNumber("94841222");
        return bankNameBuilder;
    }
}