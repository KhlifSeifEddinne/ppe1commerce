package com.example.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data @Entity
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	private String nomClient;
	private String prenomClient;
	private String mailClient;
	private int numTelClient;
	
	@OneToMany(mappedBy = "client")
	private Collection<Livre> livres;

	public Client() {
		super();
	}
	
	public Client(Long id_Cl) {
		  this.idClient=id_Cl; 
	  }
	 

	public Client(Long idClient, String nomClient, String prenomClient, String mailClient, int numTelClient,
			Collection<Livre> livres) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.mailClient = mailClient;
		this.numTelClient = numTelClient;
		this.livres = livres;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getMailClient() {
		return mailClient;
	}

	public void setMailClient(String mailClient) {
		this.mailClient = mailClient;
	}

	public int getNumTelClient() {
		return numTelClient;
	}

	public void setNumTelClient(int numTelClient) {
		this.numTelClient = numTelClient;
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
