/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class VendibleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tienda t = new Tienda(2500.0);
        t.agregarArticulo(new Boligrafo("bic", "Azul"));
        t.agregarArticulo(new Lapiz(5, false));
        t.agregarArticulo(new Planta("Marijuana", 0));
        System.out.println(t.mostrarArticulos());
        System.out.println("Que quieres comprar");
        int opcion= sc.nextInt();
        System.out.println("Cuanto dinero me das");
        Double dinero = sc.nextDouble();
        Double cambio = t.venderArticulo(opcion, dinero);
        if(cambio == null){
            System.out.println("No seas rata");
        }else{
            System.out.println("OK tenga su cambio");
        }
        
    }
}
