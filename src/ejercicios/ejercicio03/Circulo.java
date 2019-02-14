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
public class Circulo extends FigurasGeometricas{
    private final double PI = 3.14;
    private double radio;

    public Circulo(double radio, int lados) throws Exception{
        super(lados);
        if (lados > 0 | lados < 0){
            throw new Exception();
        }
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
     
    @Override
    public double area() {
        return PI*(radio*radio);
    }

    @Override
    public String toString() {
        return "Circulo\n"+super.toString()+"\nÁrea: "+area();
    }
    
    
}
