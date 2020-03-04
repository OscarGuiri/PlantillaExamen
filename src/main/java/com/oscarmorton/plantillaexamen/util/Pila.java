package com.oscarmorton.plantillaexamen.util;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que implementa una pila genérica
 * @param <T> Tipo de datos con el que trabaja la Pila
 */
public class  Pila<T> implements IPila<T> {
    private ArrayList<T> lista;

    public Pila() {
        lista = new ArrayList<>();
    }

    /**
     * Añade un elemento a la pila
     * @param e Elemento a añadir
     * @return el elemento añadido
     */
    @Override
    public T push(T e) {
        lista.add(e);
        return e;
    }

    /**
     * Extrae un elemento de la pila
     * @return el elemento extraído
     */
    @Override
    public T pop() {
        T e = top();
        lista.remove(lista.size()-1);
        return e;
    }

    /**
     * Obtiene el tamaño de la pila
     * @return número de elementos de la pila
     */
    @Override
    public int size() {
        return lista.size();
    }

    /**
     * Consulta el siguiente elemento de la pila (sin extraerlo)
     * @return el siguiente elemento de la pila
     */
    @Override
    public T top() {
        return lista.get(lista.size()-1);
    }

    /**
     * Comprueba si una pila está vacía
     * @return True si está vacía False en caso contrario
     */
    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    @Override
    public String toString() {
        return "Pila: " + lista.toString();
    }

}
