/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import practica16.Jugador;
import practica16.Jugador.Posicion;


/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
/*Crear un ArrayList con objetos Jugador (práctica 16) y ordenarlos utilizando
una clase anónima que implemente Comparator<Jugador> la comparación será mediante el
atributo partidosJugados*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador(Posicion.BASE, 100, "Tenerife", "Jose Alberto", "A saber Loco", 25, 10000));
        jugadores.add(new Jugador(Posicion.PIVOT, 300, "Chicago bulls", "Michael", "Jordan", 60, 100000));
        jugadores.add(new Jugador(Posicion.PIVOT, 1000, "Chicago bulls", "Michael", "Jordan", 60, 100000));
        jugadores.add(new Jugador(Posicion.PIVOT, 500, "Chicago bulls", "Michael", "Jordan", 60, 100000));
        jugadores.add(new Jugador(Posicion.PIVOT, 700, "Chicago bulls", "Michael", "Jordan", 60, 100000));
        jugadores.add(new Jugador(Posicion.PIVOT, 3, "Chicago bulls", "Michael", "Jordan", 60, 100000));
        jugadores.add(new Jugador(Posicion.PIVOT, 23, "Chicago bulls", "Michael", "Jordan", 60, 100000));
        Collections.sort(jugadores, new Comparator<Jugador>() {
            @Override
            public int compare(Jugador o1, Jugador o2) {
                return o1.getPartidosJugados() - o2.getPartidosJugados();
            }
        });
        
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.toString());
        }
    }
}
