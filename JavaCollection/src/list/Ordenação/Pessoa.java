package list.Ordenação;

import java.util.Comparator;
import java.lang.Comparable;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return "Pessoa{" + 
        " nome = '" + nome + '\'' + 
        " idade = '" + idade + '\'' + 
        " altura = '" + altura + '\'' + 
        '}';
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2){
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
