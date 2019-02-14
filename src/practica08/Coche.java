/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica08;

/*Tomando la clase Coche con atributos marca, modelo, potencia, puertas,
matricula Crear la clase CocheSEAT Los modelos de esta marca siempre empezarán por
“se-” agregando ese texto siempre al modelo que se le pase al constructor o al setter ( salvo
que ya se le esté pasando, cosa que se debe validar )
Observar que el atributo marca en coche no tiene mucho sentido que sea heredado por
CocheSEAT*/


/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class Coche {
    private String marca;
    protected String modelo;
    protected double potencia;
    protected int puertas;

    public Coche(String marca, String modelo, double potencia, int puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
