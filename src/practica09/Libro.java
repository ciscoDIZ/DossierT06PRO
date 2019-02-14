/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica09;

import java.util.HashSet;

/**
 *
 * @author Francisco A Domínguez Iceta 1ºDAW.
 */
public class Libro {
    private HashSet<String> autores;
    private String titulo;
    private String resumen;
    private int paginas;

    public Libro(String titulo, String resumen, int paginas, String ...autores) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.paginas = paginas;
        this.autores = new HashSet<>();
        for (String autor : autores) {
            this.autores.add(autor);
        }
    }
    
    public boolean libroGrande(){
        return paginas > 500;
    }

    public HashSet<String> getAutores() {
        return autores;
    }

    public void setAutores(HashSet<String> autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", resumen=" + resumen + ", paginas=" + paginas;
    }
    
    
}
