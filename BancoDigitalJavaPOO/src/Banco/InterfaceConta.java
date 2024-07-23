package Banco;

public interface InterfaceConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(Conta contaDestino, double valor);
    
    void imprimirExtrato();
}
