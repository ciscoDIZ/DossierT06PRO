/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica16;

/*La clase Jugador que extiende a ProfesionalBaloncesto con atributos propios: posición
( enum para base, pivot,.. ) , partidosJugados , equipo*/

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */

public class Jugador  extends ProfesionalBaloncesto{
    enum Posicion{
        BASE,
        PIVOT,
        ALERO,
        ESCOLTA,
        ALA_PIVOT
    }
  
    private Posicion posicion;
    private int partidosJugados;
    private String equipo;

    public Jugador(Posicion posicion, int partidosJugados, String equipo, String nombre, String apellidos, int edad, double ingresosAnuales) {
        super(nombre, apellidos, edad, ingresosAnuales);
        this.posicion = posicion;
        this.partidosJugados = partidosJugados;
        this.equipo = equipo;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Jugador{" + "posicion=" + posicion + ", partidosJugados=" + partidosJugados + ", equipo=" + equipo + '}';
    }
    
    
}
