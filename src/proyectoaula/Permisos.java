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
    private boolean crearProductos;
    private boolean dejarReseņas;

    public Permisos(boolean buscarProductos, boolean crearProductos, boolean dejarReseņas) {
        this.buscarProductos = buscarProductos;
        this.crearProductos = crearProductos;
        this.dejarReseņas = dejarReseņas;
    }

    public boolean buscarProductos() {
        return buscarProductos;
    }

    public boolean crearProductos() {
        return crearProductos;
    }

    public boolean dejarReseņas() {
        return dejarReseņas;
    }
}
