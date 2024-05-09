package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adcionarProduto(long cod, String nome, int quantidade, double preco) {
        Produto novoProduto = new Produto(nome,preco,quantidade);
        estoqueProdutosMap.put(cod,novoProduto);
    }

    public void exibirTodosOsProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public void calcularValorTotalEstoque() {
        double valorTotal = 0d;

        for(Produto produto: estoqueProdutosMap.values()) {
            valorTotal += produto.getPreco() * produto.getQuantidade();
        }
        System.out.println("Valor total no estoque: "+valorTotal);
    }

    public void obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto produto: estoqueProdutosMap.values()) {
            if(produto.getPreco() > maiorPreco ){
                produtoMaisCaro = produto;
                maiorPreco = produto.getPreco();
            }
        }
            System.out.println(produtoMaisCaro);
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adcionarProduto(44,"Sabao", 2,3.0);
        estoque.adcionarProduto(42,"Guia dos mochileiro das galaxias", 2,20.0);
        estoque.adcionarProduto(41,"Escova de dente", 30,18.0);

//        estoque.exibirTodosOsProdutos();
//        estoque.calcularValorTotalEstoque();
        estoque.obterProdutoMaisCaro();


    }

}
