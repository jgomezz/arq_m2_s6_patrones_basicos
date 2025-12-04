package pe.edu.tecsup.patrones._1_creacional.singleton;

public class Configuracion {

    // Instancia privada y estatica
    private static Configuracion instancia;

    // Parametros de configuracion
    private String url;

    // Constructor privado para evitar instanciacion externa
    private Configuracion() {
        // Inicializa los valores por defecto
        this.url = "Valor por defecto";
    }

    // Metodo publico y estatico para obtener la instancia única
    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    // -------------------------
    //  Parametros de configuracion
    // -------------------------

    // Metodos para manejar la configuracion
    public String getUrl() {
        return url;
    }

    // Metodo para modificar el parametro de configuracion
    public void setUrl(String url) {
        this.url = url;
    }

}
