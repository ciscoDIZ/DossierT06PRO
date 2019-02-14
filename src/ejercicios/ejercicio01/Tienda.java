/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ejercicio01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Tienda  {
    private Double saldoInicial;
    private List<Vendible> stock;

    public Tienda(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
        stock = new ArrayList<>();
    }
    
    public boolean agregarArticulo(Vendible e){
        boolean resultado=false;
        if(e.obtenerPrecio() * 0.70 < saldoInicial){
            stock.add(e);
            resultado = true;
        }
        return resultado;
    }
    
    public Double venderArticulo(int pos, Double dinero){
        Vendible v = stock.get(pos);
        Double cambio = null;
        if (dinero > v.obtenerPrecio()){
            cambio = dinero - v.obtenerPrecio();
        }
        stock.remove(pos);
        return cambio;
    }
    
    public Vendible retirarArticulo(int pos){
        return stock.remove(pos);
    }
    
    public String mostrarArticulos(){
        String resultado = null;
        for (int i = 0; i < stock.size(); i++) {
            resultado += i+" "+stock.get(i).listar();
        }
        return resultado;
    }
}
