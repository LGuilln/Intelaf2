/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_DB;

import backend.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lguilln
 */
public class Cliente_DB extends Conexion{
         public boolean insertarCliente(Cliente cliente){

        PreparedStatement ps = null;
        Connection conexion = obtenerConexion();

        String sql = "INSERT INTO CLIENTE (Nombre_Cliente,NIT_Cliente,Telefono,Credito_Cliente,DPI,Correo_Electronico,Direccion) VALUES(?,?,?,?,?,?,?)";
        
        
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, cliente.getNombreCliente());
            ps.setString(2, cliente.getNITCliente());
            ps.setString(3, cliente.getTelefono());
            ps.setDouble(4, cliente.getCreditoCliente());
            ps.setString(5, cliente.getDPICliente());
            ps.setString(6, cliente.getCorreoElectronico());
            ps.setString(7, cliente.getDireccion());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Cliente_DB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    
         }
}
