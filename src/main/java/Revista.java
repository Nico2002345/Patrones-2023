
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicol
 */
public class Revista {
 
    private String titulo;
    private int copiasDisponibles;
    private int copiasTotales;
    private String fechaPublicacion;

    public Revista(String titulo, int copiasTotales, String fechaPublicacion) {
        this.titulo = titulo;
        this.copiasDisponibles = copiasTotales;
        this.copiasTotales = copiasTotales;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    public int getCopiasTotales() {
        return copiasTotales;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
}


