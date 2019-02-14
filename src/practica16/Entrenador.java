/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica16;

/*La clase Entrenador que extiende a ProfesionalBaloncesto con atributos propios:
porcentajeVictorias ( un número de 0 a 100)
La clase Arbitro que extiende a ProfesionalBaloncesto con atributos propios:
int faltasPitadas*/

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class Entrenador extends ProfesionalBaloncesto{
    private int porcentajeVicorias;
    public Entrenador(int porcentajeVicorias, String nombre, String apellidos
            , int edad, double ingresosAnuales) throws IllegalArgumentException{
        super(nombre, apellidos, edad, ingresosAnuales);
        if(!(porcentajeVicorias >= 0 && porcentajeVicorias <= 100)){
            throw new IllegalArgumentException("El porcentaje de victoria es un "
                    + "número comprendido entre 1 y 100");
        }else{
            this.porcentajeVicorias = porcentajeVicorias;
        }
    }

    public int getPorcentajeVicorias() {
        return porcentajeVicorias;
    }

    public void setPorcentajeVicorias(int porcentajeVicorias) {
        this.porcentajeVicorias = porcentajeVicorias;
    }

    @Override
    public String toString() {
        return super.toString()+"Entrenador{" + "porcentajeVicorias=" + porcentajeVicorias + '}';
    }
    
}
