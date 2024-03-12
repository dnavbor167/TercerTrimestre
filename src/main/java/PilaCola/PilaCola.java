/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaCola;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public abstract class PilaCola<E> {
    //insertamos atributos encapsulados
    protected List<E> lista;
    private final int tamañoMax;

    //insertamos constructor parametrizado
    public PilaCola(int tamañoMax) {
        this.lista = new ArrayList<>(tamañoMax);
        this.tamañoMax = tamañoMax;
    }
    
    //insertamos constructos vacío
    public PilaCola() {
        this.tamañoMax = 0;
    }
    
    //insertamso toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PilaCola{");
        sb.append("lista=").append(lista);
        sb.append(", tama\u00f1oMax=").append(tamañoMax);
        sb.append('}');
        return sb.toString();
    }
    
    
    //insertamos getter y setter
    public List<E> getLista() {
        return lista;
    }
    
    //método para añadir un elemento
    //método para añadir un elemento a la lista
    public final void añadirElemento(E elementoAñadir) {
        if (!estaLlena()) {
            this.lista.add(elementoAñadir);
        }
    }
    
    //método para saber si es está vacío
    public final boolean estaVacio() {
        return this.lista.isEmpty();
    }
    
    //saber si está llena
    public final boolean estaLlena() {
        return this.lista.size() == this.tamañoMax;

    }
    
    //método para saber el número de elementos que hay
    public final int numElemetnos() {
        return this.lista.size();
    }
    
    //saber número máximo de elementos
    public final int numMax() {
        return this.tamañoMax;
    }
    
    //insertamos método abstracto para que cada hija ponga su código
    public abstract E sacarElemento();
}
