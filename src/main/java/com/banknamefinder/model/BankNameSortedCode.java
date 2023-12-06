package com.banknamefinder.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
@Getter
@Builder
public class BankNameSortedCode {
   private String bankName;
   private List<String> sortedCodes;
}
