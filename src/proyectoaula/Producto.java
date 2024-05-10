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
    protected ArrayList<Rese�a> rese�as = new ArrayList<>();

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

    public void agregarRese�a(Rese�a rese�a) {
        rese�as.add(rese�a);
    }

    public double obtenerPromedioCalificaciones() {
        if (rese�as.isEmpty()) {
            return 0;
        }

        int total = 0;
        for (Rese�a rese�a : rese�as) {
            total += rese�a.getCalificacion();
        }

        return (double) total / rese�as.size();
    }

    public ArrayList<Rese�a> obtenerRese�as() {
        return rese�as;
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
