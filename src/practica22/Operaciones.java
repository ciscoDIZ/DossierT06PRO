/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica22;


import java.util.Comparator;
import practica19.Fraccion;

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public abstract class Operaciones implements Comparator<Fraccion>{

    @Override
    public int compare(Fraccion o1, Fraccion o2) {
        return Double.compare(o1.toDouble(), o2.toDouble());
    }
    
    
}
