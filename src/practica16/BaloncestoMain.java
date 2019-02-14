/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica16;

import java.util.LinkedList;

/*Crear la clase ProfesionalBaloncesto que representa a cualesquier profesional
de baloncesto. Así tiene como atributos: nombre, apellidos, edad, ingresosAnuales,
numeroFederado, con un constructor como mínimo y un toString()
La clase Jugador que extiende a ProfesionalBaloncesto con atributos propios: posición
( enum para base, pivot,.. ) , partidosJugados , equipo
La clase Entrenador que extiende a ProfesionalBaloncesto con atributos propios:
porcentajeVictorias ( un número de 0 a 100)
La clase Arbitro que extiende a ProfesionalBaloncesto con atributos propios:
int faltasPitadas
Todos los datos de los atributos propios hacen referencia a una temporada completa
Poner en una LinkedList de tipo ProfesionalBaloncesto objetos de tipo Jugador, Entrenador,
Arbitro. Recorrer la lista y mostrar únicamente los atributos propios de la clase de cada
objeto ( no los atributos comunes con la superclase)*/
/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class BaloncestoMain {

    public static void main(String[] args) {
        Temporada<ProfesionalBaloncesto> t = new Temporada();
        t.add(new Jugador(Jugador.Posicion.PIVOT, 100, "Chicago Bulls", "Michael", "Jordan", 25, 1000000));
        t.add(new Entrenador(10, "Juanito", "De los Palotes", 45, 160000));
        t.add(new Arbitro(7, "Juanjo", "Rodriguez", 48, 10000));
        LinkedList<ProfesionalBaloncesto> lista = new LinkedList<>(t.ver());
        for (ProfesionalBaloncesto profesionalBaloncesto : lista) {
            if (profesionalBaloncesto instanceof Jugador) {
                System.out.println("Jugador:\nPartidos jugados: " 
                        +  ((Jugador) profesionalBaloncesto).getPartidosJugados()
                        +"\nPosición: "+((Jugador) profesionalBaloncesto).getPosicion());
            } else if(profesionalBaloncesto instanceof Entrenador){
                System.out.println("Entrenador\nPorcentaje victorias: " 
                        + ((Entrenador) profesionalBaloncesto).getPorcentajeVicorias()+"%");
            } else if(profesionalBaloncesto instanceof Arbitro){
                System.out.println("Arbitro:\nFaltas pitadas: "+((Arbitro) profesionalBaloncesto).getFaltasPitada());
            }
            
        }

    }
}
