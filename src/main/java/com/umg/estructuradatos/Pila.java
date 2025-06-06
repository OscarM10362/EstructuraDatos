/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.estructuradatos;

import java.util.Stack;


    public class Pila<T> {
    private Stack<T> elementos;

    public Pila() {
        this.elementos = new Stack<>();
    }

    public void push(T elemento) {
        elementos.push(elemento);
    }

    public T pop() {
        if (!isEmpty()) {
            return elementos.pop();
        }
        return null; 
    }

    public T peek() {
        if (!isEmpty()) {
            return elementos.peek();
        }
        return null; 
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }

    public void clear() {
        elementos.clear();
    }
}
