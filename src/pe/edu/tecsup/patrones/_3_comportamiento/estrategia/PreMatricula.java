package pe.edu.tecsup.patrones._3_comportamiento.estrategia;

public class PreMatricula implements Estado{
    @Override
    public void ejecutar() {
        System.out.println("""
            Solo pueden acceder los estudiantes que no deben 
            ninguna pension y aprobaron el ciclo anterior
            """);
    }
}
