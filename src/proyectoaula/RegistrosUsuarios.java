/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaula;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author POWER
 */
public class RegistrosUsuarios {
     private Map<String, Cuenta> cuentas = new HashMap<>();

    public Map<String, Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Map<String, Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
     
     

    public void registrarCliente(String cedula, String username, String password, String correoElectronico, int edad) {
        Cliente cliente = new Cliente(cedula, username, password, correoElectronico, edad);
        cuentas.put(username, cliente);
    }

    public void registrarEmprendedor(String cedula, String username, String password, String correoElectronico, int edad, String nombreEmprendimiento, String nit, String direccion) {
        Emprendedor emprendedor = new Emprendedor(cedula, username, password, correoElectronico, edad,nit,direccion, nombreEmprendimiento);
        cuentas.put(username, emprendedor);
    }

    public Cuenta iniciarSesion(String username, String password) {
        Cuenta cuenta = cuentas.get(username);
        if (cuenta != null && cuenta.verificarPassword(password)) {
            return cuenta;
        }
        return null;
    }

    public void convertirEnEmprendedor(String username, String nombreEmprendimiento, String nit, String direccion) {
        Cuenta cuenta = cuentas.get(username);
        if (cuenta instanceof Cliente cliente) {
            Emprendedor nuevoEmprendedor = new Emprendedor(cliente.cedula, cliente.username, cliente.password, cliente.correoElectronico, cliente.edad,nit,direccion, nombreEmprendimiento);
            cuentas.put(username, nuevoEmprendedor);
        }
    }
}
