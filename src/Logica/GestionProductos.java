/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author POWER
 */
interface GestionProductos {
    void agregarProducto(Producto producto);
    void eliminarProducto(String codigo);
    Producto buscarProductoPorCodigo(String codigo);
    ArrayList<Producto> buscarProductoPorNombre(String nombre);
}
