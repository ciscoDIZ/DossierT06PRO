/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;


/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class Perro extends Animal{
    int extremidades;
    int dientes;

    public Perro(int extremidades, int dientes, String nombre, String nombreCientifico, int edad, double peso) {
        super(nombre, nombreCientifico, edad, peso);
        this.extremidades = extremidades;
        this.dientes = dientes;
    }
    
    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }

    public int getSonido() {
        return dientes;
    }

    public void setSonido(int sonido) {
        this.dientes = sonido;
    }

    @Override
    public String emitirSonido() {
        return "Guau! Guau!";
    }
    
    
}
