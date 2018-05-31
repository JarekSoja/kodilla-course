package com.kodilla.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class KodillaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodillaHibernateApplication.class, args);
	}
}
