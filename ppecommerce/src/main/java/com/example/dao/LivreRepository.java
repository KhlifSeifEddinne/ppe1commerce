package com.example.dao;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.entities.Livre;

@RepositoryRestResource
@CrossOrigin("*")
@Service
public interface LivreRepository extends JpaRepository<Livre, Long> {
	@RestResource(path = "/byNom")
	public List<Livre> findByNomLivreIs(@Param("mc") String nomLiv);
	
	/*
	 * @RestResource(path = "/byNomLiv")
	 * 
	 * @Query("select p from Livre l where l.nomLivre like: x") public List<Livre>
	 * chercher(@Param("x") String nomLiv); //Le nom x
	 */
	/*
	 * @RestResource(path = "/byNomLiv") public List<Livre>
	 * findByNomLivreStartsWith(String nomLiv); //Nom commence avec
	 */}
