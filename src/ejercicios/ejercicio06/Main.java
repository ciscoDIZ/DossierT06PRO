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
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(37);
        al.add(34);
        al.add(15);
        al.add(4);
        ArrayList<Integer> res = Operaciones.filtrar(al, (p) -> (int)p % 2 == 0);
        for (Integer re : res) {
            System.out.println(re);
        }
    }
}
