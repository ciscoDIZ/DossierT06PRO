/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import practica19.Fraccion;

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Fraccion> fracciones = new ArrayList<>();
        fracciones.add(new Fraccion(10, 8));
        fracciones.add(new Fraccion(20, 3));
        fracciones.add(new Fraccion(120, 8));
        fracciones.add(new Fraccion(22, 10));
        fracciones.add(new Fraccion(70, 8));
        fracciones.add(new Fraccion(9, 12));
        
       Collections.sort(fracciones, new Comparator<Fraccion>() {
            @Override
            public int compare(Fraccion o1, Fraccion o2) {
                return (int)(o2.toDouble() - o1.toDouble());
            }
        });
        for (Fraccion fraccione : fracciones) {
            System.out.println(fraccione.toString() + " = "+ fraccione.toDouble());
        }
    }
}
