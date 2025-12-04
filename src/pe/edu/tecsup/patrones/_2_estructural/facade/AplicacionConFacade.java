package pe.edu.tecsup.patrones._2_estructural.facade;

public class AplicacionConFacade {
    public static void main(String[] args) {

        System.out.println("----- Usando Facade -----");

        FacadeBD bdFacade = new FacadeBD();
        bdFacade.ejecutarConsulta("SELECT * FROM usuarios");

    }
}
