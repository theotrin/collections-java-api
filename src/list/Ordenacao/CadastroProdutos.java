package list.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto>  produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adcionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome,cod, preco, quantidade));
    }

    public void exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        System.out.println(produtosPorNome);
    }

    public void exibirProdutosPorPreco() {
       Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        System.out.println(produtosPorPreco);
    }

    public static void main(String[] args) {
        CadastroProdutos estoqueProdutos = new CadastroProdutos();

        estoqueProdutos.adcionarProduto(221,"Sabão",3.80,50);
        estoqueProdutos.adcionarProduto(42,"Livro",20.0,50);
        estoqueProdutos.adcionarProduto(1,"Cerveja",10.0,100);

        estoqueProdutos.exibirProdutosPorPreco();
    }




}
