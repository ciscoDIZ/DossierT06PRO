/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class MainClorotica {
    public static void main(String[] args) {
        Clorotica c = new Clorotica();
        c.decirHola();
        System.out.println(Prueba.reducir(8, 4, (a, b)-> a + b));
        System.out.println(Prueba.reducir(8, 4, (a, b)-> a - b));
        System.out.println(Prueba.reducir(8, 4, (a, b)-> a * b));
        System.out.println(Prueba.reducir(8, 4, (a, b)-> a / b));
        System.out.println(Prueba.reducir(8, 4, (a, b)-> a % b));
    }
   
}
