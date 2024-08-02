package dio.springBoot.Scopes;

public class Remetente {
    private String nome;
    private String email;

    public String getEmail() {
        return email;
    }
    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Remetente{" + " nome='" + '\'' + ", email=" + email +'\''+'}';
    }
}
