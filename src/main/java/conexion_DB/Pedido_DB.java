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
public class Pedido_DB extends Conexion{
    
    
    public boolean insertarPedido(Pedido pedido){

        

        String sql = "INSERT INTO GENERAR_PEDIDO(Codigo_Pedido,Fecha1,Codigo_Producto,Cantidad, Total_P,Anticipo_Total,En_Curso) "
                + "VALUES(?,?,?,?,?,?,?)";
                 //   + "ON DUPLICATE KEY UPDATE Codigo_Pedido=Codigo_Pedido, Total=Total+?,Total_Restante=Total-Anticipo_Total" ;
          
                 
             String sql1 = "INSERT INTO PEDIDO (Codigo_Pedido,Tienda1, Tienda2, Fecha1, NIT_Cliente, Total, Anticipo_Total,Total_Restante,Fecha2,En_Curso) "
                + "VALUES(?,?,?,?,?,"
                     + "?,?,?,"
                     + "(SELECT ADDDATE(?,(SELECT Tiempo_Dias FROM TIEMPO WHERE Tienda1=? AND Tienda2=? OR Tienda1=? AND Tienda2=? LIMIT 1))),"
                + "?) ON DUPLICATE KEY UPDATE Codigo_Pedido=Codigo_Pedido, Total_Restante=Total-Anticipo_Total"
                     ;
            //(SELECT SUM(Total_P) FROM GENERAR_PEDIDO WHERE Anticipo_Total=?)
             //SELECT ADDDATE('2020-06-02', (SELECT Tiempo_Dias FROM TIEMPO WHERE Tienda1='ABC-1' AND Tienda2='ABC-2' OR Tienda1='ABC-2' AND Tienda2='ABC-1' LIMIT 1));

             
        PreparedStatement ps = null;
        PreparedStatement ps1 = null;
        Connection conexion = obtenerConexion();
                
                
        try {
            
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, pedido.getCodigoPedido());
            ps.setString(2, pedido.getFecha1());
            ps.setString(3, pedido.getCodigoProducto());
            ps.setInt(4, pedido.getCantidad());
            ps.setDouble(5, pedido.getTotalP());
            ps.setDouble(6, pedido.getAnticipoTotal());
            ps.setString(7,pedido.getCurso());
            
            ps.executeUpdate();
            
            ps1 = conexion.prepareStatement(sql1);
            ps1.setInt(1, pedido.getCodigoPedido());
            ps1.setString(2, pedido.getTienda1());
            ps1.setString(3, pedido.getTienda2());
            ps1.setString(4, pedido.getFecha1());
            ps1.setString(5, pedido.getNITCliente());
            ps1.setDouble(6, pedido.getTotal());
            ps1.setDouble(7, pedido.getAnticipoTotal());
            ps1.setDouble(8, pedido.getTotalRestante());
            ps1.setString(9, pedido.getFecha1());
            ps1.setString(10, pedido.getTienda1());
            ps1.setString(11, pedido.getTienda2());
            ps1.setString(12, pedido.getTienda2());
            ps1.setString(13, pedido.getTienda1());
            ps1.setString(14,pedido.getCurso());
            //ps1.setInt(16, pedido.getCodigoPedido());
           
            ps1.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Pedido_DB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    
        
        

        
        
         } 


}
