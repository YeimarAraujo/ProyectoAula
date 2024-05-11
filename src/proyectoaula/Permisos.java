/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaula;

/**
 *
 * @author POWER
 */
public class Permisos {
    private boolean buscarProductos;
    private boolean agregarProductos;
    private boolean dejarReseņas;

    public Permisos(boolean buscarProductos, boolean crearProductos, boolean agregarReseņas) {
        this.buscarProductos = buscarProductos;
        this.agregarProductos = crearProductos;
        this.dejarReseņas = dejarReseņas;
    }

    public boolean buscarProductos() {
        return buscarProductos;
    }

    public boolean agregarProductos() {
        return agregarProductos;
    }

    public boolean dejarReseņas() {
        return dejarReseņas;
    }
}
