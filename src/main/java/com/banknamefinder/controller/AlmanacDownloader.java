package com.banknamefinder.controller;

import com.banknamefinder.client.Almanac;
import com.banknamefinder.service.FileCompare;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
public class AlmanacDownloader {

    @PostMapping
    @RequestMapping("/almanac-downloader")
    public String almanacDownloader() throws IOException, URISyntaxException {
        Almanac almanac = new Almanac();
        almanac.almanacReader();
        FileCompare fileCompare = new FileCompare();
        fileCompare.fileCompare();
        return "File downloaded";
    }
}
