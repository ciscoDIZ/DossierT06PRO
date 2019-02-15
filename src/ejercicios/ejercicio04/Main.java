/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ejercicio04;



/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Main {
    public static void main(String[] args) {
       
        Persona[] arrayPersona = new Persona[5];
        arrayPersona[0] = new Hombre("Pepito", "Tal", "y Cual", 25, 190, 80);
        arrayPersona[1] = new Hombre("Pepito", "Tal", "y Cual", 10, 130, 40);
        arrayPersona[2] = new Hombre("Pepito", "Tal", "y Cual", 85, 150, 84);
        arrayPersona[3] = new Hombre("Pepito", "Tal", "y Cual", 69, 185, 100);
        arrayPersona[4] = new Hombre("Pepito", "Tal", "y Cual", 9, 120, 30);
        Comparador.ordenar(new Ordenable<Persona>() {
            @Override
            public boolean esMayorQue(Persona o1, Persona o2) {
                return o1.edad>o2.edad;
            }
        }, arrayPersona);
        System.out.println("Ordenación por edad usando clase anónima");
        for (Persona persona : arrayPersona) {
            System.out.println(persona);
        }
        //ordenamos el mismo array por edad
        
        System.out.println("\nOrdenación por edad usando lambdas");
        Comparador.ordenar((Ordenable<Persona>)(Persona a, Persona b)->a.edad>b.edad, arrayPersona);
        for (Persona persona : arrayPersona) {
            System.out.println(persona);
        }
        //ordenamos por altura
        System.out.println("\nOrdenación por altura usando lambdas");
        Comparador.ordenar((Ordenable<Persona>)(Persona a, Persona b)-> a.altura > b.altura, arrayPersona);
        for (Persona persona : arrayPersona) {
            System.out.println(persona);
        }
        //Ahora ordenamos por peso
        System.out.println("\nOrdenación por peso usando lambdas");
        Comparador.ordenar((Ordenable<Persona>)(Persona a, Persona b)-> a.peso > b.peso, arrayPersona);
        for (Persona persona : arrayPersona) {
            System.out.println(persona);
        }
    }
}
