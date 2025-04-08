package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    void inscripcionAprobada() {
        //-----------Asignaturas-----------//
        Asignatura disenoSistemas = new Asignatura();
        Asignatura ads = new Asignatura();
        Asignatura pdep = new Asignatura();
        Asignatura algoritmos = new Asignatura();
        Asignatura syo = new Asignatura();
        Asignatura analisis = new Asignatura();
        Asignatura analisis2 = new Asignatura();
        //-----------Correlativas-----------//
        disenoSistemas.agregarCorrelativas(pdep);
        disenoSistemas.agregarCorrelativas(ads);
        pdep.agregarCorrelativas(algoritmos);
        analisis2.agregarCorrelativas(analisis);
        ads.agregarCorrelativas(syo);

        Inscripcion inscripcion = new Inscripcion();

        //Test 1 Todas materias verificadas  con y sin correlativas//

        Alumno pepe = new Alumno();
        pepe.meQuieroAnotar(syo);
        pepe.meQuieroAnotar(pdep);
        pepe.meQuieroAnotar(analisis);
        pepe.materiasQueAprobe(algoritmos);

        assertTrue(inscripcion.inscripcionAprobada(pepe));


    }
    @Test
    void inscripcionRechazada() {
        //-----------Asignaturas-----------//
        Asignatura disenoSistemas = new Asignatura();
        Asignatura ads = new Asignatura();
        Asignatura pdep = new Asignatura();
        Asignatura algoritmos = new Asignatura();
        Asignatura syo = new Asignatura();
        Asignatura analisis = new Asignatura();
        Asignatura analisis2 = new Asignatura();
        //-----------Correlativas-----------//
        disenoSistemas.agregarCorrelativas(pdep);
        disenoSistemas.agregarCorrelativas(ads);
        pdep.agregarCorrelativas(algoritmos);
        analisis2.agregarCorrelativas(analisis);
        ads.agregarCorrelativas(syo);

        Inscripcion inscripcion = new Inscripcion();
        //Test 2 Algunas verificadas y una que no puede cursar
        Alumno juan = new Alumno();

        juan.meQuieroAnotar(analisis);
        juan.materiasQueAprobe(algoritmos);
        juan.meQuieroAnotar(disenoSistemas);

        assertTrue(inscripcion.inscripcionAprobada(juan));
    }

}