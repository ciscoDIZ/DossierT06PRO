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
public class Cuadrado extends FigurasGeometricas {

    private double lado;

    public Cuadrado(double lado, int lados) throws Exception {
        super(lados);
        if (lados > 4 | lados < 4) {
            throw new Exception();
        }
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado\n"+super.toString()+"\nÁrea: "+area();
    }

}
