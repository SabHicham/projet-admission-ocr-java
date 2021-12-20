package com.hicham.bibliotheque;

import com.hicham.bibliotheque.repository.LivreRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BibliothequeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BibliothequeApplication.class, args);


		// Tester lq connexion avec JPA
		LivreRepository livreRepository = context.getBean(LivreRepository.class);
		System.out.println(livreRepository.findAll().get(0).getTitre());







	}

}
