/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ejercicio04;



/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 * @param <T>
 */
public abstract class Comparador{
    public static void ordenar(Ordenable o, Object[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(o.esMayorQue(array[i], array[j])){
                    Object helper = array[i];
                    array[i] = array[j];
                    array[j] = helper;
                }
            }
        }
    }
}
