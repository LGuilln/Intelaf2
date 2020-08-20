/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_DB;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lguilln
 */
public class Conexion {
 
    private Connection conexion = null;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "LGuilln";
    private final String password = "12345";
    private final String url = "jdbc:mysql://localhost:3306/BASE_INTELAF";
    

        public Connection obtenerConexion() {
        try {
            conexion = (Connection) DriverManager.getConnection(url, user, password);
                        if(conexion != null){
                System.out.println("Conexion Establecida");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al Conectar "+ex);
        }
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
