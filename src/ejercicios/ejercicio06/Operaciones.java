/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ejercicio06;

import java.util.ArrayList;


/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public abstract class Operaciones {
    public static ArrayList filtrar(ArrayList al, Filtrable f){
        ArrayList al1 = new ArrayList();
        for (Object object : al) {
            if (f.filtrado(object)) {
                al1.add(object);
            }
        }
        return al1;
    } 
}
