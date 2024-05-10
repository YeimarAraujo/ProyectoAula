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
public class Emprendimiento implements GestionProductos {
     private String nombre;
    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<Reseña> reseñas = new ArrayList<>();

    public Emprendimiento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Reseña> getReseñas() {
        return reseñas;
    }

    public void setReseñas(ArrayList<Reseña> reseñas) {
        this.reseñas = reseñas;
    }

     @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

     @Override
    public void eliminarProducto(String codigo) {
        productos.removeIf(p -> p.getCodigo().equals(codigo));
    }
    
     @Override
    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

     @Override
    public ArrayList<Producto> buscarProductoPorNombre(String nombre) {
        ArrayList<Producto> resultado = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                resultado.add(producto);
            }
        }
        return resultado;
    }

    public void agregarReseña(Reseña reseña) {
        reseñas.add(reseña);
    }

    public ArrayList<Reseña> obtenerReseñas() {
        return reseñas;
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

}
