package com.clare.MuseaArchivesSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class MuseaArchivesSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuseaArchivesSpringBootApplication.class, args);
	}

}

