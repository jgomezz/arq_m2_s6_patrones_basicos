package pe.edu.tecsup.patrones._1_creacional.factory.caso1;

public class VehiculoFactory {

    public Vehiculo crearVehiculo(String tipo) {
        if (tipo.equalsIgnoreCase("SUV")) {
            return new SUV();
        } else if (tipo.equalsIgnoreCase("SEDAN")) {
            return new Sedan();
        } else if (tipo.equalsIgnoreCase("BUS")) {
            return new Bus();
        }

        return null;
    }
}
