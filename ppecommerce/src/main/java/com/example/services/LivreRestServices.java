package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.LivreRepository;
import com.example.entities.Livre;

@CrossOrigin("*")
@RestController
public class LivreRestServices {
	
	@Autowired
	private LivreRepository livreRepository;
	
	@PutMapping(value="/listLivre/{id}")
	public Livre updateLivre(@PathVariable(name="id") Long id, @RequestBody Livre l) {
		l.setIdLivre(id);
		return livreRepository.save(l);
	}

}
