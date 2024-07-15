package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void addProduto(String nome, String codigo, int quantidade, double preco){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibiPorNome(){
        Set<Produto> setOrganizado = new TreeSet<>(produtoSet);
        return setOrganizado;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtoPorPreco;
    }

    //Teste de metódo
    public static void main(String[] args) {
        CadastroProdutos produtosCadastro = new CadastroProdutos();

        produtosCadastro.addProduto("mouse", "1", 5, 70.5);
        produtosCadastro.addProduto("teclado", "2", 2, 65.7);
        produtosCadastro.addProduto("monitor", "3", 7, 50);
        produtosCadastro.addProduto("webCam", "4", 1, 7.25);

        System.out.println(produtosCadastro.exibiPorNome());

        System.out.println(produtosCadastro.exibirPorPreco());
    }
}
