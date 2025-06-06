/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.estructuradatos;

import com.umg.persistencia.entidades.Tarea;
import java.util.List;


public class ArbolTarea {
    public Tarea findRoot(Tarea tarea) {
        if (tarea == null) {
            return null;
        }
        Tarea current = tarea;
        while (current.getParentTask() != null) {
            current = current.getParentTask();
        }
        return current;
    }

    
    public void collectSubtasks(Tarea parent, List<Tarea> collectedSubtasks) {
        if (parent == null || parent.getSubTareas() == null || parent.getSubTareas().isEmpty()) {
            return;
        }
        for (Tarea subTarea : parent.getSubTareas()) {
            collectedSubtasks.add(subTarea);
            collectSubtasks(subTarea, collectedSubtasks);
        }
    }
}
