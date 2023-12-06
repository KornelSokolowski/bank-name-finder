package com.banknamefinder.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@XmlRootElement(name = "Jednostka")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@ToString
public class Banks {

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

}

