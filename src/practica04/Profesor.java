/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica04;



/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Profesor extends Persona{
    private String[] curos;
    private Double salario;
    private String especialidad;
    
    public Profesor(String nombre, String apellidos,String[] cursos, double salario, String especialidad){
        super(nombre, apellidos);
       
        this.curos = cursos;
        this.salario = salario;
        this.especialidad = especialidad;
    }

    
    
    public String[] getCuros() {
        return curos;
    }

    public void setCuros(String[] curos) {
        this.curos = curos;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
