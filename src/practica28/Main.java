/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica28;

/**
 *
 * @author Tote
 */
public class Main {
    public static void main(String[] args) {
        Matriz2x2 m1 = new Matriz2x2(2,8,7,5);
        Matriz2x2 m2 = new Matriz2x2(8,8,12,36);
        m1.add(m1);
        m1.add(m2);
        m1.rem(m2);
    }
}
