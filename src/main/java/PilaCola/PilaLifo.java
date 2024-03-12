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
//EN EJECUCIÓN DEL MAIN SUSTITUIRÁ EL "E" POR EL TIPO DE DATO QUE LE PASEMOS
//EN EL MAIN
public class PilaLifo<E> extends PilaCola<E>{

    //insertamos constructores
    public PilaLifo(int tamañoMax) {
        super(tamañoMax);
    }

    //insertamos método que sobreescribe el padre
    @Override
    public E sacarElemento() {
        if (!super.lista.isEmpty()) {
            return lista.remove(lista.size() - 1);
        }
        return null;
    }

    
}
