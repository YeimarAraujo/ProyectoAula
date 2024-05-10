/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaula;

import java.util.ArrayList;

/**
 *
 * @author POWER
 */
public class RegistroRese�as {
  private ArrayList<Rese�a> rese�as = new ArrayList<>();

    public void agregarRese�a(Rese�a rese�a) {
        rese�as.add(rese�a);
    }

    public ArrayList<Rese�a> obtenerRese�as() {
        return rese�as;
    }

    public double obtenerPromedioCalificaciones() {
        if (rese�as.isEmpty()) {
            return 0;
        }

        int total = 0;
        for(Rese�a rese�a : rese�as) {
            total += rese�a.getCalificacion();
        }

        return (double) total / rese�as.size();
    }   
}
