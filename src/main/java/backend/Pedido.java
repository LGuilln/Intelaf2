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
public class Pedido {

    private int codigoPedido;
    private String tienda1;
    private String tienda2;
    private String fecha1;
    private String NITCliente;
    private double total;
    private double anticipoTotal;
    private double totalRestante;
    private String fecha2;
    private int tiempoDias;
    private String curso;
    //private String fecha2;

    private String codigoProducto;
    private int cantidad;
    private int cantidadProducto;
    private double totalP;

    public Pedido(int codigoPedido, String tienda1, String tienda2, String fecha1, String NITCliente, String codigoProducto, int cantidad, double totalP, double anticipoTotal) {
        this.codigoPedido = codigoPedido;
        this.tienda1 = tienda1;
        this.tienda2 = tienda2;
        this.fecha1 = fecha1;
        this.NITCliente = NITCliente;
        this.anticipoTotal = anticipoTotal;

        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.totalP = totalP;
    }

    public Pedido(int codigoPedido, String tienda1, String tienda2, String fecha1, String NITCliente, double total, double anticipoTotal, double totalRestante, String fecha2, int tiempoDias, String curso) {
        this.codigoPedido = codigoPedido;
        this.tienda1 = tienda1;
        this.tienda2 = tienda2;
        this.fecha1 = fecha1;
        this.NITCliente = NITCliente;
        this.total = total;
        this.anticipoTotal = anticipoTotal;
        this.totalRestante = totalRestante;
        this.fecha2 = fecha2;
        this.tiempoDias = tiempoDias;
        this.curso = curso;

        //this.fecha2 = fecha2;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getTienda1() {
        return tienda1;
    }

    public void setTienda1(String tienda1) {
        this.tienda1 = tienda1;
    }

    public String getTienda2() {
        return tienda2;
    }

    public void setTienda2(String tienda2) {
        this.tienda2 = tienda2;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public String getNITCliente() {
        return NITCliente;
    }

    public void setNITCliente(String NITCliente) {
        this.NITCliente = NITCliente;
    }

    public double getAnticipoTotal() {
        return anticipoTotal;
    }

    public void setAnticipoTotal(double anticipoTotal) {
        this.anticipoTotal = anticipoTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalRestante() {
        return totalRestante;
    }

    public void setTotalRestante(double totalRestante) {
        this.totalRestante = totalRestante;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    public int getTiempoDias() {
        return tiempoDias;
    }

    public void setTiempoDias(String TiempoDias) {
        this.tiempoDias = tiempoDias;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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

    public double getTotalP() {
        return totalP;
    }

    public void setTotalP(double totalP) {
        this.totalP = totalP;
    }

}
