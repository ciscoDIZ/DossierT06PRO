/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica28;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Tote
 */
public class Matriz2x2 extends MatrizCuadrada {

    Set<Matriz2x2> lista;

    public Matriz2x2(Integer... datos) throws IllegalArgumentException {
        super(2);
        if (datos.length != 4) {
            throw new IllegalArgumentException();
        } else {
            for (int j = 0; j < datos.length; j++) {
                this.matriz[j / this.matriz.length][j % this.matriz.length] = datos[j];
            }
            this.lista = new TreeSet<>((Matriz2x2 o1, Matriz2x2 o2) -> ((o1.getDato(0, 0) * o1.getDato(0, 1))
                    - (o1.getDato(1, 0) * o1.getDato(1, 1)))
                    - ((o2.getDato(0, 0) * o2.getDato(0, 1))
                    - (o2.getDato(1, 0) * o2.getDato(1, 1))));
        }
    }
    private void mostrarLista(){
        lista.forEach((t) -> {
            for (int[] is : t.matriz) {
                for (int i : is) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        });
        System.out.println();
    }
    public boolean add(Matriz2x2 m){
        boolean ret = this.lista.add(m);
        mostrarLista();
        return ret;
    }
    
    public boolean rem(Matriz2x2 m){
        boolean ret = this.lista.remove(m);
        mostrarLista();
        return ret;
    }
}
