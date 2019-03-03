/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
class Padre {

    public static void display() {
        System.out.println("Método static pertenciente a clase: Padre");
    }
}

class Hija extends Padre {

    public static void display() {
        System.out.println("Método static pertenciente a clase: Hija");
    }
}

public class Test {

    public static void main(String[] args) {
        Hija obj = new Hija();
//hemos creado un objeto de clase Hija cuando lanzamos
//el método nos informa que pertence a la clase Hija
        obj.display();
//Observar que estamos TOMANDO LA MISMA DIRECCIÓN DE MEMORIA donde
// estaba almacenado el objeto de la clase Hija
//en esta ocasión en lugar de funcionar el polimorfismo
//y que nos desencandene el método de la clase Hija
//nos lanza el método de la clase Padre
        Padre padreObj = obj;
        padreObj.display();

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> lista = numeros.stream()
                .filter(n -> {
                    System.out.println("filtrando " + n);
                    return n % 2 == 0;
                })
                .map(n -> {
                    System.out.println("mapping " + n);
                    return n * n;
                })
                .limit(2)
                .collect(toList());
    }

}
