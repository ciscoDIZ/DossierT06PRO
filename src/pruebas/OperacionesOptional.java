/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import ejercicios.streams.Persona;
import java.util.Comparator;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class OperacionesOptional {
    public static void main(String[] args) {
        Comparator<Persona> cmp = (Persona o1, Persona o2) -> Double.compare(o1.calcularPesoIdeal(), o2.calcularPesoIdeal());
        
    }
}
