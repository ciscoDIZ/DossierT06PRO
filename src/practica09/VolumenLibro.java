/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica09;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class VolumenLibro extends Libro{
    
    private String propietario;
    private Estado estadoConsevacion;
    private boolean variosTomos;
    private static int contador;
    private int id;
    
    public VolumenLibro(String propietario, String titulo, String resumen, int paginas, String... autores) {
        super(titulo, resumen, paginas, autores);
        this.propietario = propietario;
        estadoConsevacion = Estado.BUENO;
        variosTomos = super.libroGrande();
        id = ++contador;
        
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Estado getEstadoConsevacion() {
        return estadoConsevacion;
    }

    public void setEstadoConsevacion(Estado estadoConsevacion) {
        this.estadoConsevacion = estadoConsevacion;
    }

    @Override
    public String toString() {
        return "propietario=" + propietario + ", estadoConsevacion=" 
                + estadoConsevacion + ", variosTomos=" + variosTomos + super.toString();
    }
    
    
}
