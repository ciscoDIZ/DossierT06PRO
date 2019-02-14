/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica17;

/*Crear la interfaz: Ordenable
e incluir como métodos: boolean
esMayorQue() , esMenorQue(), esIgualQue() Implementar el interfaz en la clase Persona
(tomaremos la clase abstracta que ya hemos usado en esta unidad ) ¿ qué ocurre en el IDE
cuándo escribimos: Persona implements Ordenable ? ( tomar captura de pantalla )
mediante alt+enter hacer el override*/

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public interface Ordenable<T> {
    public abstract boolean esMayorQue(T p);
    public abstract boolean esMenorQue(T p);
    public abstract boolean esIgualQue(T p);
}
