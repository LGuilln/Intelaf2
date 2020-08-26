/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import conexion_DB.Tienda_DB;

/**
 *
 * @author lguilln
 */
public class Tienda {

    private String nombreTienda;
    private String direccionTienda;
    private String codigoTienda;
    private String telefono1;
    private String telefono2;
    private String correoElectronico;
    private String horarioTienda;

    public Tienda(String nombreTienda, String direccionTienda, String codigoTienda, String telefono1) {
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.codigoTienda = codigoTienda;
        this.telefono1 = telefono1;
    }

    public Tienda(String nombreTienda, String direccionTienda, String codigoTienda, String telefono1, String telefono2, String correoElectronico, String horarioTienda) {
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.codigoTienda = codigoTienda;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.correoElectronico = correoElectronico;
        this.horarioTienda = horarioTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public String getCodigoTienda() {
        return codigoTienda;
    }

    public void setCodigoTienda(String codigoTienda) {
        this.codigoTienda = codigoTienda;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getHorarioTienda() {
        return horarioTienda;
    }

    public void setHorarioTienda(String horarioTienda) {
        this.horarioTienda = horarioTienda;
    }

}
