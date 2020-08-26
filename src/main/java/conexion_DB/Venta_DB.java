/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_DB;

import backend.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lguilln
 */
public class Venta_DB extends Conexion {

    public boolean insertarProduto(Producto producto) {

        PreparedStatement ps = null;
        Connection conexion = obtenerConexion();

        String sql = "INSERT INTO PRODUCTO (Nombre_Producto,Fabricante,Codigo_Producto,Cantidad_Producto,Precio_Producto,Codigo_Tienda,Descripcion,Garantia) VALUES(?,?,?,?,?,?,?,?)";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getFabricanteProducto());
            ps.setString(3, producto.getCodigoProducto());
            ps.setInt(4, producto.getCantidadProducto());
            ps.setDouble(5, producto.getPrecioProducto());
            ps.setString(6, producto.getCodigoTienda());
            ps.setString(7, producto.getDescripcion());
            ps.setInt(8, producto.getGarantia());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Venta_DB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
