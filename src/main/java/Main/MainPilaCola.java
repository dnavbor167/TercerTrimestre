/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import PilaCola.ColaFifo;
import PilaCola.PilaLifo;

/**
 *
 * @author daniel
 */
public class MainPilaCola {
    public static void main(String[] args) {
        //instanciamos la cola y la pila
        ColaFifo<String> cola = new ColaFifo<>(5);
        PilaLifo<String> pila = new PilaLifo<>(5);
        
        //insertamos elementos a la cola
        cola.añadirElemento("1");
        cola.añadirElemento("2");
        cola.añadirElemento("3");
        cola.añadirElemento("4");
        cola.añadirElemento("5");
        //añadimos un elementos más para mostrar de que no se añade
        cola.añadirElemento("6");
        
        //insertamos elementos a la pila
        pila.añadirElemento("7");
        pila.añadirElemento("8");
        pila.añadirElemento("9");
        pila.añadirElemento("10");
        pila.añadirElemento("11");
        //añadimos un elemento más para mostrar de que no se añade
        pila.añadirElemento("12");
        
        //mostramos los números de elementos que hay en la cola y en la pila
        System.out.println("Número de elementos en la cola: " + cola.numElemetnos());
        System.out.println("Número de elementos en la pila: " + pila.numElemetnos());
        
        System.out.println();
        
        //mostramos el número máximo de elementos 
        //que puede haber en la cola y en la pila
        System.out.println("El número máximo de elementos en la cola es " + cola.numElemetnos());
        System.out.println("El número máximo de elementos en la pila es " + pila.numElemetnos());
        
        System.out.println();
        
        //sacamos 2 elementos de cola y de pila
        System.out.println("Sacamos el elemento " + cola.sacarElemento() + " de la cola");
        System.out.println("Sacamos el elemento " + cola.sacarElemento() + " de la cola");
        System.out.println("Sacamos el elemento " + pila.sacarElemento() + " de la pila");
        System.out.println("Sacamos el elemento " + pila.sacarElemento() + " de la pila");
        
        System.out.println();
        
        //número de elementos de la cola y de la pila
        System.out.println("Número de elementos en la cola: " + cola.numElemetnos());
        System.out.println("Número de elementos en la pila: " + pila.numElemetnos());
        
        //añadimos elemento en la cola y en la pila
        cola.añadirElemento("6");
        pila.añadirElemento("12");
        
        System.out.println();
        
        //número de elementos de la cola y de la pila
        System.out.println("Número de elementos en la cola: " + cola.numElemetnos());
        System.out.println("Número de elementos en la pila: " + pila.numElemetnos());
        
        System.out.println();
        
        //mostramos número máximo de elementos de la cola y de la pila
        System.out.println("El número máximo de elementos en la cola es: " + cola.numMax());
        System.out.println("El número máximo de elementos en la pila es: " + pila.numMax());
        
        //miramos si la cola está llenta
        if (cola.estaLlena()) {
            System.out.println("La cola está llena");
        } else {
            System.out.println("La cola está vacía");
        }
        
        //miramos si la pila está llena
        if (pila.estaLlena()) {
            System.out.println("La pila está llena");
        } else {
            System.out.println("La pila está vacía");
        }
        
        System.out.println();
        
        //miramos si la cola está vacía
        if (cola.estaVacio()) {
            System.out.println("La cola está vacía");
        } else {
            System.out.println("La cola no está vacía");
        }
        
        //miramos si la pila está vacía
        if (pila.estaVacio()) {
            System.out.println("La pila está vacía");
        } else {
            System.out.println("La pila no está vacía");
        }
        
        System.out.println();
        //mostramos toda la cola
        System.out.println(cola.toString());
        System.out.println(pila.toString());
        
    }
}
