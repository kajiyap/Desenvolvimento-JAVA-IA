package Banco;

public abstract class Conta implements InterfaceConta {
    //Propriedades
    private static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    //Construtor
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.cliente = cliente;
    }

    //Getters
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    //Metódos
    @Override
    public void sacar(double valor) {
        if(valor<saldo){
            saldo-=valor;
            System.out.println("\nSaque realizado.");
            System.out.println("Saldo atual:" + this.saldo);
        }else{
            System.out.println("Valor de saque excede seu saldo.");
        }
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("\nDeposito realizado");
        System.out.println("Saldo atual:" + this.saldo);
    }
    @Override
    public void transferir(Conta contaDestino, double valor) {
        if(saldo>valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("\nTransferencia realizada.");
            System.out.println("Saldo atual:" + this.saldo);
        }else{
            System.out.println("O valor da transferencia excede o saldo");
        }
        
    }
    protected void imprimirInfosComuns(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
