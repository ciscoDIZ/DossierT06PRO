/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica28;



/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class MatrizCuadrada {

    protected final int[][] matriz;

    public MatrizCuadrada(int n) {
        matriz = new int[n][n];
    }

    public MatrizCuadrada suma(MatrizCuadrada mc) {
        int[][] matrizNueva = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizNueva[i][j] = this.getDato(i, j) + mc.getDato(i, j);

            }

        }
        return new MatrizCuadrada(this.matriz.length + mc.matriz.length);
    }

    public int getDato(int i, int j) {
        return matriz[i][j];
    }

    public int getLength() {
        return matriz.length;
    }
    
    public void setDato(int i, int j, int dato){
        this.matriz[i][j] = dato;
    }
    
    
}
