package plantes;

public class Client {
   
   private Integer id_client;
   private String nom_cli;
   private String prenom_cli;
   private String adr_cli;
   private Integer cp_cli;
   private String ville_cli;
   private String email_cli;
   
    public Client(String nom_cli, String prenom_cli, String adr_cli, Integer cp_cli, String ville_cli, String email_cli) {
        this.nom_cli = nom_cli;
        this.prenom_cli = prenom_cli;
        this.adr_cli = adr_cli;
        this.cp_cli = cp_cli;
        this.ville_cli = ville_cli;
        this.email_cli = email_cli;
    }

    public String getNom_cli() {
        return nom_cli;
    }

    public void setNom_cli(String nom_cli) {
        this.nom_cli = nom_cli;
    }

    public String getPrenom_cli() {
        return prenom_cli;
    }

    public void setPrenom_cli(String prenom_cli) {
        this.prenom_cli = prenom_cli;
    }

    public String getAdr_cli() {
        return adr_cli;
    }

    public void setAdr_cli(String adr_cli) {
        this.adr_cli = adr_cli;
    }

    public Integer getCp_cli() {
        return cp_cli;
    }

    public void setCp_cli(Integer cp_cli) {
        this.cp_cli = cp_cli;
    }

    public String getVille_cli() {
        return ville_cli;
    }

    public void setVille_cli(String ville_cli) {
        this.ville_cli = ville_cli;
    }

    public String getEmail_cli() {
        return email_cli;
    }

    public void setEmail_cli(String email_cli) {
        this.email_cli = email_cli;
    }
    
    public Integer getId_client() {
        return id_client;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }

}

