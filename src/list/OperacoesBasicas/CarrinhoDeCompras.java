package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeItens;

    public CarrinhoDeCompras() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adcionarItem(String nome, Double preco, Integer quantidade) {
        this.listaDeItens.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome) {
        List<Item> itensRemovidos = new ArrayList<>();
        for(Item item: listaDeItens){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensRemovidos.add(item);
            }
        }
            listaDeItens.removeAll(itensRemovidos);
    }
    public void calcularValorTotal(){
        Double valorTotal = 0d;
        for(Item item: listaDeItens){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        System.out.println("Total: "+ valorTotal);
    }



    public void exibirItens() {
        System.out.println(listaDeItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adcionarItem("Sabao", 20.0, 5);
        carrinho.adcionarItem("Chocolate", 3.80, 2);
        carrinho.adcionarItem("Presunto", 5.0, 2);
        carrinho.adcionarItem("Presunto", 5.0, 5);

        carrinho.calcularValorTotal();
        carrinho.removerItem("presunto");
        carrinho.calcularValorTotal();
        carrinho.exibirItens();
    }
}
