public class ReprodutorMusical {
    private boolean tocando;
    private String musicaAtual;

    public void tocar(){
        this.tocando = true;
        System.out.println(this.musicaAtual + " tocando");
    }
    public void pausar(){
        this.tocando = false;
        System.out.println(this.musicaAtual + " pausada");
    }
    public void selecionarMusica(String musica){
        this.musicaAtual = musica;
        this.tocando = true;
        System.out.println("Tocando "+musica);
    }
}
