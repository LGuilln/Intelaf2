/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_DB;

import backend.Generar_Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lguilln
 */
public class Generar_Pedido_DB extends Conexion {

    public boolean insertarGenerar_Pedido(Generar_Pedido generarPedido) {

        PreparedStatement ps = null;
        Connection conexion = obtenerConexion();

        String sql = "INSERT INTO GENERAR_PEDIDO(Codigo_Pedido,Codigo_Producto,Cantidad, Total_P) VALUES(?,?,?,?)";
        
               
        
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, generarPedido.getCodigoPedido());
            ps.setString(2, generarPedido.getCodigoProducto());
            ps.setInt(3, generarPedido.getCantidad());
            ps.setDouble(4, generarPedido.getTotalP());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Generar_Pedido_DB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
