package com.oscarmorton.plantillaexamen.util;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Clase que implementa una Cola genérica
 * @param <T> Tipo de datos que utiliza la cola
 */
public class Cola<T> implements ICola<T> {
    /** Almacenamiento de la cola */
    private LinkedList<T> cola;

    public Cola() {
        cola = new LinkedList<>();
    }

    /**
     * Añade un elemento a la Cola
     * @param e Elemento a añadir
     * @return True
     */
    @Override
    public boolean add(T e) {
        return cola.add(e);
    }

    /**
     * Elimina un elemento de la Cola
     * @return el elemento extraído
     */
    @Override
    public T remove() {
        return cola.remove();
    }

    /**
     * Obtiene el tamaño de la Cola
     * @return número de elemento que contiene la Cola
     */
    @Override
    public int size() {
        return cola.size();
    }

    /**
     * Consulta el siguiente elemento de la Cola
     * @return el siguiente elemento de la Cola
     */
    @Override
    public T peek() {
        return cola.peek();
    }

    /**
     * Determina si la cola está vacía
     * @return True si no hay elemento, False en caso contrario
     */
    @Override
    public boolean isEmpty() {
        return cola.isEmpty();
    }

    /**
     * Obtiene la representación de la Cola como un String
     * @return
     */
    @Override
    public String toString() {
        return "Cola: " + cola.toString();
    }
}
