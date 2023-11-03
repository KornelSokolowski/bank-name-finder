package com.banknamefinder;

import com.banknamefinder.client.Almanac;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class BankNameFinderApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(BankNameFinderApplication.class, args);
		Almanac almanac = new Almanac();
		almanac.almanhReader();
	}

}
