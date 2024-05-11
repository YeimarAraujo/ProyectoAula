/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author POWER
 */
public class Permisos {
    private boolean buscarProductos;
    private boolean agregarProductos;
    private boolean dejarReseñas;

    public Permisos(boolean buscarProductos, boolean crearProductos, boolean agregarReseñas) {
        this.buscarProductos = buscarProductos;
        this.agregarProductos = crearProductos;
        this.dejarReseñas = dejarReseñas;
    }

    public boolean buscarProductos() {
        return buscarProductos;
    }

    public boolean agregarProductos() {
        return agregarProductos;
    }

    public boolean dejarReseñas() {
        return dejarReseñas;
    }
}
