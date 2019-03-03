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
public class Main {
    public static void main(String[] args) {
        System.out.println("Cuadrado: "+Mates.mostrarResultado(10, (a)->a*a));
        System.out.println("Factorial: "+Mates.mostrarResultado(10, (a)->{
            int fact=1;
            for (int i = 1; i <= a; i++) {
                fact *= i;
            }
            return fact;
        }));
    }
}
