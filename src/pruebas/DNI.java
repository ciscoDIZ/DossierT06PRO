/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class DNI {
    
    private int dniNum;
    private char letra;
    private static final String LETRAS_POSIBLES="TRWAGMYFPDXBNJZSQVHLCKE";

    public DNI(int dniNum) {
        this.dniNum = dniNum;
        letra = calcularLetra(dniNum).charAt(0);
    }

    public String calcularLetra(){
        return String.valueOf(LETRAS_POSIBLES.charAt(dniNum % 23));
    }
    public String calcularLetra(int num){
        return String.valueOf(LETRAS_POSIBLES.charAt(num % 23));
    }
    public boolean validarDNI(String dni){
        int num = Integer.parseInt(dni.substring(0, 8));
        String letra=dni.substring(dni.length() - 1, dni.length());
        return calcularLetra(num)
                .equals(letra);
    }
    
    public int getDniNum() {
        return dniNum;
    }

    public void setDniNum(int dniNum) {
        this.dniNum = dniNum;
    }

    @Override
    public String toString() {
        return this.dniNum+calcularLetra();
    }
    
}
