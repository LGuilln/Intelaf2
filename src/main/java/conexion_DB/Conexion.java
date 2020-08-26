/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_DB;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lguilln
 */
public class Conexion {
 
    private Connection conexion = null;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "root";
    private final String password = "12345";
    private final String url = "jdbc:mysql://localhost:3306/B1";
    private final String segura = "jdbc:mysql://host:port/database?useSSL=false";
    

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

        public ResultSet getTodo(String consulta) {
        Connection conexion = obtenerConexion();
        Statement st;
        ResultSet datos = null;
        try {
            st = conexion.createStatement();
            datos = st.executeQuery(consulta);
        } catch (Exception e) {
        }
        return datos;
    }
    
    //metodo encargado de salir de la base de datos
    public void desconectarDB(){
        conexion = null;
        if(conexion == null){
            System.out.println("Conexion Terminada");
        }
    }

    
        
    
    
    
}
