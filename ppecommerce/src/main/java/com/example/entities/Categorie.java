package com.example.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity @Data
public class Categorie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategorie;
	private String codeCategorie;
	private String designationCategorie;
	
	@OneToMany(mappedBy = "categorie",fetch=FetchType.EAGER)
	private Collection<Livre> livres;

	
	  
	 
	
	public Categorie() {
		super();
	}
	

	public Categorie(Long idCategorie, String codeCategorie, String designationCategorie, Collection<Livre> livres) {
		super();
		this.idCategorie = idCategorie;
		this.codeCategorie = codeCategorie;
		this.designationCategorie = designationCategorie;
		this.livres = livres;
	}
	
	  public Categorie(Long id_Cat) {
		  this.idCategorie=id_Cat; 
	  }
	 

	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getCodeCategorie() {
		return codeCategorie;
	}

	public void setCodeCategorie(String codeCategorie) {
		this.codeCategorie = codeCategorie;
	}

	public String getDesignationCategorie() {
		return designationCategorie;
	}

	public void setDesignationCategorie(String designationCategorie) {
		this.designationCategorie = designationCategorie;
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
