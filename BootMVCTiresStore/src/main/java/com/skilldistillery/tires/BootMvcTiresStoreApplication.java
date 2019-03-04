package com.skilldistillery.tires;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EntityScan("com.skilldistillery.tiredata")
public class BootMvcTiresStoreApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BootMvcTiresStoreApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BootMvcTiresStoreApplication.class, args);
	}

}
