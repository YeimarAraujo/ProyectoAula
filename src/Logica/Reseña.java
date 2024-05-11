/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Date;

/**
 *
 * @author POWER
 */
public class Reseña {
     private String descripcion;
    private int calificacion;
    private Date fecha;

    public Reseña(String descripcion, int calificacion) {
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.fecha = new Date();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Reseña" + 
                "Descripcion=" + descripcion + 
                "Fecha=" + fecha + '}';
    }

    
}
