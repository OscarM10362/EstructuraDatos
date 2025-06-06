/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.estructuradatos;

import java.util.LinkedList;
import java.util.Queue;


public class Cola<T> {
    private Queue<T> elementos;

    public Cola() {
        this.elementos = new LinkedList<>();
    }

    public void enqueue(T elemento) {
        elementos.offer(elemento);
    }

    public T dequeue() {
        return elementos.poll(); 
    }

    public T peek() {
        return elementos.peek();
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
