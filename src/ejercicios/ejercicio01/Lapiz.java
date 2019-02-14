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
public class Lapiz implements Vendible{
    private int numero;
    private boolean tieneGoma;

    public Lapiz(int numero, boolean tieneGoma) {
        this.numero = numero;
        this.tieneGoma = tieneGoma;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isTieneGoma() {
        return tieneGoma;
    }

    public void setTieneGoma(boolean tieneGoma) {
        this.tieneGoma = tieneGoma;
    }

    @Override
    public String toString() {
        return "Lapiz{" + "numero=" + numero + ", tieneGoma=" + tieneGoma + '}';
    }

    @Override
    public Double obtenerPrecio() {
        return 0.50;
    }

    @Override
    public String listar() {
        return toString()+obtenerPrecio();
    }
    
}
