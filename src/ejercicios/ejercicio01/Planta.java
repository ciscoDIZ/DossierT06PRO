/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ejercicio01;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Planta implements Vendible{
    private String tipoPlanta;
    private int tiempo;

    public Planta(String tipoPlanta, int tiempo) {
        this.tipoPlanta = tipoPlanta;
        this.tiempo = tiempo;
    }
    
    public String getTipoPlanta() {
        return tipoPlanta;
    }

    public void setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Planta{" + "tipoPlanta=" + tipoPlanta + ", tiempo=" + tiempo + '}';
    }

    
    
    @Override
    public Double obtenerPrecio() {
        return 5.0;
    }

    @Override
    public String listar() {
        return toString()+obtenerPrecio();
    }
}
