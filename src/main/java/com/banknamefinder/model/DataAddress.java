package com.banknamefinder.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "DaneAdresowe")
@XmlAccessorType(XmlAccessType.FIELD)
public class DataAddress {

    @XmlElement(name = "kraj")
    private String kraj;
    @XmlElement(name = "wojewodztwo")
    private String wojewodztwo;
    @XmlElement(name = "powiat")
    private String powiat;
    @XmlElement(name = "miejscowosc")
    private String miejscowosc;
    @XmlElement(name = "ulica")
    private String ulica;
    @XmlElement(name = "numerBudynku")
    private String numerBudynku;
    @XmlElement(name = "kodPocztowy")
    private String kodPocztowy;
    @XmlElement(name = "poczta")
    private String poczta;
    @XmlElement(name = "nrSkrytkiPocztowej")
    private String nrSkrytkiPocztowej;

    @Override
    public String toString() {
        return "DataAddress{" +
                "kraj='" + kraj + '\'' +
                ", wojewodztwo='" + wojewodztwo + '\'' +
                ", powiat='" + powiat + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", ulica='" + ulica + '\'' +
                ", numerBudynku='" + numerBudynku + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", poczta='" + poczta + '\'' +
                ", nrSkrytkiPocztowej='" + nrSkrytkiPocztowej + '\'' +
                '}';
    }
}
