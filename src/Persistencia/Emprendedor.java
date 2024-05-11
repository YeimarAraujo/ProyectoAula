/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Datos.Cuenta;
import Datos.Rese�a;
import java.util.ArrayList;

/**
 *
 * @author POWER
 */
public class Emprendedor extends Cuenta {
    
    private ArrayList<Producto> productos;
    private ArrayList<Rese�a> rese�as;
    private ArrayList<Emprendimiento> emprendimientos;

    public Emprendedor(String cedula, String username, String password, String correoElectronico, int edad, String nombreEmprendimiento, String nit, String direccion) {
        super(cedula, username, password, correoElectronico, edad);
        this.productos = new ArrayList<>();
        this.rese�as = new ArrayList<>();
        this.emprendimientos = new ArrayList<>();
    }


    public ArrayList<Rese�a> getRese�as() {
        return rese�as;
    }

    public void setRese�as(ArrayList<Rese�a> rese�as) {
        this.rese�as = rese�as;
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

    public void agregarRese�a(Rese�a rese�a) {
        rese�as.add(rese�a);
    }

    public ArrayList<Rese�a> obtenerRese�as() {
        return rese�as;
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
