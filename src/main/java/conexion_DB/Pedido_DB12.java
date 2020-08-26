/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_DB;

import backend.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lguilln
 */
public class Pedido_DB12 extends Conexion{
    
    
    public boolean insertarPedido(Pedido pedido){

        

        String sql = "INSERT INTO PEDIDO (Codigo_Pedido,Tienda1, Tienda2, Fecha1, NIT_Cliente, Total, Anticipo_Total,Total_Restante,Fecha2,Tiempo_Dias,En_Curso) "
                + "VALUES(?,?,?,?,?,?,?,?,?,"
                + "(SELECT Tiempo_Dias FROM TIEMPO WHERE Tienda1=? AND Tienda2=? OR Tienda1=? AND Tienda2=? LIMIT 1),?) ON DUPLICATE KEY UPDATE Codigo_Pedido=Codigo_Pedido,Total_Restante=Total-Anticipo_Total";
             //   + "ON DUPLICATE KEY UPDATE Codigo_Pedido=Codigo_Pedido, Total=Total+?,Total_Restante=Total-Anticipo_Total" ;
        
             String sql1 = "INSERT INTO GENERAR_PEDIDO(Codigo_Pedido,Codigo_Producto,Cantidad, Total_P) VALUES(?,?,?,?)"
                
                     
                  //   SELECT SUM(Total_P) FROM GENERAR_PEDIDO WHERE Codigo_Pedido=?
                     
                
                /*String sqlDoble="INSERT INTO GENERAR_PEDIDO(Codigo_Pedido,Codigo_Producto,Cantidad,CAntidad_Producto)"
                +"VALUES(?,?,?,?)";/*
                +"(SELECT Id_Tiempo FROM TIEMPO WHERE Tienda_Origen=? AND Tienda_Destino=? LIMIT 1),"
                + "(SELECT Tiempo FROM TIEMPO WHERE Tienda_Origen=? AND Tienda_Destino=? LIMIT 1))";*/;
         
      
        PreparedStatement ps = null;
        PreparedStatement ps1 = null;
        Connection conexion = obtenerConexion();
                
                
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, pedido.getCodigoPedido());
            ps.setString(2, pedido.getTienda1());
            ps.setString(3, pedido.getTienda2());
            ps.setString(4, pedido.getFecha1());
            ps.setString(5, pedido.getNITCliente());
            //ps.setString(6, pedido.getCodigoProducto());
            //ps.setInt(7, pedido.getCantidad());
            ps.setDouble(6, pedido.getTotal());
            ps.setDouble(7, pedido.getAnticipoTotal());
            ps.setDouble(8, pedido.getTotalRestante());
            ps.setString(9, pedido.getFecha2());
            ps.setString(10, pedido.getTienda1());
            ps.setString(11, pedido.getTienda2());
            ps.setString(12, pedido.getTienda2());
            ps.setString(13, pedido.getTienda1());
            ps.setString(14,pedido.getCurso() );
            ps.executeUpdate();
            
   
            ps1 = conexion.prepareStatement(sql1);
            ps1.setInt(1, pedido.getCodigoPedido());
            ps1.setString(2, pedido.getCodigoProducto());
            ps1.setInt(3, pedido.getCantidad());
            ps1.setDouble(4, pedido.getTotalP());
            ps1.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Pedido_DB12.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    
        
        

        
        
         } 


}
