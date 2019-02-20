/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.streams;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Mujer("Roberta", "Rodriguez", "Alvarez", 12, 160,60));
        listaPersonas.add(new Hombre("Roberto", "Rodriguez", "Alvarez", 23, 189,100));
        listaPersonas.add(new Mujer("macaria", "Rodriguez", "Alvarez", 84, 166,70));
        listaPersonas.add(new Hombre("macario", "Rodriguez", "Alvarez", 30, 170,80));
        listaPersonas.add(new Mujer("alfonsina", "Rodriguez", "Alvarez", 19, 150,60));
        listaPersonas.add(new Hombre("alfonso", "Rodriguez", "Alvarez", 2, 120,10));
        ArrayList alStream = new ArrayList(listaPersonas.stream()
                .filter(p -> p.edad >= 18 )
                .sorted((o1, o2) -> o1.edad - o2.edad)
                .map((t) -> t.nombre)
                .peek(p-> System.out.println(p))
                .collect(Collectors.toList()));
        for (Object object : alStream) {
            System.out.println(object);
        }
    }
}
