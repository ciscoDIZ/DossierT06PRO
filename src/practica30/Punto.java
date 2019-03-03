/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica30;

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto toCopy) {
        this.x = toCopy.x;
        this.y = toCopy.y;
    }

    public Punto() {
    }

    
    @Override
    public String toString() {
        return  "(x" + x + "," + y+"y)";
    }

    @Override
    public boolean equals(Object obj) {
        Punto p = (Punto)obj;
        return this.x == p.x && this.y == p.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
}
