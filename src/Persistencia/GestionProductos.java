/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Datos.Reseña;
import java.util.ArrayList;

/**
 *
 * @author POWER
 */
interface GestionProductos {
    void agregarCalificacion(int calificacion);
    double obtenerPromedioCalificaciones();
    void agregarReseña(Reseña reseña);
    ArrayList<Reseña> obtenerReseñas();
}
