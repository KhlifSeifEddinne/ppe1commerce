package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;

import lombok.Data;
  
  
  @Entity @Data
  public class Review implements Serializable {
  
 /**
	* 
	*/
		  private static final long serialVersionUID = 1L;
		  
		  @Id
		  @GeneratedValue(strategy = GenerationType.IDENTITY) 
		  private Long idReview;
		  
		  private String rate;

		public Review() {
			super();
		}

		public Review(Long idReview, String rate) {
			super();
			this.idReview = idReview;
			this.rate = rate;
		}

		public Long getIdReview() {
			return idReview;
		}

		public void setIdReview(Long idReview) {
			this.idReview = idReview;
		}

		public String getRate() {
			return rate;
		}

		public void setRate(String rate) {
			this.rate = rate;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		  
		  
		  
}
		 