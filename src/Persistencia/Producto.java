/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Datos.Rese�a;
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
    private ArrayList<Rese�a> rese�a = new ArrayList<>();
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
    public void agregarRese�a(Rese�a rese�a) {
        rese�a.add(rese�a);
    }

   @Override
    public ArrayList<Rese�a> obtenerRese�as() {
        return rese�a;
    }

   @Override
    public double obtenerPromedioCalificaciones() {
        if (rese�a.isEmpty()) {
            return 0;
        }

        int total = 0;
        for (Rese�a rese�a : rese�a) {
            total += rese�a.getCalificacion();
        }

        return (double) total / rese�a.size();
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
