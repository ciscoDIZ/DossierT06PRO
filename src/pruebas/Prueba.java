/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
@FunctionalInterface
public interface Prueba {
    Integer miPruebita(Integer a, Integer b);
    static Integer reducir(Integer a, Integer b, Prueba p){
        return p.miPruebita(a, b);
    }
}
