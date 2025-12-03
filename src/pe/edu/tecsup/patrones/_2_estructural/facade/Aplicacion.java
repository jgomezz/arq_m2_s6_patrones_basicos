package pe.edu.tecsup.patrones._2_estructural.facade;

public class Aplicacion {
    public static void main(String[] args) {

        System.out.println("----- Sin usar Facade -----");

        ConexionBD conexion = new ConexionBD();
        ValidadorSQL validador = new ValidadorSQL();
        Logger logger = new Logger();

        logger.log("Iniciando consulta");
        conexion.conectar();
        validador.validar("SELECT * FROM usuarios");
        conexion.cerrar();
        logger.log("Consulta finalizada");

        System.out.println("----- Usando Facade -----");

        BaseDatosFacade bdFacade = new BaseDatosFacade();
        bdFacade.ejecutarConsulta("SELECT * FROM usuarios");

    }
}
