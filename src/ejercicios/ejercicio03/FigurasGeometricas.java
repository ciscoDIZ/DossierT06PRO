/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ejercicio03;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public abstract class FigurasGeometricas{
    int lados;
    
    public FigurasGeometricas(int lados){
        this.lados = lados;
    }
    public static Integer comparar(Comparable c, FigurasGeometricas f1, FigurasGeometricas f2){
        return c.comparando(f1,f2);
    }
    public abstract double area();

    @Override
    public String toString() {
        return "numero lados: "+lados;
    } 
}
