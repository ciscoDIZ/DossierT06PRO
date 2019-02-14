/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica20;

import practica17.Hombre;
import practica17.Mujer;
import practica17.Ordenable;
import practica17.Persona;
import practica19.Fraccion;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class ObjetosOrdenables {
    public static void main(String[] args) {
        Ordenable[] ordenable 
                = {new Hombre("Juanito", "PErea", "Los palotes", 25, 180, 80)
                        , new Mujer("Rosalia", "", "", 0, 0, 0)
                        , new Fraccion(2, 8)};
        for (Ordenable ordenable1 : ordenable) {
            if(ordenable1 instanceof Persona){
                System.out.println(((Persona) ordenable1)
                        .esMayorQue(new Mujer("Ana","Po","Ro",20,165,60))
                        ?((Persona) ordenable1).toString()+"Es mayor"
                        :((Persona) ordenable1).toString()+"Es menor");
            }else if(ordenable1 instanceof Fraccion){
                System.out.println(((Fraccion) ordenable1)
                        .esMayorQue(new Fraccion(3, 5))
                        ?((Fraccion) ordenable1).toString()+" es mayor"
                        :((Fraccion) ordenable1).toString()+" es menor");
            }
        }
    }
    
}
