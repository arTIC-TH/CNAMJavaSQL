package plantes;

import java.sql.Date;

public class Commande {
    private Integer id_comm;
    private Integer id_client;
    private Date date_comm;
    private Float montant_comm;
    private Integer isdeleted_comm;
    private Date date_validation;

    public Commande(Integer id_client, Date date_comm, Float montant_comm) {
        this.id_client = id_client;
        this.date_comm = date_comm;
        this.montant_comm = montant_comm;
    }
    
    public Commande(Integer id_comm, Integer id_client, Date date_comm, Float montant_comm, Integer isdeleted_comm, Date date_validation) {
        this.id_comm = id_comm;
        this.id_client = id_client;
        this.date_comm = date_comm;
        this.montant_comm = montant_comm;
        this.isdeleted_comm = isdeleted_comm;
        this.date_validation = date_validation;
    }

    public Date getDate_validation() {
        return date_validation;
    }

    public void setDate_validation(Date date_validation) {
        this.date_validation = date_validation;
    }

    public Integer getId_comm() {
        return id_comm;
    }

    public void setId_comm(Integer id_comm) {
        this.id_comm = id_comm;
    }

    public Integer getId_client() {
        return id_client;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }

    public Date getDate_comm() {
        return date_comm;
    }

    public void setDate_comm(Date date_comm) {
        this.date_comm = date_comm;
    }

    public Float getMontant_comm() {
        return montant_comm;
    }

    public void setMontant_comm(Float montant_comm) {
        this.montant_comm = montant_comm;
    }

    public Integer getIsdeleted_comm() {
        return isdeleted_comm;
    }

    public void setIsdeleted_comm(Integer isdeleted_comm) {
        this.isdeleted_comm = isdeleted_comm;
    }
    
}
