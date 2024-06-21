import java.util.ArrayList;

public class NavegadorInternet {
    private String paginaAtual;
    private ArrayList<String> abas = new ArrayList<String> ();

    public void exibirPaginaAtual(String url){
        this.paginaAtual = url;
        System.out.println(url + " acessada");
    }

    public void atualizarPágina(){
        String url = this.paginaAtual;
        this.paginaAtual = "";
        this.paginaAtual = url;
        System.out.println("Recarregada");
    }

    public void adicionarNovaAba(){
        abas.add(this.paginaAtual);
        this.paginaAtual = "";
        System.out.println("nova aba aberta");
    }
}
