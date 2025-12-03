package pe.edu.tecsup.patrones._1_creacional.factory.caso2;

public class ServiceFactory {
    public UserRepository createRepository() {
        System.out.println("Factory: Creando UserRepository");
        return new UserRepositoryImpl();
    }
}
