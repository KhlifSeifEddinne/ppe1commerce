package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.dao.CategorieRepository;
import com.example.dao.LivreRepository;
import com.example.dao.ReviewRepository;
import com.example.entities.Categorie;
import com.example.entities.Livre;
import com.example.entities.Review;

@SpringBootApplication
@EnableJpaRepositories
public class PpecommerceApplication implements CommandLineRunner {
	
	@Autowired(required=true)
	private LivreRepository livreRepository;
	
	@Autowired(required=true)
	private CategorieRepository categorieRepository;
	
	@Autowired(required = true)
	private ReviewRepository reviewRepository;
	
	@Autowired
	private RepositoryRestConfiguration repConf;
	
	public static void main(String[] args) {
		SpringApplication.run(PpecommerceApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		repConf.exposeIdsFor(Livre.class,Categorie.class,Review.class);
		
		//reviewRepository.save(new Review(null,"****"));
		
		//Categorie cat1 = categorieRepository.save(new Categorie(null,"1","Manga",null));
		
		//livreRepository.save(new Livre(null,"1","Death Note","Manga de l'auteur ***",15000,10,"xxx",cat1));
	}

}
