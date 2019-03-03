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
class Padre{
    int datoPadre;
    class Anidada{
        int datoHijo;
        public Anidada(){
            datoHijo = 5;
        }
    }
}
public class MainPruebaAnidadas {
    public static void main(String[] args) {
        Padre objetoPadre = new Padre();
        Padre.Anidada objetoHijo = objetoPadre.new Anidada();
        System.out.println(objetoHijo.datoHijo);
    }
}
