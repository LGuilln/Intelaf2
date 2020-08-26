/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_DB;

import backend.Tiempo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lguilln
 */
public class Tiempo_DB extends Conexion {

    public boolean insertarTiempo(Tiempo tiempo) {

        PreparedStatement ps = null;
        Connection conexion = obtenerConexion();

        String sql = "INSERT INTO TIEMPO (Tienda1,Tienda2,Tiempo_Dias) VALUES(?,?,?)";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, tiempo.getTienda1());
            ps.setString(2, tiempo.getTienda2());
            ps.setInt(3, tiempo.getTiempoDias());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Tiempo_DB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
