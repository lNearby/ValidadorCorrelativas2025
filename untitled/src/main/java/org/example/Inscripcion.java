package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private List<Asignatura> asignaturas;

    public void  materiasDeLaInscripcion(Asignatura ... asignaturas){
        Collections.addAll(this.asignaturas, asignaturas);
    }
    public void agregarAsignaturasDelAlumno(Alumno alumno) {
        asignaturas.addAll(alumno.getMateriasAInscribir());
    }
    public Inscripcion(){
        this.asignaturas = new ArrayList<>();
    }


    public boolean inscripcionAprobada(Alumno alumno) {
        this.agregarAsignaturasDelAlumno(alumno);
        return asignaturas
                .stream()
                .allMatch(asignatura -> asignatura.laPuedeCursar(alumno));
    }
}
