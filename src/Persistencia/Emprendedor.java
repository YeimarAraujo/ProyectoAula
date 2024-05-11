/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Datos.Cuenta;
import Datos.Reseña;
import java.util.ArrayList;

/**
 *
 * @author POWER
 */
public class Emprendedor extends Cuenta {
    
    private ArrayList<Producto> productos;
    private ArrayList<Reseña> reseñas;
    private ArrayList<Emprendimiento> emprendimientos;

    public Emprendedor(String cedula, String username, String password, String correoElectronico, int edad, String nombreEmprendimiento, String nit, String direccion) {
        super(cedula, username, password, correoElectronico, edad);
        this.productos = new ArrayList<>();
        this.reseñas = new ArrayList<>();
        this.emprendimientos = new ArrayList<>();
    }


    public ArrayList<Reseña> getReseñas() {
        return reseñas;
    }

    public void setReseñas(ArrayList<Reseña> reseñas) {
        this.reseñas = reseñas;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(String codigo,String nombre, double precio, String descripcion) {
        Producto nuevoProducto = new Producto(codigo, nombre, precio, descripcion);
        productos.add(nuevoProducto);
    }

    public void eliminarProducto(String codigo) {
        productos.removeIf(p -> {
            return p.getCodigo().equals(codigo);
        });
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
  

    @Override
    public String toString() {
        return "Emprendedor:"
                + "Cedula='" + cedula + '\''
                + "Username='" + username + '\''
                + "CorreoElectronico='" + correoElectronico + '\''
                + "Edad=" + edad
                + '}';
    }

}
