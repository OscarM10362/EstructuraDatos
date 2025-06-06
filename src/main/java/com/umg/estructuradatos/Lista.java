/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.estructuradatos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Lista<T> {
    private List<T> elementos;

    public Lista() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public boolean eliminar(T elemento) {
        return elementos.remove(elemento);
    }

    public boolean eliminarSi(Predicate<T> predicado) {
        return elementos.removeIf(predicado);
    }

    public T obtener(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            return elementos.get(indice);
        }
        return null;
    }

    public List<T> obtenerTodos() {
        return Collections.unmodifiableList(elementos); 
    }

    public int tamano() {
        return elementos.size();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public void limpiar() {
        elementos.clear();
    }
}
