package pe.edu.tecsup.patrones._2_estructural.adapter;

public class Log4jAdapter implements  Logger{

    private Log4j log4j;

    public Log4jAdapter() {
        this.log4j = new Log4j();
    }

    @Override
    public void log(String message) {
        this.log4j.info(message);
    }
}
