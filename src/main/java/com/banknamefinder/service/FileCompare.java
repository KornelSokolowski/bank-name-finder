package com.banknamefinder.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

import static java.nio.file.StandardCopyOption.*;

public class FileCompare {
    public void fileCompare() throws IOException {
        File temporaryFile = new File("src/main/resources/confidential/temporary.xml");
        File downloadedFile = new File("src/main/resources/confidential/almanac.xml");
        CopyOption[] options = new CopyOption[]{COPY_ATTRIBUTES, REPLACE_EXISTING, ATOMIC_MOVE};

        if(downloadedFile.exists())
        {
            if((downloadedFile.lastModified() != temporaryFile.lastModified())
                    || (downloadedFile.length() != temporaryFile.length())) {
                Files.move(Paths.get("src/main/resources/confidential/temporary.xml"),Paths.get("src/main/resources/confidential/almanac.xml"),REPLACE_EXISTING);
                System.out.println("Plik zastąpiono nowszym");
            }
        }

    }

    public static void main(String[] args) throws IOException {
        File temporaryFile = new File("src/main/resources/confidential/temporary.xml");
        File downloadedFile = new File("src/main/resources/confidential/almanac.xml");

        Date dateFileTest = new Date(temporaryFile.lastModified());
        Date dateDownloadedFile = new Date(downloadedFile.lastModified());

        System.out.println("Data sciagniętego " + dateDownloadedFile);
        System.out.println("Data testowego " + dateFileTest);

        CopyOption[] options = new CopyOption[]{COPY_ATTRIBUTES, REPLACE_EXISTING, ATOMIC_MOVE};

        if (downloadedFile.exists()) {
            if ((downloadedFile.lastModified() != temporaryFile.lastModified())
                    || (downloadedFile.length() != temporaryFile.length())) {
                Files.copy(Paths.get("src/main/resources/confidential/test.xml"), Paths.get("src/main/resources/confidential/poKopiowaniu.xml"), COPY_ATTRIBUTES, REPLACE_EXISTING);
                System.out.println(Files.isSameFile(Paths.get(downloadedFile.getPath()), Paths.get(temporaryFile.getPath())));
                System.out.println(Files.isSameFile(Paths.get(temporaryFile.getPath()), Paths.get("src/main/resources/confidential/poKopiowaniu.xml")));

            }
        }

        int i = dateFileTest.compareTo(dateDownloadedFile);
        System.out.println(i);
    }


}
