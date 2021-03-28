package com.gleidston.zup.vacinas;

import org.hibernate.Hibernate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication (exclude = HibernateJpaAutoConfiguration.class)
public class VacinasApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacinasApplication.class, args);
	}

}
