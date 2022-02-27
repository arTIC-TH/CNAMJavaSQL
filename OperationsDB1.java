package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OperationsDB1 {
	
	public static Connection conn;
	
	/*
	 * Un metodo para preparar la insercion de datos en el cliente
	 */
	public static void selectClient(){
        
        if (conn == null){ 
            conn = ConnectionDB.getConnection();
        }
        
        //~[°°]~/ String sql = "select * from client";
        public static void selectProduit(){
        
        	PreparedStatement statement = null;
        
        try{
            statement = conn.prepareStatement(sql);
            //statement.setInt(1 , 2);
            ResultSet result = statement.executeQuery( sql );
            int count = 0;
            while ( result.next ()){
            	//~[°°]~/   Integer numCli = result.getInt(1);
            	//~[°°]~/   String nom = result.getString(2);
            	//~[°°]~/   String ville = result.getString (3);
            	//~[°°]~/   System . out . println ("NumCli : " + numCli + "Nom: " + nom + " ville : " + ville );

            }
        }catch(Exception e){
            System.out.println (" Fail !"+e);
        }
        
        
    }
	
      //~[°°]~/ public static void insertClient(){
     public static void insertProduit(){  
        if (conn == null){ 
            conn = ConnectionDB.getConnection();
        }
        
      /*/~[°°]~/  String sql = "INSERT INTO Commande (libelle_court_prod,date_creat_prod,quantite_prod,message_prod)  VALUES ("+id_client+",now(),1000)"; 
       * ~[°°]~ */
        String sql = "INSERT INTO produit (Designation , Marque , PrixUnit , QtStock , NumCat )  VALUES (? ,? ,? ,? ,? )";
        
        PreparedStatement statement = null;
        
        try{
            statement = conn.prepareStatement(sql);
            
            /* ~[°°]~ 	statement.setInt(1 , 8); /* ~[°°]~  NOTA CLASE: Aqui se debe tomar el valor maximo y sumarle uno al indice, para que sea automatico * ~[°°]~ */
            /* ~[°°]~ 	statement.setString(2 , "MUGLOSO JAVA");
            /* ~[°°]~ 	statement.setString(3 , "De la rue");
            */
            
            
            int rowsInserted = statement.executeUpdate();
            if ( rowsInserted > 0) {
                System.out.println (" Succes !");
            }
        }catch(Exception e){
            System.out.println (" Fail !"+e);
        }
   }
    /* insertar producto
     * 
     */
       
       
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
     * metodos que ya existen en SQL, para hacer las consultas y la actualización
     * sum (qte)
     * now()
     * 
     * @param args the command line arguments
     */
    
     public static void main(String[] args){
    	//insertClient();
    	selectClient();
    	//selectProduit();
    }
    
}

//Hacer un metodo scanner para capturar los datos y luego el metodo de insertion
// el tema de la date se puede incluir la de hoy en el codigo


	/* ~[°°]~ 	public static void commandeclient (
    /* ~[°°]~ 	statement.setString(2 , "MUGLOSO JAVA");
    /* ~[°°]~ 	statement.setString(3 , "De la rue");
    */
	
	//~[°°]~/ public static void insertClient(){
    public static void commandeclient(connection conn, int num){  
       if (conn == null){ 
           conn = ConnectionDB.getConnection();
       }
       
	