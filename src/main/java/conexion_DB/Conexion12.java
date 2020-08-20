/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_DB;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lguilln
 */
public class Conexion12 {
 
    private Connection conexion = null;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "LGuilln";
    private final String password = "12345";
    private final String url = "jdbc:mysql://localhost:3306/BASE_INTELAF";
    
    public void conexionDB(){
        conexion = null;
        try {
            Class.forName(driver);
            conexion = (Connection) DriverManager.getConnection(url, user, password);
            if(conexion != null){
                System.out.println("Conexion Establecida");
            }
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al Conectar "+e);
        }
      
    }
    
    public Connection getConnection(){
        return conexion;
    }
    
    //metodo encargado de salir de la base de datos
    public void desconectarDB(){
        conexion = null;
        if(conexion == null){
            System.out.println("Conexion Terminada");
        }
    }

    void Conexion_DB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
