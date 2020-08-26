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
        System.out.println(archivoD);
        System.out.println("Parte 0 Tabla: "+partes[0]);
        System.out.println("Parte 1 Nombre: "+partes[1]);
        System.out.println("Parte 2 Direccion: "+partes[2]);
        System.out.println("Parte 3 CodigoTienda: "+partes[3]);
        System.out.println("Parte 4 Telefono1: "+partes[4]);
        
        Tienda nuevo = new Tienda(partes[1],partes[2],partes[3],partes[4]);
        conexion_DB.Tienda_DB llenar = new Tienda_DB();
        llenar.insertarTienda(nuevo);    
        }
      
        public void leerEmpleado(String archivoD){
        String [] partes = archivoD.split(",");
        System.out.println(archivoD);
        System.out.println("Parte 0 Tabla: "+partes[0]);
        System.out.println("Parte 1 Nombre: "+partes[1]);
        System.out.println("Parte 2 CodigoEmpleado: "+partes[2]);
        System.out.println("Parte 3 Telefono: "+partes[3]);
        System.out.println("Parte 4 DPI: "+partes[4]);
        
 
        Empleado nuevo = new Empleado(partes[1],partes[2],partes[3],partes[4]);
        conexion_DB.Empleado_DB llenar = new Empleado_DB();
        llenar.insertarEmpleado(nuevo);    
        }
        
          public void leerCliente (String archivoD){
        String [] partes = archivoD.split(",");
        Double creditoCompra = Double.parseDouble(partes[4]);
        System.out.println(archivoD);
        System.out.println("Parte 0 Tabla: "+partes[0]);
        System.out.println("Parte 1 Nombre: "+partes[1]);
        System.out.println("Parte 2 NIT: "+partes[2]);
        System.out.println("Parte 3 Telefono: "+partes[3]);
        System.out.println("Parte 4 Credito de Compra: "+creditoCompra);
        Cliente nuevo = new Cliente(partes[1], partes[2], partes[3], creditoCompra);
         conexion_DB.Cliente_DB llenar = new Cliente_DB();
        llenar.insertarCliente(nuevo);    
        }
    
       public void leerTiempo (String archivoD){
        String [] partes = archivoD.split(",");
        int tiempoDias = Integer.parseInt(partes[3]);
        System.out.println(archivoD);
        System.out.println("Parte 0 Tabla: "+partes[0]);
        System.out.println("Parte 1 TiendaOrigen: "+partes[1]);
        System.out.println("Parte 2 TiendaDestino: "+partes[2]);
        System.out.println("Parte 3 Tiempo en Dias: "+tiempoDias);
        
        Tiempo nuevo = new Tiempo(partes[1], partes[2], tiempoDias);
        conexion_DB.Tiempo_DB llenar = new Tiempo_DB();
        llenar.insertarTiempo(nuevo); 
        }
       
        public void leerProducto(String archivoD){
        String [] partes = archivoD.split(",");
        int cantidadProducto = Integer.parseInt(partes[4]);
      //  int garantia_producto = Integer.parseInt(partes[8]);
        Double precioProducto = Double.parseDouble(partes[5]);
        System.out.println(archivoD);
        System.out.println("Parte 0 Tabla: "+partes[0]);
        System.out.println("Parte 1 Nombre: "+partes[1]);
        System.out.println("Parte 2 Fabricante: "+partes[2]);
        System.out.println("Parte 3 CodigoProducto: "+partes[3]);
        System.out.println("Parte 4 Cantidad: "+cantidadProducto);
        System.out.println("Parte 5 Precio: "+precioProducto);
        System.out.println("Parte 6 CodigoTienda: "+partes[6]);;
        Producto nuevo = new Producto (partes[1], partes[2], partes[3], cantidadProducto, precioProducto, partes[6] );
        conexion_DB.Producto_DB llenar = new Producto_DB();
        llenar.insertarProduto(nuevo); 
        //  String id_tienda=partes[6];
             //   int cantidad_producto=Integer.parseInt(partes[4]);
             //, partes[7], garantia_producto
        }   
         
        public void leerPedido(String archivoD){
        String [] partes = archivoD.split(",");
        int codigoPedido = Integer.parseInt(partes[1]);
        int cantidad = Integer.parseInt(partes[7]);
        Double total = Double.parseDouble(partes[8]);
        Double anticipoTotal = Double.parseDouble(partes[9]);
        System.out.println(archivoD);
        System.out.println("Parte 0 Tabla: "+partes[0]);
        System.out.println("Parte 1 Codigo: "+codigoPedido);
        System.out.println("Parte 2 tienda1: "+partes[2]);
        System.out.println("Parte 3 tienda2: "+partes[3]);
        System.out.println("Parte 4 fecha1: "+partes[4]);
        System.out.println("Parte 5 nitclientes: "+ partes[5]);
        System.out.println("Parte 6 productos: "+ partes[6]);
        System.out.println("Parte 9 cantidad: "+ cantidad); 
        System.out.println("Parte 6  total: "+ total);
        System.out.println("Parte 7 anticipostotal: "+ anticipoTotal);
        
        
        
        Pedido nuevo = new Pedido (codigoPedido, partes[2], partes[3], partes[4], partes[5],partes[6],cantidad,total, anticipoTotal);
        conexion_DB.Pedido_DB llenar = new Pedido_DB();
        llenar.insertarPedido(nuevo);  
           
        
        }

    
       
                
                
                
       /* public void leerGenerarPedido(String archivoD){
        String [] partes = archivoD.split(",");
        int codigoPedido = Integer.parseInt(partes[1]);
        Double totalP = Double.parseDouble(partes[8]);
        int cantidad = Integer.parseInt(partes[7]);
        System.out.println(archivoD);
        System.out.println("Parte 0 Tabla: "+partes[0]);
        System.out.println("Parte 1 No. Pedido: "+codigoPedido);
        System.out.println("Parte 2 Nombre: "+partes[6]);
        System.out.println("Parte 3 Cantidad: "+cantidad);
        System.out.println("Parte 4 Total: "+totalP);
        
        Generar_Pedido nuevo = new Generar_Pedido (codigoPedido,partes[6],cantidad,totalP);
        conexion_DB.Generar_Pedido_DB llenar = new Generar_Pedido_DB();
        llenar.insertarGenerar_Pedido(nuevo);    
        
        }
        
        //Generar_Pedido nuevo = new Generar_Pedido (codigoPedido,partes[6],cantidad);
        //conexion_DB.Generar_Pedido_DB llenar = new Generar_Pedido_DB();
        //llenar.insertarGenerar_Pedido(nuevo);  
        
        /*String id_producto= partes[6];
                int cantidad_producto = Integer.parseInt(partes[7]);
                DESCRIPCION_PEDIDO subPedido = new DESCRIPCION_PEDIDO(id_producto, cantidad_producto);
        /*/}   
  
   /*private final String nombre = "nombre"; 
    private final String id_entidades = "id_entidades";
    private final String direccion = "direccion ";
    private final String fabricante = "fabricante ";
    private final String entero = "numero";
    private final String decimal = "decimal";
    private final String fecha = "fecha";
    private final String tienda = "tienda";
    private final String tiempo = "tiempo";
    private final String producto = "producto";
    private final String empleado = "empleado";
    private final String cliente = "cliente";
    private final String pedido = "pedido";
    
    private final String error_datosingresados = "Error en la entrada de datos";
    private final String error_datostipo = "Error en el tipo de datos";
    
    public void leerArchivo(File archivo){
        try{//se agrega un capturador de errores 
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String aux = "";
            
            //Leemos y analizamos todaas las lineas de texto del archivo (linea por linea)
            while(aux != null){
                aux = br.readLine();
                if(aux == null){
                    break;
                }
            //    analizarTipoDato(aux);
            }
        }catch(Exception e){
            System.out.println("Hubo un error en la carga de archivo");
        }   
    }
    
   public void analizarTipoDato(String linea){
        boolean validacionTipo = true;//Dato que nos servira para validar la primera cadena de caracteres
        String[] auxCadenas;   // contendra el conjunto de datos
        String restricciones = "";//contendra las distintas restricciones de cada tipo
        auxCadenas = linea.split(",");                 
            switch(auxCadenas[0]){
                case tienda:
                    //DATOS: Nombre(String), Direccion(String), Codigo(String), Telefono(String)                    
                    restricciones = nombre +"-"+DIRECCION+"-"+NINGUNO+"-"+ENTERO;
                    break;
                case TIEMPO:
                    //DATOS: Tienda1(String), Tienda2(String), Tiempo(int)
                    restricciones = NINGUNO+"-"+NINGUNO+"-"+ENTERO;
                    break;
                case PRODUCTO:
                    //DATOS: Nombre(String), Fabricante(String), Codigo(String), Cantidad(int), Precio(Decimal), Tienda(String)
                    restricciones = NOMBRE+"-"+FABRICANTE+"-"+NINGUNO+"-"+ENTERO+"-"+DECIMAL+"-"+NINGUNO;
                    break;
                case EMPLEADO:
                    //DATOS: Nombre(String), CodigoEmpleado(int), Telefono(int), DPI(int)
                    restricciones = NOMBRE+"-"+ENTERO+"-"+ENTERO+"-"+ENTERO;
                    break;
                case CLIENTE:
                    //DATOS: Nombre(String), NIT(String), Telefono(int), Credito(Decimal)
                    restricciones = NOMBRE+"-"+NINGUNO+"-"+ENTERO+"-"+DECIMAL;
                    break;
                case PEDIDO:
                    //Codigo(int), Tienda1(String), Tienda2(String), Fecha(Fecha), Cliente(String), Articulo(String), Cantidad(int), Total(Decimal), Anticipo(Decimal)
                    restricciones = ENTERO+"-"+NINGUNO+"-"+NINGUNO+"-"+FECHA+"-"+NINGUNO+"-"+NINGUNO+"-"+ENTERO+"-"+DECIMAL+"-"+DECIMAL;
                    break;
                default:
                    validacionTipo = false;
                    System.out.println(ERROR_ENTRADA_DATOS);
                    break;
            }
            if(validacionTipo == true){    
                boolean er = analizarRestricciones(auxCadenas, restricciones.split("-"));
                if(er == true)
                    System.out.println("ERROR EN LA LINEA: "+linea);
                else{
                    if(auxCadenas[0].equalsIgnoreCase(TIENDA)){
                        try {
                            ArrayList<String> arrayListAux;
                            arrayListAux = new ArrayList<String>(Arrays.asList(auxCadenas));
                            RegistroTienda.registrarTienda(EnlaceJDBC.EnlaceJDBC(), arrayListAux);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(LectorArchivo.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                            Logger.getLogger(LectorArchivo.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                            Logger.getLogger(LectorArchivo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }            
            }
            
    }   */ 

    
    
    

       

