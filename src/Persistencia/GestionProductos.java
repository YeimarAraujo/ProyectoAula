/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Datos.Rese�a;
import java.util.ArrayList;

/**
 *
 * @author POWER
 */
interface GestionProductos {
    void agregarCalificacion(int calificacion);
    double obtenerPromedioCalificaciones();
    void agregarRese�a(Rese�a rese�a);
    ArrayList<Rese�a> obtenerRese�as();
}
