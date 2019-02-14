/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

/*Utiliza el código del ejemplo de abstract Animal en el IDE y ejecútalo. Toma
captura de pantalla ¿hay alguna salida de pantalla ? ¿se puede utilizar el constructor de una
clase abstracta ? Ahora trata de crear un objeto: new Animal() y toma captura de pantalla
del error que da el IDE ¿ qué significa el error ?*/


/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class PruebaAbstracto {
    public static void main(String[] args) {
        Pajaro p = new Pajaro();
        Animal a = new Animal() {
            
        };
    }
}
