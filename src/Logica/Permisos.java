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
    private boolean dejarRese�as;

    public Permisos(boolean buscarProductos, boolean crearProductos, boolean agregarRese�as) {
        this.buscarProductos = buscarProductos;
        this.agregarProductos = crearProductos;
        this.dejarRese�as = dejarRese�as;
    }

    public boolean buscarProductos() {
        return buscarProductos;
    }

    public boolean agregarProductos() {
        return agregarProductos;
    }

    public boolean dejarRese�as() {
        return dejarRese�as;
    }
}
