package list.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas(){
        this.pessoasList = new ArrayList<>();
    }

    public void addPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarIdade(){
        //ordem crescente
        List<Pessoa> pessoasIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }

    public List<Pessoa> ordenarAltura(){
        //ordem crescente
        List<Pessoa> pessoasAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasAltura, new ComparatorPorAltura());
        return pessoasAltura;
    }

    //Teste de metódos
    public static void main(String[] args) {
        OrdenacaoPessoas pessoasOrd = new OrdenacaoPessoas();

        pessoasOrd.addPessoa("rafael", 10, 1.5);
        pessoasOrd.addPessoa("murilo", 7, 1.2);
        pessoasOrd.addPessoa("pedro", 5, 1.6);

        System.out.println(pessoasOrd.ordenarAltura());

        System.out.println(pessoasOrd.ordenarIdade());
    }
}
