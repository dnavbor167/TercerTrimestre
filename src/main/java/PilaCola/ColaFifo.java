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
public class ColaFifo<E> extends PilaCola<E>{

    //insertamos constructo
    public ColaFifo(int tamañoMax) {
        super(tamañoMax);
    }

    //insertamos método del padre con sobreescritura
    @Override
    public E sacarElemento() {
        if (!estaVacio()) {
            return lista.remove(0);
        }
        return null;
    }
    
}
