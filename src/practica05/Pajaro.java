/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica05;

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class Pajaro extends Animal{
    int extremidades;
    String sonido;
    double densidadPlumaje;

    public Pajaro() {}
    
    public Pajaro(int extremidades, String sonido, double densidadPlumaje, String nombre, String nombreCientifico, int edad, double peso) {
        super(nombre, nombreCientifico, edad, peso);
        this.extremidades = extremidades;
        this.sonido = sonido;
        this.densidadPlumaje = densidadPlumaje;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
