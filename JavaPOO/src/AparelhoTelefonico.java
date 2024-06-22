public class AparelhoTelefonico {
    private boolean emLigacao;

    public void ligar(String numero){
        this.emLigacao = true;
        System.out.println("Chamada iniciada");
        long startTime = System.currentTimeMillis();

        while (this.emLigacao) {
            // Obtém o tempo atual em milissegundos
            long currentTime = System.currentTimeMillis();
            
            // Calcula o tempo decorrido em milissegundos
            long elapsedTime = currentTime - startTime;
            
            // Verifica se 10 segundos se passaram (10000 milissegundos)
            if (elapsedTime > 10000) {
                System.out.println("Chamada encerrada");
                this.emLigacao = false;
            }
        }
    }

    public void atender(){
        this.emLigacao = true;
        System.out.println("Chamada iniciada");
        long startTime = System.currentTimeMillis();

        while (this.emLigacao) {
            // Obtém o tempo atual em milissegundos
            long currentTime = System.currentTimeMillis();
            
            // Calcula o tempo decorrido em milissegundos
            long elapsedTime = currentTime - startTime;
            
            // Verifica se 10 segundos se passaram (10000 milissegundos)
            if (elapsedTime > 10000) {
                System.out.println("Chamada encerrada");
                this.emLigacao = false;
            }
        }
    }

    public void iniciarCorreioVoz(){
        this.emLigacao = true;
        System.out.println("Correio iniciado");
        long startTime = System.currentTimeMillis();

        while (this.emLigacao) {
            // Obtém o tempo atual em milissegundos
            long currentTime = System.currentTimeMillis();
            
            // Calcula o tempo decorrido em milissegundos
            long elapsedTime = currentTime - startTime;
            
            // Verifica se 10 segundos se passaram (10000 milissegundos)
            if (elapsedTime > 10000) {
                System.out.println("Correio encerrado");
                this.emLigacao = false;
            }
        }
    }
}
