package com.banknamefinder.client;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class AlmanacTwo {
    String url = "https://ewib.nbp.pl/plewiba?dokNazwa=plewiba.xml";
    String destinationPath = "src/main/resources/confidential/almanacTwo.xml";

    public void almanacTwo(String url, String destinationPath) throws IOException, URISyntaxException {
        try
                (InputStream iS = new URI(url).toURL().openStream();

                 FileOutputStream fOS = new FileOutputStream(destinationPath)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = iS.read(buffer)) != -1) {
                fOS.write(buffer, 0, bytesRead);
            }
        }


    }
}
