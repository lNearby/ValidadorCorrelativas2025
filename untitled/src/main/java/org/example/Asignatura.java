package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asignatura {
    private String nombre;
    private List<Asignatura> correlativas;


    public String getNombre() {
        return nombre;
    }
    public Asignatura() {
        correlativas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Asignatura> getCorrelativas() {
        return correlativas;
    }



    public void agregarCorrelativas(Asignatura ... correlativas) {
        Collections.addAll(this.correlativas, correlativas);
    }

    public Boolean laPuedeCursar(Alumno unAlumno){
        if(this.correlativas.isEmpty()) {
            return true;
        }return correlativas
                .stream().
                allMatch(unaAsignatura -> unAlumno.laAprobo(unaAsignatura));

    }
}


