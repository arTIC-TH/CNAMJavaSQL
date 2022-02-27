package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
            int count = 0;
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
	
	public static void insertClient(){
        
        if (conn == null){ 
            conn = ConnectionDB.getConnection();
        }
        
        String sql = "INSERT INTO client (NumCli , Nom , ville )  VALUES (? ,? ,?)";
        
        PreparedStatement statement = null;
        
        try{
            statement = conn.prepareStatement(sql);
            statement.setInt(1 , 9); /* aqui se debe tomar el valor maximo y sumarle uno al indice, para que sea automatico*/
            statement.setString(2 , "Gato vaca");
            statement.setString(3 , "Du batiment");
            int rowsInserted = statement.executeUpdate();
            if ( rowsInserted > 0) {
                System.out.println (" Succes !");
            }
        }catch(Exception e){
            System.out.println (" Fail !"+e);
        }
   }
	
	 public static void main(String[] args){
    	//insertClient();
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


