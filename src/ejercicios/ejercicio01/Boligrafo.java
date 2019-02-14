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
public class Boligrafo implements Vendible{
    private String marca;
    private String color;

    public Boligrafo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Boligrafo{" + "marca=" + marca + ", color=" + color + '}';
    }

    @Override
    public Double obtenerPrecio() {
        return 1.0;
    }

    @Override
    public String listar() {
        return toString()+obtenerPrecio();
    }
}
