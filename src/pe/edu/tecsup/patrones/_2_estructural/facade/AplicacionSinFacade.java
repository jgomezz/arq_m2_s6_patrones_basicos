package pe.edu.tecsup.patrones._2_estructural.facade;

public class AplicacionSinFacade {
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

    }
}
