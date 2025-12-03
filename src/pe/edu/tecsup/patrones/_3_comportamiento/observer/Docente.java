package pe.edu.tecsup.patrones._3_comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Docente {

    // Lista de estudiantes que escuchan
    private List<Estudiante> estudiantes = new ArrayList<>();

    // Agregar estudiante
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Hacer anuncio → TODOS escuchan
    public void anunciar(String mensaje) {
        System.out.println("\n PROFESOR: " + mensaje + "\n");

        // Avisar a cada estudiante
        for (Estudiante estudiante : estudiantes) {
            estudiante.escuchar(mensaje);
        }
    }
}
