/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ejercicio07;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */

public class MainPersonasStream {
    public static void main(String[] args) {
        Persona[] arrayPersona = new Persona[5];
        arrayPersona[0] = new Hombre("Pepito", "Tal", "y Cual", 25, 190, 80);
        arrayPersona[1] = new Hombre("Pepito", "Tal", "y Cual", 10, 130, 40);
        arrayPersona[2] = new Hombre("Pepito", "Tal", "y Cual", 85, 150, 84);
        arrayPersona[3] = new Hombre("Pepito", "Tal", "y Cual", 69, 185, 100);
        arrayPersona[4] = new Hombre("Pepito", "Tal", "y Cual", 9, 120, 30);
        ArrayList<Persona> personas = new ArrayList<>();
        for (int i = 0; i < arrayPersona.length; i++) {
            personas.add(arrayPersona[i]);
            
        }
       personas.stream()
                .filter(p-> p.calcularPesoIdeal() > p.peso)
                .forEach(System.out::println);
    }
}
