/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.util.Date;

/**
 *
 * @author POWER
 */
public class Rese�a {
     private String descripcion;
    private int calificacion;
    private Date fecha;

    public Rese�a(String descripcion, int calificacion) {
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
        return "Rese�a" + 
                "Descripcion=" + descripcion + 
                "Calificacion=" + calificacion + 
                "Fecha=" + fecha + '}';
    }

    public void add(Rese�a rese�a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    
}
