package Banco;
public class ContaCorrente extends Conta{

    public static int SEQUENCIAL = 1;
    private String tipo;

    public ContaCorrente(Cliente cliente, Banco banco){
        super(cliente);
        super.numero = SEQUENCIAL++;
        this.tipo = "Conta corrente";
        banco.addConta(this);
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato da conta corrente:");
        super.imprimirInfosComuns();
    }
}
