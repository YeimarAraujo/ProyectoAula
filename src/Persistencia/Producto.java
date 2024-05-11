/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Datos.Reseña;
import java.util.ArrayList;

/**
 *
 * @author POWER
 */
public class Producto implements GestionProductos {
    private String codigo;
    private String nombre;
    private double precio;
    private String descripcion;
    private ArrayList<Reseña> reseña = new ArrayList<>();
    private ArrayList<Emprendimiento> emprendimientos = new ArrayList<>();
    private ArrayList<Integer> calificaciones = new ArrayList<>();
    private static ArrayList<Producto> productos = new ArrayList<>();
    
    public Producto(String codigo, String nombre, double precio, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Producto(String codigo) {
        this.codigo = codigo;
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

    @Override
    public String toString() {
        return "Producto:" +
                "Codigo ='" + codigo + '\'' +
                "Nombre ='" + nombre + '\'' +
                "Precio =" + precio +
                "Descripcion ='" + descripcion + '\'' +
                '}';
    }

    @Override
    public void agregarCalificacion(int calificacion) {
        calificaciones.add(calificacion);
    }

   @Override
    public void agregarReseña(Reseña reseña) {
        reseña.add(reseña);
    }

   @Override
    public ArrayList<Reseña> obtenerReseñas() {
        return reseña;
    }

   @Override
    public double obtenerPromedioCalificaciones() {
        if (reseña.isEmpty()) {
            return 0;
        }

        int total = 0;
        for (Reseña reseña : reseña) {
            total += reseña.getCalificacion();
        }

        return (double) total / reseña.size();
    }
    public void agregarEmprendimiento(Emprendimiento emprendimiento) {
        emprendimientos.add(emprendimiento);
    }
    public Emprendimiento buscarEmprendimiento(String nombre) {
        for (Emprendimiento emp : emprendimientos) {
            if (emp.getNombreEmprendimiento().equals(nombre)) {
                return emp;
            }
        }
        return null;
    }
     public static Producto buscarPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
     }

}
