package set.Pesquisa;

import java.util.Objects;

public class Contato {
    private String numero;
    private String nome;

    public Contato(String numero, String nome) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }
    public String getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode(){
        return Objects.hash(getNome());
    }

    @Override
    public String toString(){
        return "Pessoa{" + 
        " nome = '" + nome + '\'' + 
        " numero = '" + numero + '\'' + 
        '}';
    }
}
