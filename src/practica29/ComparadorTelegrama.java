/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica29;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Tote
 */
public class ComparadorTelegrama implements Comparator<Telegrama>{
    Set<Telegrama> lista;

    public ComparadorTelegrama() {
        lista = new TreeSet<>(this);
    }
    
    
    @Override
    public int compare(Telegrama o1, Telegrama o2) {
        return (int)(o2.coste() - o1.coste());
    }
    
    public boolean add(Telegrama t){
        return lista.add(t);
    }
    public TreeSet<Telegrama> getList(){
        return (TreeSet<Telegrama>) this.lista;
    } 
}
