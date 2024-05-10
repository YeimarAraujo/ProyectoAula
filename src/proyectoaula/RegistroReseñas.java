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
public class RegistroReseñas {
  private ArrayList<Reseña> reseñas = new ArrayList<>();

    public void agregarReseña(Reseña reseña) {
        reseñas.add(reseña);
    }

    public ArrayList<Reseña> obtenerReseñas() {
        return reseñas;
    }

    public double obtenerPromedioCalificaciones() {
        if (reseñas.isEmpty()) {
            return 0;
        }

        int total = 0;
        for(Reseña reseña : reseñas) {
            total += reseña.getCalificacion();
        }

        return (double) total / reseñas.size();
    }   
}
