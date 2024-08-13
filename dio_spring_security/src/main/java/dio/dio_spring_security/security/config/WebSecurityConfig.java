package dio.dio_spring_security.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

@Configuration
@EnableMethodSecurity(prePostEnabled = true) // Habilita segurança baseada em anotações, como @PreAuthorize e @PostAuthorize
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Configuração das regras de autorização para diferentes URLs e métodos HTTP
        http.authorizeHttpRequests(authz -> authz
            .requestMatchers("/").permitAll() // Permite acesso irrestrito ao caminho raiz
            .requestMatchers(HttpMethod.POST, "/login").permitAll() // Permite acesso irrestrito ao endpoint de login via POST
            .requestMatchers("/managers").hasAnyRole("MANAGERS") // Restringe acesso ao endpoint "/managers" apenas para usuários com o papel "MANAGERS"
            .requestMatchers("/users").hasAnyRole("USERS", "MANAGERS") // Restringe acesso ao endpoint "/users" para usuários com os papéis "USERS" ou "MANAGERS"
            .anyRequest().authenticated() // Exige autenticação para qualquer outra requisição
        )
        // Configuração da autenticação HTTP Basic
        .httpBasic(httpBasic -> {
            BasicAuthenticationEntryPoint entryPoint = new BasicAuthenticationEntryPoint();
            entryPoint.setRealmName("MyAppRealm"); // Define o realmName
            httpBasic.authenticationEntryPoint(entryPoint);
        });

        // Retorna o SecurityFilterChain configurado
        return http.build();
    }
}
