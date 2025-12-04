package pe.edu.tecsup.patrones._1_creacional.factory._abstract;

public class Aplicacion {

    public static void main(String[] args) {
        ComputadoraFactory factory = new ComputadoraFactory();

        Case case1 = factory.createCase();
        Raton raton1 = factory.createRaton();
        Monitor monitor1 = factory.createMonitor();
        Teclado teclado1 = factory.createTeclado();

    }
}
