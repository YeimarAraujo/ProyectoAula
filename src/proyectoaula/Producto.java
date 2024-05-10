/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaula;

import java.util.ArrayList;

/**
 *
 * @author POWER
 */
public class Producto {
   protected String codigo;
    protected String nombre;
    protected double precio;
    protected String descripcion;
    protected ArrayList<Reseña> reseñas = new ArrayList<>();

    public Producto(String codigo, String nombre, double precio, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void agregarReseña(Reseña reseña) {
        reseñas.add(reseña);
    }

    public double obtenerPromedioCalificaciones() {
        if (reseñas.isEmpty()) {
            return 0;
        }

        int total = 0;
        for (Reseña reseña : reseñas) {
            total += reseña.getCalificacion();
        }

        return (double) total / reseñas.size();
    }

    public ArrayList<Reseña> obtenerReseñas() {
        return reseñas;
    }

    @Override
    public String toString() {
        return "Producto:" +
                "  codigo ='" + codigo + '\'' +
                ", nombre ='" + nombre + '\'' +
                ", precio =" + precio +
                ", descripcion ='" + descripcion + '\'' +
                '}';
    }
 
}
