package plantes;

import java.sql.Date;

public class Paiement {
    private Integer id_paie;
    private Date date_paie;
    private Date date_traitement_paie;
    private Date date_validation_paie;
    private Integer id_comm;
    
    public Paiement(Date date_paie, Integer id_comm) {
        this.date_paie = date_paie;
        this.id_comm = id_comm;
    }
    
    public Paiement(Integer id_paie, Date date_paie, Date date_traitement_paie, Date date_validation_paie, Integer id_comm) {
        this.id_paie = id_paie;
        this.date_paie = date_paie;
        this.date_traitement_paie = date_traitement_paie;
        this.date_validation_paie = date_validation_paie;
        this.id_comm = id_comm;
    }

    public Integer getId_comm() {
        return id_comm;
    }

    public void setId_comm(Integer id_comm) {
        this.id_comm = id_comm;
    }

    public Integer getId_paie() {
        return id_paie;
    }

    public void setId_paie(Integer id_paie) {
        this.id_paie = id_paie;
    }

    public Date getDate_paie() {
        return date_paie;
    }

    public void setDate_paie(Date date_paie) {
        this.date_paie = date_paie;
    }

    public Date getDate_traitement_paie() {
        return date_traitement_paie;
    }

    public void setDate_traitement_paie(Date date_traitement_paie) {
        this.date_traitement_paie = date_traitement_paie;
    }

    public Date getDate_validation_paie() {
        return date_validation_paie;
    }

    public void setDate_validation_paie(Date date_validation_paie) {
        this.date_validation_paie = date_validation_paie;
    }
    
}
