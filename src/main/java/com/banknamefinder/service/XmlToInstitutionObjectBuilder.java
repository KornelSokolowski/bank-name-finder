package com.banknamefinder.service;

import com.banknamefinder.model.Institution;
import com.banknamefinder.model.InstitutionsObject;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
@RequiredArgsConstructor
public class XmlToInstitutionObjectBuilder {

    public List<Institution> institutionsObjectBuilder() {
        File xmlFile = new File("src/main/resources/confidential/almanac.xml");
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(InstitutionsObject.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            InstitutionsObject institutionsObject = (InstitutionsObject) jaxbUnmarshaller.unmarshal(xmlFile);
            return institutionsObject.getInstitutions();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
