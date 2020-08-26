/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_DB;

import backend.Empleado;
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
public class Empleado_DB extends Conexion{
         
    
    public boolean insertarEmpleado(Empleado empleado){

        PreparedStatement ps = null;
        Connection conexion = obtenerConexion();

        String sql = "INSERT INTO EMPLEADO (Nombre_Empleado,Codigo_Empleado,Telefono,DPI,NIT_Empleado,Correo_Electronico,Direccion) VALUES(?,?,?,?,?,?,?)";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, empleado.getNombreEmpleado());
            ps.setString(2, empleado.getCodigoEmpleado());
            ps.setString(3, empleado.getTelefono());
            ps.setString(4, empleado.getDPI());
            ps.setString(5, empleado.getNITEmpleado());
            ps.setString(6, empleado.getCorreoElectronico());
            ps.setString(7, empleado.getDireccion());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Empleado_DB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    
         }

    
    
    public Empleado obtenerEmpleado(){
         Empleado empleado = null;
         Conexion conexion = new Conexion();
        
        ResultSet rs = conexion.getTodo("SELECT * EMPLEADO WHERE Codigo_Empleado = ?");
        try{
            while (rs.next()){
                empleado = new Empleado(rs.getString("Nombre_Empleado"), rs.getString("Codigo_Empleado"), rs.getString("Telefono"), rs.getString("NIT_Empleado"));
            }
        }catch(Exception e){
            
        }
              return empleado;  
     }



    
}
