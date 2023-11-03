package com.banknamefinder.client;


import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Almanac {

    public void almanhReader() throws IOException {
        URL website = new URL("https://ewib.nbp.pl/plewiba?dokNazwa=plewiba.xml");
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream("src/main/resources/confidential/test.xml");
        fos.getChannel().transferFrom(rbc,0,Long.MAX_VALUE);
        fos.close();
    }

}
