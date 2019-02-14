/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica17;


import java.util.ArrayList;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Mujer("Roberta", "Rodriguez", "Alvarez", 23, 160,60));
        listaPersonas.add(new Hombre("Roberto", "Rodriguez", "Alvarez", 23, 160,60));
        listaPersonas.add(new Mujer("macaria", "Rodriguez", "Alvarez", 23, 160,60));
        listaPersonas.add(new Hombre("macario", "Rodriguez", "Alvarez", 23, 160,60));
        listaPersonas.add(new Mujer("alfonsina", "Rodriguez", "Alvarez", 23, 160,60));
        listaPersonas.add(new Hombre("alfonso", "Rodriguez", "Alvarez", 23, 160,60));
        
        for (Persona listaPersona : listaPersonas) {
            System.out.println(listaPersona.toString()+"\n");
        }
    }
}
