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
public class Triangulo extends FigurasGeometricas{
    private double base;
    private double altura;

    public Triangulo(double base, double altura, int lados) throws Exception{
        super(lados);
        if(lados > 3 | lados < 3){
            throw new Exception();
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo\n"+super.toString()+"\nÁrea: "+area();
    }
}
