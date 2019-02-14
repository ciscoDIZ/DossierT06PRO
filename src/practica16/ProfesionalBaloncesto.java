/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica16;

/*Crear la clase ProfesionalBaloncesto que representa a cualesquier profesional
de baloncesto. Así tiene como atributos: nombre, apellidos, edad, ingresosAnuales,
numeroFederado, con un constructor como mínimo y un toString()*/

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public abstract class ProfesionalBaloncesto {
    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected double ingresosAnuales;

    public ProfesionalBaloncesto(String nombre, String apellidos, int edad, double ingresosAnuales) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.ingresosAnuales = ingresosAnuales;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\nApellidos: "+apellidos+"\nEdad: "+edad
                +"\nIngresos anuales"+ingresosAnuales; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }
    
    
}
