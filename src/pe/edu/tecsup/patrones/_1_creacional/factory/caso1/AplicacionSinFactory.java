package pe.edu.tecsup.patrones._1_creacional.factory.caso1;

public class AplicacionSinFactory {

    public static void main(String[] args) {

        Vehiculo sedan = new Sedan();
        sedan.realizarMantenimiento();

        Vehiculo suv = new SUV();
        suv.realizarMantenimiento();

        Vehiculo bus = new Bus();
        bus.realizarMantenimiento();

    }

}
