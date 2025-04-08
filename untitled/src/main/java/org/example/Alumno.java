package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private List<Asignatura> materiasAprobadas;
    private List<Asignatura> materiasAInscribir;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Asignatura> getMateriasAprobadas() {
        return materiasAprobadas;
    }
    public Alumno() {
        this.materiasAprobadas = new ArrayList<>();
        this.materiasAInscribir = new ArrayList<>();
    }

    public List<Asignatura> getMateriasAInscribir() {
        return materiasAInscribir;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean laAprobo(Asignatura asignatura){
        return materiasAprobadas.contains(asignatura);
    }
    public void  materiasQueAprobe(Asignatura ... asignaturasAprobadas){
        Collections.addAll(this.materiasAprobadas, asignaturasAprobadas);
    }

    public void  meQuieroAnotar(Asignatura ... asignaturasPorAnotar){
        Collections.addAll(this.materiasAInscribir, asignaturasPorAnotar);
    }





}
