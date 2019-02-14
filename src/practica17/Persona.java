/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica17;




/*Crear una clase Persona que es abstracta y que tiene atributos: nombre,
apellido1,apellido2, int edad, int altura, double peso La altura está pensada en cm y el peso
en kg debe tener al menos un constructor con esos 6 parámetros. Sobreescribir toString()
para que muestre los datos de la persona. Crear el método protected double calcularIMC()
que devuelve el IMC de la persona. Crear también un método abstracto calcularPesoIdeal()
Crear las clases Hombre y Mujer y para obtener calcularPesoIdeal tener en cuenta la
fórmula:
peso ideal = altura - 100 - ( (100 - 150)/k )
siendo k=4 si hombre y k=2 si mujer
el toString() de hombre y mujer debe hacer uso del toString() de Persona y agregar el
resultado del peso ideal*/

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public abstract class Persona implements Ordenable<Persona>{
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected int edad;
    protected int altura;
    protected double peso;

    public Persona(String nombre, String apellido1, String apellido2, int edad, int atura, double peso) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.altura = atura;
        this.peso = peso;
    }

    @Override
    public String toString() { 
        return "Nombre: "+this.nombre+"Apellidos: "+this.apellido1+" "+apellido2
                +"\nEdad: "+this.edad+"\nAltura: "+this.altura+"\nPeso: "
                +this.peso+String.format(" IMC: %2f ", this.calcularIMC());
    }
    
    protected double calcularIMC(){
        return  this.peso / ((double)this.altura*(double)this.altura);
    }

    @Override
    public boolean esMayorQue(Persona p) {
        return this.edad > p.edad;
    }

    @Override
    public boolean esMenorQue(Persona p) {
        return this.edad < p.edad;
    }

    @Override
    public boolean esIgualQue(Persona p) {
        return this.edad == p.edad;
    }
    
    public abstract double calcularPesoIdeal();
    
    
}
