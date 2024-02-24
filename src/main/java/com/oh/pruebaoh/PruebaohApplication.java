package com.oh.pruebaoh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties
@EnableJpaRepositories("com.oh.pruebaoh.persistence.*")
@EntityScan("oh.pruebaoh.ohentitymodel.*")
public class PruebaohApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaohApplication.class, args);
	}

}