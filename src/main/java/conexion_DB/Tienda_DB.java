/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_DB;

import backend.Tienda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lguilln
 */
public class Tienda_DB extends Conexion{
        
    public boolean insertarTienda(Tienda tienda){

        PreparedStatement ps = null;
        Connection conexion = obtenerConexion();
        ResultSet rs = null;
         

        String sql = "INSERT INTO TIENDA (Nombre_Tienda, Direccion, Codigo_Tienda, Telefono_1, Telefono_2, Correo_Electronico, Horario) VALUES(?,?,?,?,?,?,?)";
        
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, tienda.getNombreTienda());
            ps.setString(2, tienda.getDireccionTienda());
            ps.setString(3, tienda.getCodigoTienda());
            ps.setString(4, tienda.getTelefono1());
            ps.setString(5, tienda.getTelefono2());
            ps.setString(6, tienda.getCorreoElectronico());
            ps.setString(7, tienda.getHorarioTienda());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Tienda_DB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    
         }
     
    
}
