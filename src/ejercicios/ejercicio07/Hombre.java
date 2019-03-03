/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ejercicio07;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Hombre extends Persona{

    public Hombre(String nombre, String apellido1, String apellido2, int edad
            , int atura, double peso) {
        super(nombre, apellido1, apellido2, edad, atura, peso);
    }

    @Override
    public double calcularPesoIdeal() {
        //A - 100 - ((A - 150)/ 4.0)+((E-20)/k)
        return this.altura - 100 - ((this.altura - 150)/4.0) + ((this.edad - 20)/4);
    }

    @Override
    public String toString() {
        return "Hombre: "+super.toString()+"\nPeso ideal: "+calcularPesoIdeal();
    }
}
