package pe.edu.tecsup.patrones._1_creacional.factory.caso2;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    UserRepository userRepository;

    public CreateUserUseCaseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User execute(Integer id) {

        return userRepository.findUserById(id);

    }


}
