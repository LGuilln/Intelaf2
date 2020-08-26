/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import conexion_DB.Empleado_DB;
import conexion_DB.Tienda_DB;

/**
 *
 * @author lguilln
 */
public class usuario {
 public Empleado iniciarSesionEmpleado (String codigo){
        Empleado_DB empl = new Empleado_DB();
        Empleado e = empl.obtenerEmpleado();
        return e;
    }   
  public Tienda verificarEstadoDB(){
        Tienda_DB tiendaExistente = new Tienda_DB();
        Tienda t = tiendaExistente.obtenerTienda();
        return t;
    }
 
}
