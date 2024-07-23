package Banco;
public class ContaPoupanca extends Conta{
    
    public static int SEQUENCIAL = 1;
    private String tipo;

    public ContaPoupanca(Cliente cliente, Banco banco){
        super(cliente);
        super.numero = SEQUENCIAL++;
        this.tipo = "Conta poupanca";
        banco.addConta(this);
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato da conta poupança:");
        super.imprimirInfosComuns();
    }
}
