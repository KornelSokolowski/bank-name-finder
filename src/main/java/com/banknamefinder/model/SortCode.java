package com.banknamefinder.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@XmlRootElement(namespace = "NumerRozliczeniowy")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class SortCode {

    @XmlElement(name = "NrRozliczeniowy")
    private String nrRozliczeniowy;

    @XmlElement(name = "NazwaNumeru")
    private String nazwaNumeru;

    @XmlElement(name = "KodyBIC")
    private List<String> kodyBIC;

    @XmlElement(name = "DataWygenerowania")
    private String dataWygenerowania;

    @Override
    public String toString() {
        return "SortCode{" +
                "nrRozliczeniowy='" + nrRozliczeniowy + '\'' +
                ", nazwaNumeru='" + nazwaNumeru + '\'' +
                ", kodyBIC=" + kodyBIC +
                ", dataWygenerowania='" + dataWygenerowania + '\'' +
                '}';
    }
}
