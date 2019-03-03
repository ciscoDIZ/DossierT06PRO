/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica27;

import practica12.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import practica12.Hombre;
import practica12.Mujer;
/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
/*Crear un ArrayList de Personas que incluya objetos Hombre y Mujer. Crea una
variable:
Comparator<Persona> cmtPersona;
asigna a cmtPersona una expresión lambda que ordena las personas por peso ( igual tienes
que agregar un getter para peso en Persona ) y luego usa Collections.sort() para ordenar
mediante cmtPersona el ArrayList*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Hombre("Manolito", "Gafotas", "Gonzalez", 12, 130, 40));
        personas.add(new Mujer("Lorena", "Perez", "Alvarez", 30, 170, 50));
        personas.add(new Hombre("Lorenzo", "Suarez", "Gonzalez", 40, 160, 70));
        personas.add(new Mujer("Naira", "Hernandez", "Marrero", 35, 165, 52));
        personas.add(new Hombre("Fernando", "Rodriguez", "", 12, 130, 40));
        personas.add(new Mujer("Lorena", "Rodriguez", "Estebez", 26, 177, 60));
        personas.add(new Hombre("Manolito", "Gafotas", "Gonzalez", 12, 130, 80));
        personas.add(new Mujer("Lorena", "Perez", "Alvarez", 30, 170, 50));
        personas.add(new Hombre("Manolito", "Gafotas", "Gonzalez", 12, 130, 100));
        personas.add(new Mujer("Lorena", "Perez", "Alvarez", 30, 170, 50));
        personas.add(new Hombre("Manolito", "Gafotas", "Gonzalez", 12, 130, 60));
        personas.add(new Mujer("Lorena", "Perez", "Alvarez", 30, 170, 80));
        Comparator<Persona> cmPersona = (a,b) -> (int)(a.getPeso() - b.getPeso());
        Collections.sort(personas, cmPersona);
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }
}
