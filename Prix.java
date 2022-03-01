/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantes;

import java.util.Date;

/**
 *
 * @author 310531706
 */
public class Prix {
    private Integer id_prix;
    private Date date_debutVal_prix;
    private Date date_finVal_prix;
    private Integer isdeleted;
    private Integer id_produit;
    private Float prix_prix;
    
    public Prix(Integer id_produit, Float prix_prix) {
        this.id_produit = id_produit;
        this.prix_prix = prix_prix;
    }

    public Prix(Integer id_prix, Date date_debutVal_prix, Date date_finVal_prix, Integer isdeleted, Integer id_produit, Float prix_prix) {
        this.id_prix = id_prix;
        this.date_debutVal_prix = date_debutVal_prix;
        this.date_finVal_prix = date_finVal_prix;
        this.isdeleted = isdeleted;
        this.id_produit = id_produit;
        this.prix_prix = prix_prix;
    }

    public Float getPrix_prix() {
        return prix_prix;
    }

    public void setPrix_prix(Float prix_prix) {
        this.prix_prix = prix_prix;
    }

    public Integer getId_prix() {
        return id_prix;
    }

    public void setId_prix(Integer id_prix) {
        this.id_prix = id_prix;
    }

    public Date getDate_debutVal_prix() {
        return date_debutVal_prix;
    }

    public void setDate_debutVal_prix(Date date_debutVal_prix) {
        this.date_debutVal_prix = date_debutVal_prix;
    }

    public Date getDate_finVal_prix() {
        return date_finVal_prix;
    }

    public void setDate_finVal_prix(Date date_finVal_prix) {
        this.date_finVal_prix = date_finVal_prix;
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Integer getId_produit() {
        return id_produit;
    }

    public void setId_produit(Integer id_produit) {
        this.id_produit = id_produit;
    }
    
    
    
}
