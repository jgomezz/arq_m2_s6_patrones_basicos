package pe.edu.tecsup.patrones._2_estructural.facade;

public class FacadeBD {
    private ConexionBD conexion;
    private ValidadorSQL validador;
    private Logger logger;

    public FacadeBD() {
        this.conexion = new ConexionBD();
        this.validador = new ValidadorSQL();
        this.logger = new Logger();
    }

    public void ejecutarConsulta(String sql) {
        logger.log("Iniciando consulta");
        conexion.conectar();
        validador.validar(sql);
        // Aquí se ejecutaría la consulta SQL
        conexion.cerrar();
        logger.log("Consulta finalizada");
    }
}
