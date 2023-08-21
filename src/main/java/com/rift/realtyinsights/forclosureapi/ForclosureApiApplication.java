package com.rift.realtyinsights.forclosureapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class ForclosureApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForclosureApiApplication.class, args);
	}

}
