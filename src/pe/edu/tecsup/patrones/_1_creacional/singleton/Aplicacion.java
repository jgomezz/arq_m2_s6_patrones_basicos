package pe.edu.tecsup.patrones._1_creacional.singleton;

public class Aplicacion {

    public static void main(String[] args) {

        System.out.println("---------------------------------" );

        Configuracion config1 = Configuracion.getInstancia();
        config1.setUrl("http://codigo.edu.pe");
        System.out.println("Config1 url: " + config1.getUrl());

        Configuracion config2 = Configuracion.getInstancia();
        System.out.println("Config2 url: " + config2.getUrl());

        Configuracion config3 = Configuracion.getInstancia();
        System.out.println("Config3 url: " + config3.getUrl());

        System.out.println("---------------------------------" );

        config1.setUrl("http://tecsup.edu.pe");
        System.out.println("Config1 url: " + config1.getUrl());
        System.out.println("Config2 url: " + config2.getUrl());
        System.out.println("Config3 url: " + config3.getUrl());


    }
}
