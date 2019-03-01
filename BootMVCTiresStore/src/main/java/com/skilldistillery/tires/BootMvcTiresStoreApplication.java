package com.skilldistillery.tires;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.skilldistillery.tiredata")
public class BootMvcTiresStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcTiresStoreApplication.class, args);
	}

}
