/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica06;



/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Persona {
    public String nombre;
    public String apellidos;
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellidos = apellido;
    }

    public void mostrarDatos(){
        System.out.println(this.nombre + " " + this.apellidos); 
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

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
}
