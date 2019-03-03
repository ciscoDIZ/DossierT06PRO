/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica26;

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
@FunctionalInterface
public interface Mates {
    public abstract int calc(int num);
    public static int mostrarResultado(int num, Mates func){
        return func.calc(num);
    }
}
