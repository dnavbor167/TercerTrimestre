/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.tarea7aLecturaCsv;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Main {
    public static void main(String[] args) {
        
        String fichero = "vehiculos.csv";
        List<String> lineaFichero = LeerCsv.leerFichero(fichero);
        System.out.println("Leyendo fichero " + fichero);
        
        List<Vehiculo> listVehiculo = LeerCsv.listaVehiculo(lineaFichero);
        
        for (Vehiculo vehiculo : listVehiculo) {
            System.out.println(vehiculo);
        }
        
    }
}
