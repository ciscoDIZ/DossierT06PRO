/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica16;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class Temporada<T> {
    private List<T> temporada;

    public Temporada() {
        temporada = new LinkedList<>();
    }
    
    public boolean add(T obj){
        return temporada.add(obj);
    }
    
    public List ver(){
        return temporada;
    }
}
