package pe.edu.tecsup.patrones._3_comportamiento.observer;

public class Aplicacion {

    public static void main(String[] args) {

        // Crear profesor
        Docente docente = new Docente();

        // Crear estudiantes
        Estudiante juan = new EstudianteImpl("Juan");
        Estudiante maria = new EstudianteImpl("María");
        Estudiante pedro = new EstudianteImpl("Pedro");

        // Agregar estudiantes al profesor
        docente.agregarEstudiante(juan);
        docente.agregarEstudiante(maria);
        docente.agregarEstudiante(pedro);

        // Docente hace anuncio → TODOS escuchan
        docente.anunciar("Examen el viernes");
        docente.anunciar("Tarea para mañana");
    }
}
