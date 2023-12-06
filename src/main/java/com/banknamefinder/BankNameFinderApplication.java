package com.banknamefinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootApplication
public class BankNameFinderApplication {

    public static void main(String[] args) throws IOException, URISyntaxException {
        SpringApplication.run(BankNameFinderApplication.class, args);
        //Almanac almanac = new Almanac();
        //	almanac.almanacReader();
//        String url = "https://ewib.nbp.pl/plewiba?dokNazwa=plewiba.xml";
//        String destinationPath = "src/main/resources/confidential/almanacTwo.xml";
//        AlmanacTwo almanacTwo = new AlmanacTwo();
//        almanacTwo.almanacTwo(url, destinationPath);
    }
}
