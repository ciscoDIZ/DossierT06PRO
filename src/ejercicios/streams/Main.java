/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Mujer("Roberta", "Rodriguez", "Alvarez", 12, 160, 60));
        listaPersonas.add(new Hombre("Luis", "Rodriguez", "Alvarez", 23, 189, 100));
        listaPersonas.add(new Mujer("macaria", "Rodriguez", "Alvarez", 84, 166, 70));
        listaPersonas.add(new Hombre("macario", "Rodriguez", "Alvarez", 30, 170, 80));
        listaPersonas.add(new Mujer("alfonsina", "Rodriguez", "Alvarez", 19, 150, 60));
        listaPersonas.add(new Hombre("alfonso", "Rodriguez", "Alvarez", 2, 120, 10));
        ArrayList<Persona> alStream = new ArrayList(listaPersonas.stream()
                .filter(p -> p.edad >= 18)
                .sorted((o1, o2) -> o1.edad - o2.edad)
                .map((t) -> t.nombre)
                .peek(p -> System.out.println(p))
                .collect(Collectors.toList()));
        for (Object object : alStream) {
            System.out.println(object);
        }
        ArrayList<Persona> ress = new ArrayList<>();
        ress = (ArrayList) listaPersonas.stream().filter(p -> p.calcularPesoIdeal() < p.peso)
                .peek(p -> System.out.println(p.nombre))
                .collect(Collectors.toList());
        // con usa sola sentencia de steam, obtener un set de Mujeres y una Lista con los hombres

        ArrayList<Persona> mujeres = new ArrayList<>();
        HashSet<Persona> hombres = new HashSet<>();
        double maximoTres = listaPersonas.stream()
                .sorted((a, b) -> Double.compare(b.altura, a.altura))
                .map(p -> p.altura)
                .distinct()
                .limit(3)
                .skip(2)
                .findFirst()
                .orElse(-1);
        Optional<Persona> opt2 = listaPersonas.stream()
                .filter(p->p.nombre.toLowerCase().equals("luis"))
                .findFirst();
        opt2.ifPresent(System.out::println);
        listaPersonas.stream()
                .mapToDouble(p->p.edad)
                .average()
                .ifPresent(p->{
                    
                });
        listaPersonas.stream()
                .forEach(p -> listaPersonas.stream()
                                .filter(q->q.edad == p.edad)
                                .count()             
                );
        System.out.println(listaPersonas.stream()
                .flatMap(p-> Arrays.stream(p.nombre.split("")))
                .collect(Collectors.toList())
                .stream()
                .count());
        listaPersonas.stream()
                .sorted((o1, o2) -> o2.edad - o1.edad)
                .limit(3)
                .forEach(System.out::println);
    }
}
