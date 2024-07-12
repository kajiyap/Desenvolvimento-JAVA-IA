package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro{
    private List<Livro> catalogLivros;

    public CatalogoLivro(){
        this.catalogLivros = new ArrayList<>();
    }

    public void addLivro(String autor, String titulo, int anoPublicacao){
        catalogLivros.add(new Livro(autor, titulo, anoPublicacao));
    }

    public List<Livro> pesquisaAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!catalogLivros.isEmpty()){
            for (Livro l: catalogLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisaInterAno(int anoComeco, int anoFim){
        List<Livro> livrosIntervaloAno = new ArrayList<>();
        if (!catalogLivros.isEmpty()){
            for(Livro l: catalogLivros){
                if(l.getAnoPublicacao() >= anoComeco && l.getAnoPublicacao() <= anoFim){
                    livrosIntervaloAno.add(l);
                }
            }
        }
        return livrosIntervaloAno;
    }

    public Livro pesquisaTitulo(String titulo){
        Livro livroTitulo = null;
        if(!catalogLivros.isEmpty()){
            for(Livro i: catalogLivros){
                if(i.getTitulo().equalsIgnoreCase(titulo)){
                    livroTitulo = i;
                }
            }
        }
        return livroTitulo;
    }

    //Teste de metódos
    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();

        catalogoLivro.addLivro("jorge", "BCA", 2000);
        catalogoLivro.addLivro("jorge", "CBA", 2001);
        catalogoLivro.addLivro("arnaldo", "ABC", 1998);
        catalogoLivro.addLivro("odair", "ABC", 2020);
        catalogoLivro.addLivro("marco", "DFE", 2024);
        catalogoLivro.addLivro("rafael", "TRE", 1987);
        catalogoLivro.addLivro("murilo", "KJK", 1965);

        System.out.println(catalogoLivro.pesquisaAutor("jorge"));

        System.out.println(catalogoLivro.pesquisaInterAno(1999, 2022));

        System.out.println(catalogoLivro.pesquisaTitulo("ABC"));
    }
}
