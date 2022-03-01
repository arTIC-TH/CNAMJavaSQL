package plantes;

import java.util.Date;

public class Produit {
    
    private Integer id_produit;
    private String libelle_court_prod;
    private String libelle_long_prod;
    private String chemin_photo_prod;
    private Integer isdeleted_prod;
    private Date date_creat_prod;
    private Integer quantite_prod;
    private Date date_derniere_commande;
    private String message_prod;
    
    public Produit(String libelle_court_prod, String libelle_long_prod, String chemin_photo_prod, Integer isdeleted_prod, Date date_creat_prod, Integer quantite_prod, Date date_derniere_commande, String message_prod) {
        this.libelle_court_prod = libelle_court_prod;
        this.libelle_long_prod = libelle_long_prod;
        this.chemin_photo_prod = chemin_photo_prod;
        this.isdeleted_prod = isdeleted_prod;
        this.date_creat_prod = date_creat_prod;
        this.quantite_prod = quantite_prod;
        this.date_derniere_commande = date_derniere_commande;
        this.message_prod = message_prod;
    }
    
    public Produit(String libelle_court_prod, Integer quantite_prod) {
        this.libelle_court_prod = libelle_court_prod;
        this.quantite_prod = quantite_prod;
    }
    
    public String getMessage_prod() {
        return message_prod;
    }

    public void setMessage_prod(String message_prod) {
        this.message_prod = message_prod;
    }

    public String getLibelle_court_prod() {
        return libelle_court_prod;
    }

    public void setLibelle_court_prod(String libelle_court_prod) {
        this.libelle_court_prod = libelle_court_prod;
    }

    public String getLibelle_long_prod() {
        return libelle_long_prod;
    }

    public void setLibelle_long_prod(String libelle_long_prod) {
        this.libelle_long_prod = libelle_long_prod;
    }

    public String getChemin_photo_prod() {
        return chemin_photo_prod;
    }

    public void setChemin_photo_prod(String chemin_photo_prod) {
        this.chemin_photo_prod = chemin_photo_prod;
    }

    public Integer getIsdeleted_prod() {
        return isdeleted_prod;
    }

    public void setIsdeleted_prod(Integer isdeleted_prod) {
        this.isdeleted_prod = isdeleted_prod;
    }

    public Date getDate_creat_prod() {
        return date_creat_prod;
    }

    public void setDate_creat_prod(Date date_creat_prod) {
        this.date_creat_prod = date_creat_prod;
    }

    public Integer getQuantite_prod() {
        return quantite_prod;
    }

    public void setQuantite_prod(Integer quantite_prod) {
        this.quantite_prod = quantite_prod;
    }

    public Date getDate_derniere_commande() {
        return date_derniere_commande;
    }

    public void setDate_derniere_commande(Date date_derniere_commande) {
        this.date_derniere_commande = date_derniere_commande;
    }
    
    public Integer getId_produit() {
        return id_produit;
    }

    public void setId_produit(Integer id_produit) {
        this.id_produit = id_produit;
    }
    
}
