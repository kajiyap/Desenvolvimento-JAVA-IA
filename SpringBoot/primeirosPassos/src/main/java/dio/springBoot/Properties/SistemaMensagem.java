package dio.springBoot.Properties;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
    
    @Value("${name:Noreply}")
    private String nome;
    @Value("${emaill:Noreply@gmail.com}")
    private String email;
    @Value("${telefones:1145651725")
    private List<Long> telefone;

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Mensagem enviada por: " + nome + "\nE-mail: " + email + "\nCom telefone: " + telefone);
        System.out.println("Cadastro aprovado");
    }
}
