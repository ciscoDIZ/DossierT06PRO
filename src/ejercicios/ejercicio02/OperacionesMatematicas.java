/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ejercicio02;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class OperacionesMatematicas {

    static double func(double x) {
        return x;
    }

    static double integrando(Integrable obj, double limInf, double limSup) {
        double suma = 0;
        double numeroRectangulos = 100.0;
        double paso = (limInf - limSup) / numeroRectangulos;
        for (double i = limInf; i <= limSup; i += paso) {
            double rectangulo = paso * func(i);
            suma += rectangulo;

        }
        return suma;
    }

    static boolean esMayorQue(String texto1, String texto2) {
        boolean resultado = false;
        boolean finalizar = false;
        for (int i = 0; !finalizar && i < texto1.length() && i < texto2.length(); i++) {
            if (texto1.charAt(i) > texto2.charAt(i)) {
                resultado = true;
                finalizar = true;
            } else if (texto1.charAt(i) < texto2.charAt(i)) {
                finalizar = true;
            }

        }
        return resultado;
    }

    static void ordenar(String[] texto) {
        String helper;
        for (int i = 0; i < texto.length - 1; i++) {
            for (int j = i + 1; j < texto.length; j++) {
                if (esMayorQue(texto[i], texto[j])) {
                    helper = texto[i];
                    texto[i] = texto[j];
                    texto[j] = helper;

                }
            }

        }

    }
}
