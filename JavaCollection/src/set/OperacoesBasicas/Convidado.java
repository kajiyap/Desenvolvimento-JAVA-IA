package set.OperacoesBasicas;

public class Convidado {
    private String nome;
    private int codigo;

    public Convidado(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return "Pessoa{" + 
        " nome = '" + nome + '\'' + 
        " codigo = '" + codigo + '\'' + 
        '}';
    }
}
