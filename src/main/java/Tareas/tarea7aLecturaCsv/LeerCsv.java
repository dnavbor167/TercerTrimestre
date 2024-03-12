/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.tarea7aLecturaCsv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author daniel
 */
public class LeerCsv {

    //método para crear una estructura map donde guarda por cada línea
    //el número de línea y el número de palabras que tiene
    public static Map<Integer, Integer> vehiculoMap(List<String> vehiculo) {
        Map<Integer, Integer> mapVehi = new HashMap<>();
        for (int i = 0; i < vehiculo.size(); i++) {
            int contar = contarPalabrasPorLinea(vehiculo)[i];
            mapVehi.put(i, contar);
        }
        return mapVehi;
    }

    public static int[] contarPalabrasPorLinea(List<String> lineas) {
        int[] arrInt = new int[lineas.size()];
        for (int i = 0; i < lineas.size(); i++) {
            String linea = lineas.get(i);
            
            String[] palabras = linea.trim().split("[,\\s]+");
            arrInt[i] = palabras.length;
        }

        return arrInt;
    }

    //método para separar por comas cada columna y devolver una lista de vehiculos
    public static List<Vehiculo> listaVehiculo(List<String> linea) {
        List<Vehiculo> veList = new ArrayList<>();
        for (String lin : linea) {
            String[] array = lin.split(",");
            Vehiculo vehiculo = new Vehiculo(array[0], array[1],
                    Integer.parseInt(array[2]), array[3], array[4], array[5]);
            veList.add(vehiculo);
        }
        return veList;
    }

    //método para leer un fichero de texto plano
    //usa la clase Files
    public static List<String> leerFichero(String nombreFichero) {
        List<String> lista = new ArrayList<>();
        try {
            //un objeto path es un objeto que te permite poner la ruta de un archivo
            lista = Files.readAllLines(Paths.get(nombreFichero));
        } catch (IOException ex) {
            System.out.println("Error accediendo a " + nombreFichero);
        }
        lista.remove(0);
        return lista;
    }
}
