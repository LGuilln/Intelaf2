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
public class Producto {

    private String nombreProducto;
    private String fabricanteProducto;
    private String codigoProducto;
    private int cantidadProducto;
    private double precioProducto;
    private String codigoTienda;
    private String descripcion;
    private int garantia;

    public Producto(String nombreProducto, String fabricanteProducto, String codigoProducto, int cantidadProducto, double precioProducto, String codigoTienda) {
        this.nombreProducto = nombreProducto;
        this.fabricanteProducto = fabricanteProducto;
        this.codigoProducto = codigoProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.codigoTienda = codigoTienda;
    }

    public Producto(String nombreProducto, String fabricanteProducto, String codigoProducto, int cantidadProducto, double precioProducto, String codigoTienda, String descripcion, int garantia) {
        this.nombreProducto = nombreProducto;
        this.fabricanteProducto = fabricanteProducto;
        this.codigoProducto = codigoProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.codigoTienda = codigoTienda;
        this.descripcion = descripcion;
        this.garantia = garantia;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getFabricanteProducto() {
        return fabricanteProducto;
    }

    public void setFabricanteProducto(String fabricanteProducto) {
        this.fabricanteProducto = fabricanteProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String id_producto) {
        this.codigoProducto = id_producto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getCodigoTienda() {
        return codigoTienda;
    }

    public void setCodigoTienda(String codigoTienda) {
        this.codigoTienda = codigoTienda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

}
