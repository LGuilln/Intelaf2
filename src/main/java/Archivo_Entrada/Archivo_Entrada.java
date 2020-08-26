/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo_Entrada;

import backend.Cliente;
import backend.Empleado;
import backend.Generar_Pedido;
import backend.Pedido;
import backend.Producto;
import backend.Tiempo;
import backend.Tienda;
import conexion_DB.Cliente_DB;
import conexion_DB.Empleado_DB;
import conexion_DB.Generar_Pedido_DB;
import conexion_DB.Pedido_DB;
import conexion_DB.Pedido_DB12;
import conexion_DB.Producto_DB;
import conexion_DB.Tiempo_DB;
import conexion_DB.Tienda_DB;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lguilln
 */
public class Archivo_Entrada {
    
    private final String NOMBRE = "nombre "; 
    private final String NINGUNO = "ninguno";
    private final String DIRECCION = "direccion ";
    private final String FABRICANTE = "fabricante ";
    private final String ENTERO = "num";
    private final String DECIMAL = "decimal";
    private final String FECHA = "fecha";
    private final String TIENDA = "TIENDA";
    private final String TIEMPO = "TIEMPO";
    private final String PRODUCTO = "PRODUCTO";
    private final String EMPLEADO = "EMPLEADO";
    private final String CLIENTE = "CLIENTE";
    private final String PEDIDO = "PEDIDO";
    
    private final String ERROR_ENTRADA_DATOS = "Error en la entrada de datos";
    private final String ERROR_TIPO_DATOS = "Error en el tipo de datos";
    
    public void leerArchivo(File archivo) throws FileNotFoundException, IOException
    {
        String cadena;
         try {
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null)
        {
           leerDatos(cadena);
            } 
         }
         catch (IOException e) {
            }                
    }
 
      public void leerDatos (String archivoD){

        if(archivoD.contains("TIENDA"))
        {  
            leerTienda(archivoD);
        }
        else if(archivoD.contains("EMPLEADO"))
            {    
                leerEmpleado(archivoD);
            }
        else if(archivoD.contains("CLIENTE"))
            {    
                leerCliente(archivoD);
            }
        else if(archivoD.contains("TIEMPO"))
            {    
            leerTiempo(archivoD);
          //     datosPedido(datos);
            }
        else if (archivoD.contains("PRODUCTO"))
            {
            leerProducto(archivoD);
            }
        else if(archivoD.contains("PEDIDO"))
            {
            leerPedido(archivoD);
           //     leerGenerarPedido(archivoD);
            

            }
        else {
            System.out.println("ERROR, NO HAY DATOS");
        }
    }
    
   
      public void leerTienda(String archivoD){
        String [] partes = archivoD.split(",");
        Tienda nuevo = new Tienda(partes[1],partes[2],partes[3],partes[4]);
        conexion_DB.Tienda_DB llenar = new Tienda_DB();
        llenar.insertarTienda(nuevo);    
        }
      
        public void leerEmpleado(String archivoD){
        String [] partes = archivoD.split(",");
        Empleado nuevo = new Empleado(partes[1],partes[2],partes[3],partes[4]);
        conexion_DB.Empleado_DB llenar = new Empleado_DB();
        llenar.insertarEmpleado(nuevo);    
        }
        
          public void leerCliente (String archivoD){
        String [] partes = archivoD.split(",");
        Double creditoCompra = Double.parseDouble(partes[4]);
        Cliente nuevo = new Cliente(partes[1], partes[2], partes[3], creditoCompra);
         conexion_DB.Cliente_DB llenar = new Cliente_DB();
        llenar.insertarCliente(nuevo);    
        }
    
       public void leerTiempo (String archivoD){
        String [] partes = archivoD.split(",");
        int tiempoDias = Integer.parseInt(partes[3]); 
        Tiempo nuevo = new Tiempo(partes[1], partes[2], tiempoDias);
        conexion_DB.Tiempo_DB llenar = new Tiempo_DB();
        llenar.insertarTiempo(nuevo); 
        }
       
        public void leerProducto(String archivoD){
        String [] partes = archivoD.split(",");
        int cantidadProducto = Integer.parseInt(partes[4]);
      //  int garantia_producto = Integer.parseInt(partes[8]);
        Double precioProducto = Double.parseDouble(partes[5]);
        Producto nuevo = new Producto (partes[1], partes[2], partes[3], cantidadProducto, precioProducto, partes[6] );
        conexion_DB.Producto_DB llenar = new Producto_DB();
        llenar.insertarProducto(nuevo); 

        }   
         
        public void leerPedido(String archivoD){
        String [] partes = archivoD.split(",");
        int codigoPedido = Integer.parseInt(partes[1]);
        int cantidad = Integer.parseInt(partes[7]);
        Double total = Double.parseDouble(partes[8]);
        Double anticipoTotal = Double.parseDouble(partes[9]);
        Pedido nuevo = new Pedido (codigoPedido, partes[2], partes[3], partes[4], partes[5],partes[6],cantidad,total, anticipoTotal);
        conexion_DB.Pedido_DB llenar = new Pedido_DB();
        llenar.insertarPedido(nuevo);  
           
        
        }
}