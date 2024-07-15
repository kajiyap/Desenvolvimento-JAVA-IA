package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String nome;
    private String codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, String codigo, double preco, int quantidade) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true; // Verifica se os objetos são o mesmo (mesmo endereço de memória)
        if (!(o instanceof Produto produto)) return false; // Verifica se o objeto passado é uma instância de Produto
        return Objects.equals(getCodigo(), produto.getCodigo()); // Compara os códigos dos produtos
    }

    @Override
    public int hashCode(){
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString(){
        return "Pessoa{" + 
        " nome = '" + nome + '\'' + 
        " codigo = '" + codigo + '\'' + 
        " preco = '" + preco + '\'' + 
        " quantidade = '" + quantidade + '\'' + 
        '}';
    }

    @Override
    public int compareTo(Produto p){
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
