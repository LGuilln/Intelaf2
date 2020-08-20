/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import conexion_DB.Conexion;
import conexion_DB.Conexion12;

/**
 *
 * @author lguilln
 */
public class Main {
    
    public static void main(String[] args) {
               
       //new Inicio().setVisible(true);
        
        Conexion cb1= new Conexion();
        cb1.obtenerConexion(); 
        
        
        //Instanciamos y mostramos el menu principal
        //MenuPrincipal mp = new MenuPrincipal();
        //mp.show();
    }
    
    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
