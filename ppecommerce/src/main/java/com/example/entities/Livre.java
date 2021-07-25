package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity @Data
public class Livre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLivre;
	private String codeLivre;
	private String nomLivre;
	private String designationLivre;
	private double prixLivre;
	private int quantiteLivre;
	private String photoLivre;
	
	@ManyToOne
	private Categorie categorie;
	
	@ManyToOne
	private Client client;

	public Livre() {
		super();
	}

	public Livre(Long idLivre, String codeLivre, String nomLivre, String designationLivre, double prixLivre,
			int quantiteLivre, String photoLivre, Categorie categorie, Client client) {
		super();
		this.idLivre = idLivre;
		this.codeLivre = codeLivre;
		this.nomLivre = nomLivre;
		this.designationLivre = designationLivre;
		this.prixLivre = prixLivre;
		this.quantiteLivre = quantiteLivre;
		this.photoLivre = photoLivre;
		this.categorie = categorie;
		this.client = client;
	}

	public Long getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(Long idLivre) {
		this.idLivre = idLivre;
	}

	public String getCodeLivre() {
		return codeLivre;
	}

	public void setCodeLivre(String codeLivre) {
		this.codeLivre = codeLivre;
	}

	public String getNomLivre() {
		return nomLivre;
	}

	public void setNomLivre(String nomLivre) {
		this.nomLivre = nomLivre;
	}

	public String getDesignationLivre() {
		return designationLivre;
	}

	public void setDesignationLivre(String designationLivre) {
		this.designationLivre = designationLivre;
	}

	public double getPrixLivre() {
		return prixLivre;
	}

	public void setPrixLivre(double prixLivre) {
		this.prixLivre = prixLivre;
	}

	public int getQuantiteLivre() {
		return quantiteLivre;
	}

	public void setQuantiteLivre(int quantiteLivre) {
		this.quantiteLivre = quantiteLivre;
	}

	public String getPhotoLivre() {
		return photoLivre;
	}

	public void setPhotoLivre(String photoLivre) {
		this.photoLivre = photoLivre;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
	