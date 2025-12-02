package pe.edu.tecsup.patrones._3_comportamiento.estrategia;

/**
 *  Prematricula -> Matricula -> Reporte de matricula -> Fin de ciclo
 *
 *
 *
 *
 */
public class Aplicacion {

    public static void main(String[] args) {

        Estado estado = new PreMatricula();
        realizarProceso(estado);

    }

    public static void realizarProceso(Estado estado) {
        estado.ejecutar();
    }

}
