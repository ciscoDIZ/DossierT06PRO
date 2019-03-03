/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica29;

/*Crear la clase Telegrama con atributos: String texto, String remitente, String
receptor, double precioPalabra Deberá tener como mínimo un constructor. La longitud del
atributo texto determina el coste del telegrama al multiplicarlo por precioPalabra. Deberá
haber un método: double coste() y un método toString() que ponga una cabecera que diga
quién es el remitente, a quién va dirigido y luego el texto del telegrama. Crear un programa
que use la clase telegrama donde el usuario introduzca los datos de cada telegrama y estos
queden insertados ordenados por coste en una lista. Se debe crear una nueva clase:
ComparadorTelegrama que implemente Comparator para mantener la lista ordenada*/

/**
 *
 * @author Tote
 */
public class Telegrama {
   private String texto;
   private String remitente;
   private String receptor;
   private double precioPalabra;
   
   public Telegrama(String texto, String remitente, String receptor
           , double precioPalabra){
       this.texto = texto;
       this.remitente = remitente;
       this.receptor = receptor;
       this.precioPalabra= precioPalabra;
   }
   
   public double coste(){
       return precioPalabra + texto.length();
   }

    @Override
    public String toString() {
        return "Remitente: " + remitente + "\nreceptor: " + receptor + "\nTexto:\n" + texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public double getPrecioPalabra() {
        return precioPalabra;
    }

    public void setPrecioPalabra(double precioPalabra) {
        this.precioPalabra = precioPalabra;
    }

    
}
