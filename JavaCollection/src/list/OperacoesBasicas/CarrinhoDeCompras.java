package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoCompra;

    public CarrinhoDeCompras(){
        this.carrinhoCompra = new ArrayList<>();
    }

    public void addItem (String nome, double preco, int quantidade){
        carrinhoCompra.add(new Item(nome, preco, quantidade));
    }

    public void removeItem(String nome){
        List<Item> removeItem = new ArrayList<>();
        for(Item i: carrinhoCompra){
            if(i.getNome().equalsIgnoreCase(nome)){
                removeItem.add(i);
            }
        }
        carrinhoCompra.removeAll(removeItem);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Item i: carrinhoCompra){
            valorTotal += (i.getPreco()*i.getQuantidade());
        }
        return valorTotal;
    }

    public void exibeItem(){
        System.out.println(carrinhoCompra);
    }

    //Teste de metódos
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoCompra = new CarrinhoDeCompras();

        carrinhoCompra.addItem("carne", 15, 3);
        carrinhoCompra.addItem("batata", 3, 6);
        carrinhoCompra.addItem("mortadela", 2, 10);
        carrinhoCompra.addItem("sabonete", 7, 2);

        System.out.println("valor total: " + carrinhoCompra.calcularValorTotal());

        carrinhoCompra.removeItem("carne");

        carrinhoCompra.exibeItem();
    }
}
