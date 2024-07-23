package Banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente c1 = new Cliente("Pedro", "12345678910", 30, banco);
        Cliente c2 = new Cliente("Paulo", "98765432125", 40, banco);

        ContaCorrente cc = new ContaCorrente(c2, banco);
        ContaPoupanca cp = new ContaPoupanca(c1, banco);

        cc.depositar(135.55);
        cp.depositar(453.90);

        cc.sacar(200);

        cp.transferir(cc, 200);

        cc.sacar(200);

        banco.listarClientes();
        banco.listarContas();
    }
}
