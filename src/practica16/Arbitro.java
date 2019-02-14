/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica16;

/*La clase Arbitro que extiende a ProfesionalBaloncesto con atributos propios:
int faltasPitadas*/

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Arbitro extends ProfesionalBaloncesto{
    private int faltasPitada;

    public Arbitro(int faltasPitada, String nombre, String apellidos, int edad, double ingresosAnuales) {
        super(nombre, apellidos, edad, ingresosAnuales);
        this.faltasPitada = faltasPitada;
    }

    public int getFaltasPitada() {
        return faltasPitada;
    }

    public void setFaltasPitada(int faltasPitada) {
        this.faltasPitada = faltasPitada;
    }
}
