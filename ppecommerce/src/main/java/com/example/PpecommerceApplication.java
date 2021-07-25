package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.dao.CategorieRepository;
import com.example.dao.LivreRepository;
import com.example.entities.Categorie;
import com.example.entities.Livre;

@SpringBootApplication
public class PpecommerceApplication implements CommandLineRunner {
	@Autowired(required=true)
	private LivreRepository livreRepository;
	@Autowired
	private CategorieRepository categorieRepository;
	@Autowired
	private RepositoryRestConfiguration repConf;
	
	public static void main(String[] args) {
		SpringApplication.run(PpecommerceApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		repConf.exposeIdsFor(Livre.class,Categorie.class);
		Categorie cat1 = categorieRepository.save(new Categorie(null,"1","Manga",null));
		livreRepository.save(new Livre(null,"1","Death Note","Manga de l'auteur ***",15000,10,"xxx",cat1));
	}

}
