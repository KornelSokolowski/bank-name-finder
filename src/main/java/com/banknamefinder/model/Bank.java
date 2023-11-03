package com.banknamefinder.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "Jednostka")
@XmlAccessorType(XmlAccessType.FIELD)
public class Bank {
    @XmlElement(name = "NrEwidencyjny")
    private String nrEwidencyjny;

    @XmlElement(name = "TypJednostki")
    private String typJednostki;

    @XmlElement(name = "NazwaJednostki")
    private String nazwaJednostki;

    @XmlElement(name = "SymbolLiterowy")
    private String symbolLiterowy;

    @XmlElement(name = "DataPodjeciaDzialalnosci")
    private String dataPodjeciaDzialalnosci;

    @XmlElement(name = "NumerTelefonu")
    private String numerTelefonu;

    @XmlElement(name = "NumerFaksu")
    private String numerFaksu;

    @XmlElement(name = "NumerRozliczeniowy")
    private List<SortCode> sortCodes;

    @XmlElement(name = "DaneAdresowe")
    private DataAddress dataAddresses;

    @Override
    public String toString() {
        return "Bank{" +
                "nrEwidencyjny='" + nrEwidencyjny + '\'' +
                ", typJednostki='" + typJednostki + '\'' +
                ", nazwaJednostki='" + nazwaJednostki + '\'' +
                ", symbolLiterowy='" + symbolLiterowy + '\'' +
                ", dataPodjeciaDzialalnosci='" + dataPodjeciaDzialalnosci + '\'' +
                ", numerTelefonu='" + numerTelefonu + '\'' +
                ", numerFaksu='" + numerFaksu + '\'' +
                ", sortCodes=" + sortCodes +
                ", dataAddresses=" + dataAddresses +
                '}';
    }
}

