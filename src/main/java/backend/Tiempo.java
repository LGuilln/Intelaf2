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
public class Tiempo {

    private String tienda1;
    private String tienda2;
    private int tiempoDias;

    public Tiempo( String tienda1, String tienda2, int tiempoDias) {
   
        this.tienda1 = tienda1;
        this.tienda2 = tienda2;
        this.tiempoDias = tiempoDias;

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

    public int getTiempoDias() {
        return tiempoDias;
    }

    public void setTiempoDias(int tiempoDias) {
        this.tiempoDias = tiempoDias;
    }

    /* public int getCodigoTiempo() {
        return codigoTiempo;
    }

    public void setCodigoTiempo(int codigoTiempo) {
        this.codigoTiempo = codigoTiempo;
    }*/

}
