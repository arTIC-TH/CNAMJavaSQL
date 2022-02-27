package application;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

public class Operation_produit {
	
	public static Connection conn;
}

/*
 * Un metodo para preparar la inserción de datos en tabla producto
 */

	public static void selectProduit(){
    
    if (conn == null){ 
        conn = ConnectionDB.getConnection();
    }
    
    String sql = "select * from produit";
    
    PreparedStatement statement = null;
    
    try{
        statement = conn.prepareStatement(sql);
        //statement.setInt(1 , 2);
        ResultSet result = statement.executeQuery( sql );
        int count = 0;
        while ( result.next ()){
        	varchar(20) Designation = result.getvarchar(1);
            varchar(20) Marque = result.getvarchar(2);
            decimal(7,2) PrixUnit = result.getdecimal(3);
            smallint QtStock = result.getsmallint(4);
            char(2) NumCat = result.getchar(5);
            System . out . println ("Designation : " + Designation + "Marque: " + Marque + " PrixUnit : " + PrixUnit +  " QtStock : " + QtStock " NumCat : " + NumCat);
        
        }catch(Exception e){
        	System.out.println (" Fail !"+e);
        }
    
    
    }
    
public static void insertproduit(){
        
        if (conn == null){ 
            conn = ConnectionDB.getConnection();
        }
        
        String sql = "INSERT INTO produit (Designation , Marque , PrixUnit , QtStock , NumCat )  VALUES (? ,? ,?,? ,? )";
               
        PreparedStatement statement = null;
        
        try{
            statement = conn.prepareStatement(sql);
            //statement.setSmallint(1 , 6);
            statement.setVarchar(2 , "20");
            statement.setVarchar(3 , "30");
            statement.setdecimal(4 , "4,2");
            statement.setSmallint(5 , "100");
            statement.setChar(6 , "15");
            int rowsInserted = statement.executeUpdate();
            if ( rowsInserted > 0) {
                System.out.println (" Succes !");
            }
        }catch(Exception e){
            System.out.println (" Fail !"+e);
        }
       
    }
    
}
  
	 public static void main(String[] args) {
	    	//insertClient();
	    	//selectClient();
	    	//selectProduit();
		 	insertProduit();
	    }
	    
	}
	
	}
