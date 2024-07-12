package list.Pesquisa;

public class Livro {
    private String autor;
    private String titulo;
    private int anoPublicacao;

    public Livro(String autor, String titulo, int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString(){
        return "Livro{" + 
        " titulo = '" + titulo + '\'' + 
        " autor = '" + autor + '\'' + 
        " anoPublicacao = '" + anoPublicacao + '\'' + 
        '}';
    }
}
