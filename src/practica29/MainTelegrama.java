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

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Tote
 */
public class MainTelegrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComparadorTelegrama ct = new ComparadorTelegrama();
        boolean salir = false;
        while (!salir) {            
            System.out.println("Opciones:\nn)añadir nuevo telegrama\nv) ver lista\ns) salir");
            char opt = sc.nextLine().toLowerCase().charAt(0);
            switch (opt) {
                case 'n':
                    
                    System.out.println("Introducir remitente:");
                    String remitente = sc.nextLine();
                    
                    System.out.println("Introducir receptor:");
                    String receptor = sc.nextLine();
                    
                    System.out.println("Inrtoducir precio palabra:");
                    double precioPalabra = sc.nextDouble();
                    
                    System.out.println("Introducir texto:");
                    sc.nextLine();
                    String texto = sc.nextLine();
                    
                    ct.add(new Telegrama(texto, remitente, receptor, precioPalabra));
                    break;
                case 'v':
                    TreeSet<Telegrama> ts = ct.getList();
                    for (Telegrama t : ts) {
                        System.out.println(t);
                    }
                    break;
                case 's':
                    salir = true;
                    break;
                default:
                    System.out.println("No te entiendo");;
            }
           
        }
    }
}
