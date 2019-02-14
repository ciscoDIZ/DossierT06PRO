/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Apunte {
    private String concepto;
    private Double importe;
    private Comisiones com;

    public Apunte(String concepto, Double importe) {
        this.concepto = concepto;
        this.importe = importe;
        
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Comisiones getCom() {
        return com;
    }

    public void setCom(Comisiones com) {
        this.com = com;
    }
     
}
