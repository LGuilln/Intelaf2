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
public class Cliente {

    private String nombreCliente;
    private String nitCliente;
    private String telefono;
    private double creditoCliente;
    private String DPI;
    private String correoElectronico;
    private String direccion;

    public Cliente(String nombreCliente, String nitCliente, String telefono, double creditoCliente) {
        this.nombreCliente = nombreCliente;
        this.nitCliente = nitCliente;
        this.telefono = telefono;
        this.creditoCliente = creditoCliente;
    }

    public Cliente(String nombreCliente, String nitCliente, String telefono, double creditoCliente, String DPI, String correoElectronico, String direccion) {
        this.nombreCliente = nombreCliente;
        this.nitCliente = nitCliente;
        this.telefono = telefono;
        this.creditoCliente = creditoCliente;
        this.DPI = DPI;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNITCliente() {
        return nitCliente;
    }

    public void setNITCliente(String nitCliente) {
        this.nitCliente = nitCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getCreditoCliente() {
        return creditoCliente;
    }

    public void setCreditoCliente(double creditoCliente) {
        this.creditoCliente = creditoCliente;
    }

    public String getDPICliente() {
        return DPI;
    }

    public void setDPICliente(String dpi_clientes) {
        this.DPI = dpi_clientes;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoClientes) {
        this.correoElectronico = correoClientes;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
