package com.example.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Administrateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAdministrateur;
	
	private String nomAdministrateur;
	private String motDePasse;
	
	@OneToMany(mappedBy = "administrateur")
	private Collection<Livre> livres;

	public Administrateur() {
		super();
	}

	public Administrateur(Long idAdministrateur, String nomAdministrateur, String motDePasse,
			Collection<Livre> livres) {
		super();
		this.idAdministrateur = idAdministrateur;
		this.nomAdministrateur = nomAdministrateur;
		this.motDePasse = motDePasse;
		this.livres = livres;
	}

	public Long getIdAdministrateur() {
		return idAdministrateur;
	}

	public void setIdAdministrateur(Long idAdministrateur) {
		this.idAdministrateur = idAdministrateur;
	}

	public String getNomAdministrateur() {
		return nomAdministrateur;
	}

	public void setNomAdministrateur(String nomAdministrateur) {
		this.nomAdministrateur = nomAdministrateur;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Collection<Livre> getLivres() {
		return livres;
	}

	public void setLivres(Collection<Livre> livres) {
		this.livres = livres;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}