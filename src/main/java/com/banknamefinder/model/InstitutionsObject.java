package com.banknamefinder.model;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@XmlRootElement(name = "Instytucje")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class InstitutionsObject {

    @XmlElement(name = "Instytucja")
    private List<Institution> institutions;

    @Override
    public String toString() {
        return "InstitutionsObject{" +
                "institution=" + institutions +
                '}';
    }
}
