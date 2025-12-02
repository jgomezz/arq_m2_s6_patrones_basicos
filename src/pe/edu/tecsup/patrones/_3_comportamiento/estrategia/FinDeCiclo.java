package pe.edu.tecsup.patrones._3_comportamiento.estrategia;

public class FinDeCiclo implements Estado{
    @Override
    public void ejecutar() {
        System.out.println("""
            Se obtiene el promedio del final del estudiante
            matriculado
            """);
    }
}
