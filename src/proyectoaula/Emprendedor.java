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
public class Emprendedor extends Cuenta {

    private String nombreEmprendimiento;
    private String nit;
    private String direccion;
    private Emprendimiento emprendimiento;
    private ArrayList<Producto> productos;
    private ArrayList<Reseña> reseñas;

    public Emprendedor(String cedula, String username, String password, String correoElectronico, int edad, String nombreEmprendimiento, String nit, String direccion) {
        super(cedula, username, password, correoElectronico, edad);
        this.nombreEmprendimiento = nombreEmprendimiento;
        this.nit = nit;
        this.direccion = direccion;
        this.emprendimiento = emprendimiento;
        this.productos = new ArrayList<>();
        this.reseñas = new ArrayList<>();
    }

    public String getNombreEmprendimiento() {
        return nombreEmprendimiento;
    }

    public void setNombreEmprendimiento(String nombreEmprendimiento) {
        this.nombreEmprendimiento = nombreEmprendimiento;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Reseña> getReseñas() {
        return reseñas;
    }

    public void setReseñas(ArrayList<Reseña> reseñas) {
        this.reseñas = reseñas;
    }

    public Emprendimiento getEmprendimiento() {
        return emprendimiento;
    }

    public void setEmprendimiento(Emprendimiento emprendimiento) {
        this.emprendimiento = emprendimiento;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

   

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String codigo) {
        productos.removeIf(p -> p.getCodigo().equals(codigo));
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

    @Override
    public String toString() {
        return "Emprendedor{"
                + "nombreEmprendimiento='" + nombreEmprendimiento + '\''
                + ", nit='" + nit + '\''
                + ", direccion='" + direccion + '\''
                + ", productos=" + productos.size()
                + ", reseñas=" + reseñas.size()
                + ", cedula='" + cedula + '\''
                + ", username='" + username + '\''
                + ", correoElectronico='" + correoElectronico + '\''
                + ", edad=" + edad
                + '}';
    }
}
