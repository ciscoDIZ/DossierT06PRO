/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica30;



/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public class VectorLibre implements Comparable<VectorLibre>{
    protected final Punto inicial;
    protected final Punto terminal;

    public VectorLibre(Punto inicial, Punto terminal) {
        this.inicial = inicial;
        this.terminal = terminal;
    }

    public VectorLibre(Punto terminal) {
        this.terminal = terminal;
        this.inicial = new Punto(0, 0);
    }
    
    public VectorLibre(VectorLibre toCopy){
        this.inicial = toCopy.inicial;
        this.terminal = toCopy.terminal;
    }
    
    public double modulo(){
        return Math.sqrt((this.terminal.getX()*this.terminal.getX())
                +(this.terminal.getY()*this.terminal.getY()));
    }
    
    public VectorLibre multiplicar(double multiplicar){
        return new VectorLibre(new Punto(terminal.getX()*multiplicar
                , terminal.getY()*multiplicar));
    }
    
    public VectorLibre division(double num){
        return new VectorLibre(new Punto((this.terminal.getX()/num)
                , this.terminal.getY()/num));
    }
    
    public VectorLibre normalizacion(){
        return division(this.modulo());
    }
    
    public VectorLibre opuesto(){
        return multiplicar(-1);
    }
    
    public VectorLibre sumar(VectorLibre vl){
        return new VectorLibre(new Punto(this.inicial.getX()+vl.inicial.getX()
                ,this.inicial.getY()+vl.inicial.getY())
                ,new Punto(this.terminal.getX()+vl.terminal.getX()
                        ,this.terminal.getY()+this.terminal.getY()));
    }
    
    public VectorLibre resta(VectorLibre vl){
        return vl.sumar(this.opuesto());
    }

    @Override
    public int compareTo(VectorLibre o) {
        return (int)(o.modulo() -this.modulo());
    }

    
    
    @Override
    public String toString() {
        return this.inicial.toString()+this.terminal.toString();
    }

    @Override
    public boolean equals(Object obj) {
        VectorLibre vl = (VectorLibre)obj;
        return this.inicial.equals(vl.inicial) 
                && this.terminal.equals(vl.terminal);
    }
    
}
