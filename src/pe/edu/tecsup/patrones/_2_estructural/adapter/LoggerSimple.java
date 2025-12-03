package pe.edu.tecsup.patrones._2_estructural.adapter;

public class LoggerSimple implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[INFO] " + message);
    }
}
