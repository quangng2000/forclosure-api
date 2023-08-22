package com.rift.realtyinsights.forclosureapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
@CrossOrigin(origins = "*")
public class ForclosureApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForclosureApiApplication.class, args);
	}

}
