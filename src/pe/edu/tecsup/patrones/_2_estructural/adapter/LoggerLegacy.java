package pe.edu.tecsup.patrones._2_estructural.adapter;

public class LoggerLegacy implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[Legacy INFO] " + message);
    }
}
