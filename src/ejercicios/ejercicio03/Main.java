/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ejercicio03;

import java.util.ArrayList;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Main {

    public static void main(String[] args) {
        try {
            FigurasGeometricas[] figuras = new FigurasGeometricas[9];
            figuras[0] = new Circulo(11, 0);
            figuras[1] = new Cuadrado(2, 4);
            figuras[2] = new Triangulo(8, 8, 3);
            figuras[3] = new Circulo(12, 0);
            figuras[4] = new Cuadrado(85, 4);
            figuras[5] = new Triangulo(56, 16, 3);
            figuras[6] = new Circulo(1, 0);
            figuras[7] = new Cuadrado(5, 4);
            figuras[8] = new Triangulo(6, 8, 3);
            for (int i = 0; i < figuras.length; i++) {
                for (int j = i + 1; j < figuras.length; j++) {
                    if (FigurasGeometricas.comparar(new Comparable() {
                        @Override
                        public Integer comparando(FigurasGeometricas f1, FigurasGeometricas f2) {
                            return (int) (f1.area() - f2.area());
                        }
                    }, figuras[i], figuras[j]) > 0) {
                        FigurasGeometricas f = figuras[i];
                        figuras[i] = figuras[j];
                        figuras[j] = f;
                    }
                }
            }
            for (int i = 0; i < figuras.length; i++) {
                System.out.println(figuras[i]);
            }
            for (int i = 0; i < figuras.length; i++) {
                for (int j = i+1; j < figuras.length; j++) {
                    if(FigurasGeometricas.comparar((a,b)->{
                        return ((int)(a.area() - b.area()));
                    },figuras[i], figuras[j])>0){
                        FigurasGeometricas f = figuras[i];
                        figuras[i] = figuras[j];
                        figuras[j] = f;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
