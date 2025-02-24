package com.akumasoft.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.akumasoft.*")
public class MsAkumanoUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAkumanoUserApplication.class, args);
	}

}
