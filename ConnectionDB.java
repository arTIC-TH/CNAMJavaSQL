package application;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    /**
     * 
     * @return 
     */
    public static Connection getConnection() {
        Connection conn = null;
        // conectar
        try {      
            
            String dbURL = "jdbc:mysql://localhost:3306/plantes" ;
            
            conn = DriverManager.getConnection(dbURL, "root", "770829-Terol");
            if( conn != null ) 
                System.out.println ( "Conectado, ok" );
            } 
        catch( SQLException ex) {
            System.out.println ( "Error a conexion DB" );
            ex.printStackTrace();
        }
        
        return conn;
    }
    
    public static void main(String[] args){
        getConnection();
    }
}
