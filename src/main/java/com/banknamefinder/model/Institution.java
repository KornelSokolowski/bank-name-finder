package com.banknamefinder.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "Instytucja")
@XmlAccessorType(XmlAccessType.FIELD)
public class Institution {

    @XmlElement(name = "TypInstytucji")
    private String typInstytucji;

    @XmlElement(name = "PodtypInstytucji")
    private String podtypInstytucji;

    @XmlElement(name = "NrInstytucji")
    private String nrInstytucji;

    @XmlElement(name = "NazwaInstytucji")
    private String nazwaInstytucji;

    @XmlElement(name = "SymbolLiterowy")
    private String symbolLiterowy;

    @XmlElement(name = "DataRozpDzial")
    private String dataRozpDzial;

    @XmlElement(name = "NIP")
    private String nip;

    @XmlElement(name = "IdentyfikatorLEI")
    private String identyfikatorLEI;

    @XmlElement(name = "WWW")
    private String www;

    @XmlElement(name = "Jednostka")
    private List<Bank> bank;

    @Override
    public String toString() {
        return "Institution{" +
                "typInstytucji='" + typInstytucji + '\'' +
                ", podtypInstytucji='" + podtypInstytucji + '\'' +
                ", nrInstytucji='" + nrInstytucji + '\'' +
                ", nazwaInstytucji='" + nazwaInstytucji + '\'' +
                ", symbolLiterowy='" + symbolLiterowy + '\'' +
                ", dataRozpDzial='" + dataRozpDzial + '\'' +
                ", nip='" + nip + '\'' +
                ", identyfikatorLEI='" + identyfikatorLEI + '\'' +
                ", www='" + www + '\'' +
                ", bank=" + bank +
                '}';
    }
}
