/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Datos.Cuenta;
import java.util.ArrayList;

/**
 *
 * @author POWER
 */
public class Cliente extends Cuenta{
    private ArrayList<Producto>productos= new ArrayList<>();
     private ArrayList<Emprendimiento>emprendimientos = new ArrayList<>();
    
    public Cliente(String cedula, String username, String password, String correoElectronico, int edad) {
        super(cedula, username, password, correoElectronico, edad);
    }
     public Producto buscarProductoPorNombre(String nombreProducto) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                return producto;
            }
        }
        return null; 
    }
       public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
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
    public boolean verificarPassword(String password) {
        return super.verificarPassword(password);
    }
    

 
    
}
