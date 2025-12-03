package pe.edu.tecsup.patrones._1_creacional.factory.caso1;

public class AplicacionConFactory {

    public static void main(String[] args) {

        VehiculoFactory factory = new VehiculoFactory();

        Vehiculo sedan = factory.crearVehiculo("SEDAN");
        sedan.realizarMantenimiento();

        Vehiculo suv = factory.crearVehiculo("SUV");
        suv.realizarMantenimiento();

        Vehiculo bus = factory.crearVehiculo("BUS");
        suv.realizarMantenimiento();

    }

}
