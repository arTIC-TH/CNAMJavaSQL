package application;

import java.util.Date;

	public class Utilisateur {
	   private String nom;
	   private String prenom;
	   private Date dateDeNaissance;
	   private String email;
	   private boolean acceptCGU;

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public String getPrenom() {
	        return prenom;
	    }

	    public void setPrenom(String prenom) {
	        this.prenom = prenom;
	    }

	    public Date getDateDeNaissance() {
	        return dateDeNaissance;
	    }

	    public void setDateDeNaissance(Date dateDeNaissance) {
	        this.dateDeNaissance = dateDeNaissance;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public boolean isAcceptCGU() {
	        return acceptCGU;
	    }

	    public void setAcceptCGU(boolean acceptCGU) {
	        this.acceptCGU = acceptCGU;
	    }
	   
	}

