package dio.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner{
    
    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
		System.out.println("o resultado de 5 + 4 é: "+calculadora.somar(5, 4));
    }
    
}
