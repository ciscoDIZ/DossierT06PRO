/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica21;

import java.util.ArrayList;
import practica17.Mujer;

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class Main {

    public static void main(String[] args) {
        Mujer nuevaMujer = new Mujer("Isabel", "Dorta", "Jiménez", 45, 165, 60);
        ImprimirEnMayuscula<Mujer> iem = new ImprimirEnMayuscula<Mujer>() {
            @Override
            public void imprimirMayuscula(Mujer mujer) {
                String val = mujer.toString();
                System.out.println(val.toUpperCase());
            }
        };

        iem.imprimirMayuscula(nuevaMujer);
        ArrayList<ImprimirEnMayuscula> imprimibles = new ArrayList<>();

        imprimibles.add(iem);
       
    }
}
