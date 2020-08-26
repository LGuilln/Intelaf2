/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import conexion_DB.Conexion;
import frontend.Bienvenida;
import frontend.Inicio_Empleados;
import frontend.Pantalla_Cargar;
import java.sql.SQLException;

/**
 *
 * @author lguilln
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        Conexion cb1 = new Conexion();
        cb1.obtenerConexion();
        usuario user = new usuario();
        Tienda tienda = user.verificarEstadoDB();

        if (tienda == null) {
            Pantalla_Cargar archivoEntrada = new Pantalla_Cargar();
            archivoEntrada.setVisible(true);

        } else {
            Bienvenida iniciar = new Bienvenida();
            iniciar.setVisible(true);
        }

    }

}
