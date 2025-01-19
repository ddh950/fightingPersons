package de.coding.personsweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class PersonsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonsWebApplication.class, args);
	}

}
