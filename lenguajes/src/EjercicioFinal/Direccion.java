/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioFinal;

/**
 *
 * @author T-102
 */
public class Direccion {

    public Direccion(String calle, long cp, String municipio) {
        this.calle = calle;
        this.cp = cp;
        this.municipio = municipio;
    }
    private String calle;
    private long cp;
    private String municipio;

    public Direccion() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public long getCp() {
        return cp;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}
