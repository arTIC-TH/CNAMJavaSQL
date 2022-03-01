package plantes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

public class OperationsDB {
	
	public static Connection conn;
	
	/*
	 * Un metodo para preparar la insercion de datos en el cliente
	 */
	public static void selectAllClients(){
        
        if (conn == null){ 
            conn = ConnectionDB.getConnection();
        }
        
        String sql = "select * from client";
        
        PreparedStatement statement = null;
        
        try{
            statement = conn.prepareStatement(sql);
            //statement.setInt(1 , 2);
            ResultSet result = statement.executeQuery( sql );
            int count = 0;
            while ( result.next ()){
	            Integer numCli = result.getInt(1);
	            String nom = result.getString(2);
	            String ville = result.getString (3);
	            System . out . println ("NumCli : " + numCli + "Nom: " + nom + " ville : " + ville );

            }
        }catch(Exception e){
            System.out.println (" Fail !"+e);
        }
        
        
    }
	
    public static void selectAllProducts(){
        
        if (conn == null){ 
            conn = ConnectionDB.getConnection();
        }
        
        String sql = "select * from produit";
        
        PreparedStatement statement = null;
        
        try{
            statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery( sql );
            while ( result.next ()){
	            Integer codeProd = result.getInt(1);
	            String designation = result.getString(2);
	            String marque = result.getString(3);
	            String numCat = result.getString(4);
	            Double prixUnit = result.getDouble(5);
	            Integer qtStock = result.getInt(6);
	            System . out . println ("CodeProd : " + codeProd + "Designation: " + designation + " Marque : " + marque + "NumCat: " + numCat + "PrixUnit: " + prixUnit + "QtStock: " + qtStock);
            }
        }catch(Exception e){
            System.out.println (" Fail !"+e);
        }
        
        
    }
	
    public static void insertClient(Client c){
        if (conn == null){ 
            conn = ConnectionDB.getConnection();
        }        
        String sql = "INSERT INTO client (nom_cli, prenom_cli, adr_cli, cp_cli, ville_cli, email_cli ) "
                + "VALUES (? ,? ,?, ? ,? ,?)";
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement(sql);
            statement.setString(1 , c.getNom_cli());
            statement.setString(2 , c.getPrenom_cli());
            statement.setString(3 , c.getAdr_cli());
            statement.setInt(4 , c.getCp_cli());
            statement.setString(5 , c.getVille_cli());
            statement.setString(6 , c.getEmail_cli());
            int rowsInserted = statement.executeUpdate();
            if ( rowsInserted > 0) {
                System.out.println (" Succes !");
            }
        }catch(Exception e){
            System.out.println (" Fail !"+e);
        }
   }
    
    /* insertar producto v.constructor
     * 
     */
    public static void insertProduit(Produit produit){
        if (conn == null){ 
            conn = ConnectionDB.getConnection();
        }
        String sql = "INSERT INTO produits (libelle_court_prod, quantite_prod)  VALUES (? ,? )";
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement(sql);
            statement.setString(1 , produit.getLibelle_court_prod());
            statement.setInt(2 , produit.getQuantite_prod());
            int rowsInserted = statement.executeUpdate();
            if ( rowsInserted > 0) {
                System.out.println (" Succes !");
                sql = "SELECT MAX(id_produit) FROM produits";
                ResultSet result = statement.executeQuery( sql );
                while ( result.next ()){
                    produit.setId_produit(result.getInt(1));
                }
            }
        }catch(Exception e){
            System.out.println (" Fail !"+e);
        }
   }
    
   public static void insertPrix(Prix prix){
        if (conn == null){ 
            conn = ConnectionDB.getConnection();
        }
        String sql = "INSERT INTO prix (id_produit, prix_prix) VALUES (? ,? )";
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement(sql);
            statement.setInt(1 , prix.getId_produit());
            statement.setFloat(2 , prix.getPrix_prix());
            int rowsInserted = statement.executeUpdate();
            if ( rowsInserted > 0) {
                System.out.println (" Succes !");
            }
        }catch(Exception e){
            System.out.println (" Fail !"+e);
        }
   }
    
   public static void insertCommande(Commande commande){     
        if (conn == null){ 
            conn = ConnectionDB.getConnection();
        }
        String sql = "INSERT INTO commande (id_client, date_comm , montant_comm)  VALUES (?, ?, ?)";
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement(sql);
            statement.setInt(1 , commande.getId_client());
            statement.setDate(2 , commande.getDate_comm());
            statement.setFloat(3 , commande.getMontant_comm());
            int rowsInserted = statement.executeUpdate();
            if ( rowsInserted > 0) {
                System.out.println (" Succes !");
                sql = "SELECT MAX(id_comm) FROM commande";
                ResultSet result = statement.executeQuery( sql );
                while ( result.next ()){
                    commande.setId_comm(result.getInt(1));
                }
            }
        }catch(Exception e){
            System.out.println (" Fail !"+e);
        }
   }
   
   public static void insertDetailCommande(DetailCommande detailCommande){     
        if (conn == null){ 
            conn = ConnectionDB.getConnection();
        }
        String sql = "INSERT INTO detail_commande (id_comm, id_produit , qte_crea_DC)  VALUES (?, ?, ?)";
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement(sql);
            statement.setInt(1 , detailCommande.getId_comm());
            statement.setInt(2 , detailCommande.getId_produit());
            statement.setInt(3 , detailCommande.getQte_crea_DC());
            int rowsInserted = statement.executeUpdate();
            if ( rowsInserted > 0) {
                System.out.println (" Succes !");
            }
        }catch(Exception e){
            System.out.println (" Fail !"+e);
        }
   }
   
   public static void insertPaiment(Paiement paiement){     
        if (conn == null){ 
            conn = ConnectionDB.getConnection();
        }
        String sql = "INSERT INTO paiement (date_paie, id_comm)  VALUES (?, ?)";
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement(sql);
            statement.setDate(1 , paiement.getDate_paie());
            statement.setInt(2 , paiement.getId_comm());
            int rowsInserted = statement.executeUpdate();
            if ( rowsInserted > 0) {
                System.out.println (" Succes !");
            }
        }catch(Exception e){
            System.out.println (" Fail !"+e);
        }
   }
   
    /** hoja de ejercicio de Java (Entregada 01.02.2022 y clase 03.02.2022)
     ** clase 08/02/2022 
     *
     *
     *hacemos unas consultas sobre las diferentes tablas para saber cuanto cuesta y como la insertamos en la commande
     *CON ESTE EJERCICIO TRABAJAMOS DOS COSAS: 1 SQL Y COMO MANEJAR LA BASE DE DATOS Y 2. HACER CODIGO EN JAVA
     *EL OBJETIVO ES DOMINAR LAS OPERACIONES, Y APRENDER HACER LAS COSAS DE DB
     * (Revisar con Edwin)MODEL CONTROL << CONNECTE A LA BASE DE DONNESS / CONTROLER / MODEL C'EST LA INTERFACE
     * max(id)
     * count(*) from
     * metodos que ya existen en SQL, para hacer las consultas y la actualizaci�n
     * sum (qte)
     * now()
     * 
     * @param args the command line arguments
     */

    public static void main(String[] args){
    	Client c1 = new Client("Pierre","Tourmente","1 Jeanne Maillotte",59000,"Lille","pierre@mail.com");
        insertClient(c1);
        Client c2 = new Client("David","Greca","1 Pompidu",59000,"Lille","david@mail.com");
        insertClient(c2);
        Client c3 = new Client("Andre","Felix","1 Charles de Gaule",59000,"Lille","andre@mail.com");
        insertClient(c3);
        Client c4 = new Client("Thomas","Maillot","1 Bd National",59000,"Lille","thomas@mail.com");
        insertClient(c4);
        Client c5 = new Client("Simon","Desped","1 Champs Elisees",59000,"Lille","simon@mail.com");
        insertClient(c5);
        
        Produit p1 = new Produit("Lenovo P50", 10);
        insertProduit(p1);
        Prix pr1 = new Prix(p1.getId_produit(), 1500F);
        insertPrix(pr1);
        Produit p2 = new Produit("Lenovo P51", 10);
        insertProduit(p2);
        Prix pr2 = new Prix(p2.getId_produit(), 1600F);
        insertPrix(pr2);
        Produit p3 = new Produit("Lenovo P52", 10);
        insertProduit(p3);
        Prix pr3 = new Prix(p3.getId_produit(), 1700F);
        insertPrix(pr3);
        Produit p4 = new Produit("Lenovo P53", 10);
        insertProduit(p4);
        Prix pr4 = new Prix(p4.getId_produit(), 1800F);
        insertPrix(pr4);
        Produit p5 = new Produit("Lenovo P54", 10);
        insertProduit(p5);
        Prix pr5 = new Prix(p5.getId_produit(), 1900F);
        insertPrix(pr5);
        Produit p6 = new Produit("Lenovo P55", 10);
        insertProduit(p6);
        Prix pr6 = new Prix(p6.getId_produit(), 2000F);
        insertPrix(pr6);
        Produit p7 = new Produit("Lenovo P56", 10);
        insertProduit(p7);
        Prix pr7 = new Prix(p7.getId_produit(), 2100F);
        insertPrix(pr7);
        Produit p8 = new Produit("Lenovo P57", 10);
        insertProduit(p8);
        Prix pr8 = new Prix(p8.getId_produit(), 2200F);
        insertPrix(pr8);
        Produit p9 = new Produit("Lenovo P58", 10);
        insertProduit(p9);
        Prix pr9 = new Prix(p9.getId_produit(), 2300F);
        insertPrix(pr9);
        Produit p10 = new Produit("Lenovo P59", 10);
        insertProduit(p10);
        Prix pr10 = new Prix(p10.getId_produit(), 2400F);
        insertPrix(pr10);
        
        Commande commande1 = new Commande(c1.getId_client(), (Date) Calendar.getInstance().getTime(), 10000F);
        insertCommande(commande1);
        DetailCommande detailCommande = new DetailCommande(commande1.getId_comm(), p1.getId_produit(),5);
        insertDetailCommande(detailCommande);
        Paiement paiment1 = new Paiement((Date) Calendar.getInstance().getTime(), commande1.getId_comm());
        insertPaiment(paiment1);
        
    	selectAllClients();
    	//selectProduit();
    	//Produits p1 = new Produit(1, "Designa", "IBM", "0", 100.0, 10);
    	//insertProduit1();
    	//insertProduit1();
    	//selectAllProducts()
    }
}   

//Hacer un metodo scanner para capturar los datos y luego el metodo de insertion
// el tema de la date se puede incluir la de hoy en el codigo


