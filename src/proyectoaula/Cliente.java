/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaula;

/**
 *
 * @author POWER
 */
public class Cliente extends Cuenta{
    
    public Cliente(String cedula, String username, String password, String correoElectronico, int edad) {
        super(cedula, username, password, correoElectronico, edad);
    }

    @Override
    public boolean verificarPassword(String password) {
        return super.verificarPassword(password);
    }
    

 
    
}
