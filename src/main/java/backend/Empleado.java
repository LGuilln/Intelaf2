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
public class Empleado {

    private String nombreEmpleado;
    private String codigoEmpleado;
    private String telefono;
    private String DPI;
    private String NITEmpleado;
    private String correoElectronico;
    private String direccion;

    public Empleado(String nombreEmpleado, String codigoEmpleado, String telefono, String DPI) {
        this.nombreEmpleado = nombreEmpleado;
        this.codigoEmpleado = codigoEmpleado;
        this.telefono = telefono;
        this.DPI = DPI;
    }

    public Empleado(String nombreEmpleado, String codigoEmpleado, String telefono, String DPI, String NITempleados, String correoElectronico, String direccion) {
        this.nombreEmpleado = nombreEmpleado;
        this.codigoEmpleado = codigoEmpleado;
        this.telefono = telefono;
        this.DPI = DPI;
        this.NITEmpleado = NITempleados;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNITEmpleado() {
        return NITEmpleado;
    }

    public void setNITEmpleado(String NITempleados) {
        this.NITEmpleado = NITempleados;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
