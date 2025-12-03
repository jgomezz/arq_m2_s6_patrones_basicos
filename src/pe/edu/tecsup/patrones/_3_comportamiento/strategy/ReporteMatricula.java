package pe.edu.tecsup.patrones._3_comportamiento.strategy;

public class ReporteMatricula implements Estado{
    @Override
    public void ejecutar() {
        System.out.println("""
            Obtengo el reporte de la semana 8 del ciclo del estudiante
            """);
    }
}
