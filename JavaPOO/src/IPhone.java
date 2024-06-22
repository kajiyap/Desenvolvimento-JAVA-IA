import java.util.Scanner;

public class IPhone {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O que deseja acessar?");
        System.out.println("1 - Aparelho telefonico");
        System.out.println("2 - Navegador");
        System.out.println("3 - Reprodutor musical");

        System.out.println("Escolha um número:");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("o que quer fazer?");
                System.out.println("1 - Atender");
                System.out.println("2 - Ligar");
                System.out.println("3 - Reproduzir correio de voz");

                System.out.println("Escolha um número:");
                int escolhaTel = scanner.nextInt();

                AparelhoTelefonico aparelhoTel = new AparelhoTelefonico();
                
                switch (escolhaTel) {
                    case 1:
                        aparelhoTel.atender();
                        break;
                    case 2:
                        System.out.println("Digite o numero que deseja ligar:");
                        String numero = scanner.next().toString();
                        aparelhoTel.ligar(numero);
                        break;
                    case 3:
                        aparelhoTel.iniciarCorreioVoz();
                        break;
                
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("o que quer fazer?");
                System.out.println("1 - Exibir pagina atual");
                System.out.println("2 - Adicionar aba");
                System.out.println("3 - Atualizar pagina");

                System.out.println("Escolha um número:");
                int escolhaNav = scanner.nextInt();

                NavegadorInternet navegadorInternet = new NavegadorInternet();

                switch (escolhaNav) {
                    case 1:
                        System.out.println("Passe a url que deseja acessar:");
                        String url = scanner.next();
                        navegadorInternet.exibirPaginaAtual(url);
                        break;
                    case 2:
                        navegadorInternet.adicionarNovaAba();
                        break;
                    case 3:
                        navegadorInternet.atualizarPágina();
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                System.out.println("o que quer fazer?");
                System.out.println("1 - Tocar");
                System.out.println("2 - Pausar");
                System.out.println("3 - Selecionar música");

                System.out.println("Escolha um número:");
                int escolhaRep = scanner.nextInt();

                ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

                switch (escolhaRep) {
                    case 1:
                        reprodutorMusical.tocar();
                        break;
                    case 2:
                        reprodutorMusical.pausar();
                        break;
                    case 3:
                        System.out.println("Digite o nome da musica que deseja:");
                        String musica = scanner.next();
                        reprodutorMusical.selecionarMusica(musica);
                        break;
                
                    default:
                        break;
                }

                break;
            default:
                break;
        }
        scanner.close();
    }
}
