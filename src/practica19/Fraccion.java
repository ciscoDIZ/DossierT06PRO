/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica19;

import practica17.Ordenable;

/*Crear la clase Fraccion con atributos: int numerador, int denominador un
constructor que recibe los dos paramentros y otro que recibe únicamente el numerador ( el
denominador será 1 ) con métodos: double toDouble() que devuelve el resultado de la
división y un toString() en el formato: 3/5
donde 3 sería el numerador y 5 el
denominador. Fraccion implementará la interfaz Ordenable los métodos: esMayorQue() ...
utilizarán la comparación de los double resultantes al hacer la división para comparar dos
fracciones, siendo mayor una fracción si el double resultante es mayor*/

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Fraccion implements Ordenable<Fraccion>{
    private int numerador;
    private int denominador;

    public Fraccion(int numerador) {
        this.numerador = numerador;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public Double toDouble(){
        return (double)numerador/(double)denominador;
    }

    @Override
    public boolean esMayorQue(Fraccion p) {
        return this.toDouble() > p.toDouble();
    }

    @Override
    public boolean esMenorQue(Fraccion p) {
        return this.toDouble() < p.toDouble();
    }

    @Override
    public boolean esIgualQue(Fraccion p) {
        return this.toDouble().equals(p.toDouble());
    }

    
    
    @Override
    public String toString() {
        return  numerador + "/" + denominador;
    }
}
