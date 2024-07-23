package Banco;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {
    private String nome;
    private Set<Conta> contas;
    private List<Cliente> clientes;

    public Banco(){
        this.clientes = new ArrayList<>();
        this.contas = new HashSet<>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
    public String getNome() {
        return nome;
    }
    public Set<Conta> getContas() {
        return contas;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setContas(Set<Conta> contas) {
        this.contas = contas;
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void addConta(Conta conta){
        contas.add(conta);
        System.out.println("Conta poupança adicionada com sucesso!");
    }

    public void listarContas(){
        contas.forEach(e -> e.imprimirExtrato());
    }
    public void listarClientes(){
        clientes.forEach(e -> e.imprimirInfos());
    }
}
