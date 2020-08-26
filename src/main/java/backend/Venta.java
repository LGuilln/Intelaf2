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
public class Venta {

    private String codigoTienda;
    private String NITCliente;
    private String fechaCompra;
    private int codigoPedido;
    private double anticipoTotal;
    private double total;
    private double totalRestante;

    public Venta(String codigoTienda, String NITCliente, String fechaCompra, int codigoPedido, double anticipoTotal, double total, double totalRestante) {
        this.codigoTienda = codigoTienda;
        this.NITCliente = NITCliente;
        this.fechaCompra = fechaCompra;
        this.codigoPedido = codigoPedido;
        this.anticipoTotal = anticipoTotal;
        this.total = total;
        this.totalRestante = totalRestante;
    }

    public String getCodigoTienda() {
        return codigoTienda;
    }

    public void setNombreProducto(String codigoTienda) {
        this.codigoTienda = codigoTienda;
    }

    public String getNITCliente() {
        return NITCliente;
    }

    public void setNITCliente(String NITCliente) {
        this.NITCliente = NITCliente;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public double getAnticipoTotal() {
        return anticipoTotal;
    }

    public void setFechaCompra(double anticipoTotal) {
        this.anticipoTotal = anticipoTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double gettotalRestante() {
        return totalRestante;
    }

    public void settotalRestante(double totalRestante) {
        this.totalRestante = totalRestante;
    }

}
