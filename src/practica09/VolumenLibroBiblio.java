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
public class VolumenLibroBiblio extends VolumenLibro{
    private String prestado;
    
    public VolumenLibroBiblio(String propietario, String titulo, String resumen, int paginas, String... autores) {
        super(propietario, titulo, resumen, paginas, autores);
        prestado = null;
    }
    public boolean prestar(String nombre, VolumenLibroBiblio vlb){
        boolean resultado = vlb.prestado == null;
        if(resultado){
            prestado = nombre;
        }
        return resultado;
    }
    
    public boolean devolver(VolumenLibroBiblio vlb){
        boolean resultado = false;
        if(vlb.prestado != null){
            vlb.prestado = null;
            resultado = true;
        }
        return resultado;
    }

    public String getPrestado() {
        return prestado;
    }

    public void setPrestado(String prestado) {
        this.prestado = prestado;
    }
    
}
