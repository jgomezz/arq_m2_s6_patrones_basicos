package pe.edu.tecsup.patrones._3_comportamiento.estrategia;

public class Matricula implements Estado{
    @Override
    public void ejecutar() {
        System.out.println("""
            Solo pueden matricularse los estudiantes que
            hicieron pre-matricula
            """);
    }
}
