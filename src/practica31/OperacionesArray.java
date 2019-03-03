/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica31;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class OperacionesArray<T> {
    public String arrayToText(T[] array){
        String retorno="";
        for (int i = 0; i < array.length; i++) {
            retorno += ""+array[i]+"\n";
        }
        return retorno;
    }
    public T reduccion(T[] array, Convert2to1<T> funct){
        T retorno = null;
        for (int i = 0; i < array.length-1; i++) {
            retorno = funct.conv(array[i], array[i+1]);
        }
        return retorno;
    }
    public ArrayList<T> filtrado(T[] array, Filtrar<T> funct){
        ArrayList<T> resultado = new ArrayList<>();
        int i = 0;
        resultado.stream().forEach(p-> {
            for (T t : array) {
                if(funct.filtro(t)){
                    resultado.add(t);
                }
            }
        });
        return resultado;
    }
    
    public void porCadaUno(T[] array, Filtrar<T> funct){
        for (int i = 0; i < array.length; i++) {
            funct.filtro(array[i]);
        }
    }
}
