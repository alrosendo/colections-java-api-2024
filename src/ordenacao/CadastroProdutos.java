package ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoset;

    public CadastroProdutos() {
        this.produtoset = new HashSet<>();

    }

    public void adicionarProduto(String nome, double preco, int quantidade,  long codigo) {
        produtoset.add(new Produto(nome, preco, quantidade,codigo));
    }
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoset);
        return produtosPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
         produtosPorPreco.addAll(produtoset);
        return produtosPorPreco;

    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("p1", 25,15, 1);
        cadastroProdutos.adicionarProduto("p2", 87, 3,2);
        cadastroProdutos.adicionarProduto("p3", 93,47, 3);
        cadastroProdutos.adicionarProduto("p4", 57, 36, 4);
        System.out.println(cadastroProdutos.produtoset);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }

}
