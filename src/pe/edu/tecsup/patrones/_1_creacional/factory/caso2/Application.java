package pe.edu.tecsup.patrones._1_creacional.factory.caso2;

public class Application {

    public static void main(String[] args) {

        ServiceFactory factory = new ServiceFactory();

        UserRepository repository = factory.createRepository();
        repository.findUserById(1);

        //CreateUserUseCase createUserUseCase = factory.createCreateUserUseCase();
        //createUserUseCase.execute(2);


    }

}
