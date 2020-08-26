/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author lguilln
 */
public class Generar_Pedido {

    //private int codigoGeneracionP;
    private int codigoPedido;
    private String codigoProducto;
    private int cantidad;
    private double totalP;
    private int cantidadProducto;

        public Generar_Pedido(int codigoPedido, String codigoProducto,int cantidad,double totalP) {
        this.codigoPedido = codigoPedido;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.totalP = totalP;
    }

    
    public Generar_Pedido(int codigoPedido, String codigoProducto,int cantidad,double totalP, int cantidadProducto) {
        this.codigoPedido = codigoPedido;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.totalP = totalP;
        this.cantidadProducto = cantidadProducto;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    
    public double getTotalP(){
        return totalP;
    }
    
    public void setTotalP(double totalP){
        this.totalP = totalP;
    }
    
    
}
