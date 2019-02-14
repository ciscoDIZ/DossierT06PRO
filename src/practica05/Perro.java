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
public class Perro extends Animal{
    int extremidades;
    int sonido;

    public Perro(int extremidades, int sonido, String nombre, String nombreCientifico, int edad, double peso) {
        super(nombre, nombreCientifico, edad, peso);
        this.extremidades = extremidades;
        this.sonido = sonido;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }

    public int getSonido() {
        return sonido;
    }

    public void setSonido(int sonido) {
        this.sonido = sonido;
    }
}
