package com.banknamefinder.client;


import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Almanac {

    public void almanacReader() throws IOException, URISyntaxException {
        URI website = new URI("https://ewib.nbp.pl/plewiba?dokNazwa=plewiba.xml");
        ReadableByteChannel rbc = Channels.newChannel(website.toURL().openStream());
        FileOutputStream fos = new FileOutputStream("src/main/resources/confidential/temporary.xml");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
    }

}
