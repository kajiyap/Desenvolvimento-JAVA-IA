package dio_aula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import dio_aula.model.User;

import dio_aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Pedro Kajiya");
        user.setUsername("Kajiya1470");
        user.setPassword("Lorota");

        repository.save(user);

        User user2 = new User();
        user2.setName("Pedro Santos");
        user2.setUsername("Rafa12");
        user2.setPassword("abc123");

        repository.save(user2);

        User user3 = new User();
        user3.setName("Rodrigo");
        user3.setUsername("Rodrigo123");
        user3.setPassword("1234afh");

        repository.save(user3);

        for(User u: repository.findAll()){
            System.out.println(u);
        }

        List<User> users = repository.findByNameContaining("Pedro");
        for(User u: users){
            System.out.println(u);
        }
    }

}
