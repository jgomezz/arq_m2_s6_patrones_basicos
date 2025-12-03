package pe.edu.tecsup.patrones._2_estructural.adapter;

public class Application {

    public static void main(String[] args) {

        Logger logger = new LoggerSimple();
        //Logger logger = new Log4jAdapter();

        logger.log("Init application.... ! ");
    }

}
