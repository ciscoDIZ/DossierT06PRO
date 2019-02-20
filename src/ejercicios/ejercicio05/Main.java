/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ejercicio05;

import java.util.ArrayList;

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class Main {
    public static void main(String[] args) {
        Integer helperDistancia = null;
        Integer bandera = -999999;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(15);
        al.add(2);
        al.add(80);
        Integer[] mayores = new Integer[al.size()];
        for (int i = 0; i < al.size(); i++) {
            for (int j = i; j < al.size(); j++) {
                if (helperDistancia == null){
                    helperDistancia = al.get(i) - al.get(i+1);
                }else{
                    if (al.get(i) - al.get(j) < helperDistancia && j != bandera){
                        mayores[i] = j;
                        bandera = j;
                        helperDistancia = al.get(j);
                    }
                }
            }
            
        }
    }
}
