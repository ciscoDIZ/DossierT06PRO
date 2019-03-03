/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
@FunctionalInterface
interface ManejarString {

    void manejar(String txt);
}

class Prueba {

    ManejarString estoEsUnAtributoQueGuardaUnaFuncion;
    boolean interruptor;

    public Prueba() {
        estoEsUnAtributoQueGuardaUnaFuncion = Prueba::escribirHola;
        interruptor = false;
    }

    static void escribirHola(String t) {
        System.out.println("Tú has dicho: " + t + " y yo digo: HOLA!!!");
    }

    static void escribirAdios(String t) {
        System.out.println("Adiós mundo cruel!!!!!! "
                + "( por cierto tú escribiste: " + t + ")");
    }

    void cambiarMetodo() {
        interruptor = !interruptor;
        if (interruptor) {
            estoEsUnAtributoQueGuardaUnaFuncion = Prueba::escribirAdios;
        } else {
            estoEsUnAtributoQueGuardaUnaFuncion = Prueba::escribirHola;
        }
    }
}

public class ExplicacionFuncionalInterfaceLlamarOtrosMetodos {

    public static void main(String[] args) {
        Prueba p = new Prueba();
        p.estoEsUnAtributoQueGuardaUnaFuncion.manejar("it 01");
        p.estoEsUnAtributoQueGuardaUnaFuncion.manejar("it 02");
        p.estoEsUnAtributoQueGuardaUnaFuncion.manejar("it 03");
        p.cambiarMetodo();
        p.estoEsUnAtributoQueGuardaUnaFuncion.manejar("it 04");
        p.estoEsUnAtributoQueGuardaUnaFuncion.manejar("it 05");
        p.cambiarMetodo();
        p.estoEsUnAtributoQueGuardaUnaFuncion.manejar("it 06");
    }
}
