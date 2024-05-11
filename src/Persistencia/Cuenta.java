/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

/**
 *
 * @author POWER
 */
public class Cuenta {
     protected String cedula;
    protected String username;
    protected String password;
    protected String correoElectronico;
    protected int edad;

    public Cuenta(String cedula, String username, String password, String correoElectronico, int edad) {
        this.cedula = cedula;
        this.username = username;
        this.password = password;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public boolean verificarPassword(String password) {
        return this.password.equals(password);
        
    }

    @Override
    public String toString() {
        return "Cuenta:" + 
                "Cedula=" + cedula + 
                "Username=" + username + 
                "Password=" + password + 
                "CorreoElectronico=" + correoElectronico +
                "Edad=" + edad + '}';
    }
    
}
