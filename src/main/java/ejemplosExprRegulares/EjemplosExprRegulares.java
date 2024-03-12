/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosExprRegulares;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author daniel
 */
public class EjemplosExprRegulares {
    public static void main(String[] args) {
        //Todos los archivos que están en la raíz del proyecto son accesibles
        //directamente con su nombre
        List<String> lineasFicheros;
        String fichero = "ssh_config";
        System.out.println("Leyendo el fichero " + fichero);
        lineasFicheros = leerFichero(fichero);
        
        //mostrar número de palabras por línea
//        lineasFicheros.forEach(linea->{
//            int numeroPalabras = contarPalabrasPorLinea(linea);
//            System.out.println(linea + " --> " + numeroPalabras);
//        });
        
        //mostrar número de palabras por línea
        lineasFicheros.forEach(linea->{
            int numeroPalabras = contarPalabraCocretaPorLinea("is", linea);
            System.out.println(linea + " --> " + numeroPalabras);
        });
    }
    
    //Primera expresión regular
    public static int contarPalabrasPorLinea(String linea) {
        //en java para escapar la barra invertida hay que añadir otra
        //barra addicional
        linea = linea.trim(); //este quita los espacios alante y atras
        //PARA CONTAR LOS ESPACIOS Y SI HAY MÁS DE UN ESPACIO LO CUENTE COMO
        //EL MISMO
        String[] array = linea.split("\\s+");
        
        return array.length;
    }
    
    //Segunda expresión regular
    public static int contarPalabraCocretaPorLinea(String palabra, String linea) {
        //para que me coja la palabra exacta:
        String regex = "\\b"+palabra+"\\b";
        
        //la clase Pattern crea un objeto con la representación
        //compilada o procesada de la expresión regulara. Permite crea
        //un objeto Matcher -- Pattern + regex (String)
        Pattern patron = Pattern.compile(regex);
        
        //Matcher se crea a partir del objeto Pattern
        //este objeto permite hacer operaciones usando el regex sobre
        //el string
        //matches() si cumple el patrón
        //find() encontrar partes del String que cumple el patrón
        Matcher buscador = patron.matcher(linea);
        
        int contador = 0;
            while (buscador.find()) {
                contador++;
            }
        return contador;
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
        return lista;
    }
}
