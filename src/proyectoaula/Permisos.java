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
    private boolean dejarRese�as;

    public Permisos(boolean buscarProductos, boolean crearProductos, boolean dejarRese�as) {
        this.buscarProductos = buscarProductos;
        this.crearProductos = crearProductos;
        this.dejarRese�as = dejarRese�as;
    }

    public boolean buscarProductos() {
        return buscarProductos;
    }

    public boolean crearProductos() {
        return crearProductos;
    }

    public boolean dejarRese�as() {
        return dejarRese�as;
    }
}
