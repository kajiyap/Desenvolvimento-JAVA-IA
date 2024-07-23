package Banco;
public class Cliente {
    private String nome;
    private String cpf;
    private int idade;

    public Cliente(String nome, String cpf, int idade, Banco banco){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        banco.addCliente(this);
    }

    public String getCpf() {
        return cpf;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirInfos(){
        System.out.println(String.format("\nNome: %s", this.nome));
        System.out.println(String.format("CPF: %s", this.cpf));
        System.out.println(String.format("Idade: %s", this.idade));
    }
}
