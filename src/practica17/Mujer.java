/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica17;



/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Mujer extends Persona{

    public Mujer(String nombre, String apellido1, String apellido2, int edad, int atura, double peso) {
        super(nombre, apellido1, apellido2, edad, atura, peso);
    }
    //A - 100 - ((A - 150)/ 4.0)+((E-20)/k)
    @Override
    public double calcularPesoIdeal() {
        return this.altura - 100 -((this.altura - 105)/ 4.0)+((this.edad -20)/2);
    }

    @Override
    public String toString() {
        return "Mujer: "+super.toString()+"\nPeso ideal: "+calcularPesoIdeal();
    }

 
    
}
