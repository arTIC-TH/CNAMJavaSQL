package plantes;

import java.util.Date;

public class DetailCommande {
	private Integer id_detail_DC;
        private Integer id_comm;
        private Integer id_produit;
        private Integer qte_crea_DC;
        private Date date_crea_DC;
        private Integer is_deleted_DC;
        
    public DetailCommande(Integer id_comm, Integer id_produit, Integer qte_crea_DC) {
        this.id_comm = id_comm;
        this.id_produit = id_produit;
        this.qte_crea_DC = qte_crea_DC;
    }
        
    public DetailCommande(Integer id_detail_DC, Integer id_comm, Integer id_produit, Integer qte_crea_DC, Date date_crea_DC, Integer is_deleted_DC) {
        this.id_detail_DC = id_detail_DC;
        this.id_comm = id_comm;
        this.id_produit = id_produit;
        this.qte_crea_DC = qte_crea_DC;
        this.date_crea_DC = date_crea_DC;
        this.is_deleted_DC = is_deleted_DC;
    }

    public Integer getIs_deleted_DC() {
        return is_deleted_DC;
    }

    public void setIs_deleted_DC(Integer is_deleted_DC) {
        this.is_deleted_DC = is_deleted_DC;
    }

    public Integer getId_detail_DC() {
        return id_detail_DC;
    }

    public void setId_detail_DC(Integer id_detail_DC) {
        this.id_detail_DC = id_detail_DC;
    }

    public Integer getId_comm() {
        return id_comm;
    }

    public void setId_comm(Integer id_comm) {
        this.id_comm = id_comm;
    }

    public Integer getId_produit() {
        return id_produit;
    }

    public void setId_produit(Integer id_produit) {
        this.id_produit = id_produit;
    }

    public Integer getQte_crea_DC() {
        return qte_crea_DC;
    }

    public void setQte_crea_DC(Integer qte_crea_DC) {
        this.qte_crea_DC = qte_crea_DC;
    }

    public Date getDate_crea_DC() {
        return date_crea_DC;
    }

    public void setDate_crea_DC(Date date_crea_DC) {
        this.date_crea_DC = date_crea_DC;
    }
    
    
}
