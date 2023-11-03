package com.banknamefinder.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "Instytucje")
@XmlAccessorType(XmlAccessType.FIELD)
public class InstitutionsObject {

    @XmlElement(name = "Instytucja")
    private List<Institution> institution;

    @Override
    public String toString() {
        return "InstitutionsObject{" +
                "institution=" + institution +
                '}';
    }
}
