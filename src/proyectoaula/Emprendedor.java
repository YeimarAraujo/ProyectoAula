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
    private ArrayList<Rese�a> rese�as;

    public Emprendedor(String cedula, String username, String password, String correoElectronico, int edad, String nombreEmprendimiento, String nit, String direccion) {
        super(cedula, username, password, correoElectronico, edad);
        this.nombreEmprendimiento = nombreEmprendimiento;
        this.nit = nit;
        this.direccion = direccion;
        this.emprendimiento = emprendimiento;
        this.productos = new ArrayList<>();
        this.rese�as = new ArrayList<>();
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

    public ArrayList<Rese�a> getRese�as() {
        return rese�as;
    }

    public void setRese�as(ArrayList<Rese�a> rese�as) {
        this.rese�as = rese�as;
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

    @Override
    public String toString() {
        return "Emprendedor{"
                + "nombreEmprendimiento='" + nombreEmprendimiento + '\''
                + ", nit='" + nit + '\''
                + ", direccion='" + direccion + '\''
                + ", productos=" + productos.size()
                + ", rese�as=" + rese�as.size()
                + ", cedula='" + cedula + '\''
                + ", username='" + username + '\''
                + ", correoElectronico='" + correoElectronico + '\''
                + ", edad=" + edad
                + '}';
    }
}
