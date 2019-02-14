/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Biblioteca {
    private String nombreBiblioteca;
    private Map<String, ArrayList<VolumenLibroBiblio>> librosBiblio;

    public Biblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        librosBiblio = new HashMap<>();
    }
    
    public  void add(String titulo, VolumenLibroBiblio ...volumenes){
        ArrayList<VolumenLibroBiblio> volum = new ArrayList<>();
        for (VolumenLibroBiblio vol : volumenes) {
            volum.add(vol);
        }
        librosBiblio.put(titulo, volum);
    }
}
