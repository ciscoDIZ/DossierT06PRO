/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1DAW toteskuu@gmail.com
 */
public class Cuenta {
    /*Crear una clase llamada Cuenta que refleje una cuenta bancaria. Tiene por
atributos: String numero, String titular, double saldo Así como los métodos ingresar() y
retirar() que servirán para añadir o quitar saldo*/
    protected String numero;
    protected String titular;
    protected double saldo;
    private Map<String, ArrayList<Apunte>> movimientos;
    
    
    public Cuenta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        movimientos = new HashMap<>();
    }

    public Cuenta(String titular) {
        this("",titular);
        Random rnd = new Random();
        this.titular = titular;
        for (int i = 1; i <= 24; i++) {
            if(i % 5 == 0)
                numero += " ";
            else
                numero += rnd.nextInt(10);
            
        }
    }
    
    public String getNumero() {
        return numero;
    }

    public boolean ingresar(String concepto, double cantidad){
        Apunte a = new Apunte(concepto, saldo);
        ArrayList<Apunte> subarray = movimientos.get(concepto);
        if(subarray == null){
            subarray = new ArrayList<>();
            subarray.add(a);
            movimientos.put(concepto, subarray);
        }
        subarray.add(a);
        boolean resultado = false;
        if (!(cantidad <= 0)){
            saldo +=cantidad;
            resultado =true;
        }
        return resultado;
    }
    
    public boolean retirar(String concepto, double cantidad){
        
        boolean resultado = false;
        if(movimientos.get(concepto) == null){
            movimientos.get(concepto).add(new Apunte(concepto, cantidad));
        }
        if(!(cantidad<=0) && cantidad > saldo){
            cantidad *= -1;
            saldo += cantidad;
            resultado = true;
        }else if(cantidad <= 0){
            throw new IllegalArgumentException();
        }else if(cantidad>saldo){
            throw new IllegalArgumentException();
        }
        return resultado;
    }
    
    
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public int comprobar(){
        int num = Integer.parseInt(numero);
        int sum = 0;
        int resto = 0;
        for (int i = 0; num >= 0  ; i++) {
            sum += num%10;
            num /= num/10;
        }
        resto = sum % 11;
        return 0;
    }
    
    @Override
    public String toString() {
        return "numero: " + numero + " titular: " + titular + " saldo: " + saldo;
    }
    
}
