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
public interface Planta {

    default void decirHola() {
        System.out.println("Hola planta!!!!!");
    }
    
    static void decirAdios(){
        System.out.println("Nunca digas adiós mejor di hasta luego");
    }
}
