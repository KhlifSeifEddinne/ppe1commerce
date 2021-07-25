package com.example.dao;

import java.util.List;

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
	@RestResource(path = "/byDesignationLivre")
	public List<Livre> findByDesignationLivreContains(@Param("mc") String desLiv);
}
