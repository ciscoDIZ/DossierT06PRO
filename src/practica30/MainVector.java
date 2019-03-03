/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica30;

import java.util.ArrayList;

import java.util.Collections;

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class MainVector {

    public static void main(String[] args) {
        ArrayList<VectorLibre> al = new ArrayList<>();
        al.add(new VectorLibre(new Punto(10, 10), new Punto(20, 60)));
        al.add(new VectorLibre(new Punto(10, 10), new Punto(30, 90)));
        al.add(new VectorLibre(new Punto(10, 10), new Punto(50, 80)));
        al.add(new VectorLibre(new Punto(10, 10), new Punto(60, 200)));
        al.add(new VectorLibre(new Punto(10, 10), new Punto(70, 110)));
        al.add(new VectorLibre(new Punto(10, 10), new Punto(80, 90)));
        Collections.sort(al);
        for (VectorLibre vectorLibre : al) {
            System.out.println(vectorLibre);
        }
    }
}
