package com.banknamefinder.service;

import com.banknamefinder.model.InstitutionsObject;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class XmlToObject {
    public static void main(String[] args) {
        File xmlFile = new File("src/main/resources/confidential/test.xml");

        JAXBContext jaxbContext;
        try

        {
            jaxbContext = JAXBContext.newInstance(InstitutionsObject.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            InstitutionsObject employee = (InstitutionsObject) jaxbUnmarshaller.unmarshal(xmlFile);

            System.out.println(employee);
        }
        catch(JAXBException e){e.printStackTrace();}
    }


}
