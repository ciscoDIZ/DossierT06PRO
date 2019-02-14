/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica06;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Alumno extends Persona{
    HashMap<String, Integer> notas;
    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
        notas = new HashMap<>();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        for (Map.Entry<String, Integer> entry: notas.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    
    
    public HashMap<String, Integer> getNotas() {
        return notas;
    }

    public void setNotas(HashMap<String, Integer> notas) {
        this.notas = notas;
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
        return super.toString() + "Alumno{" + "notas=" + notas + '}';
    }
    
    
}
