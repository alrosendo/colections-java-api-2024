package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, Double preco) {
        estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }
    public void exibirTodosProdutos() {
        System.out.println(estoqueProdutos);
    }
    public double calcularValorTotal() {
        double valortTotalEstoque = 0;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                valortTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valortTotalEstoque;
    }
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque  = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "p1", 58, 45.0 );
        estoque.adicionarProduto(2L, "p1", 58, 64.0 );
        estoque.adicionarProduto(3L, "p1", 58, 14.0 );

        estoque.exibirTodosProdutos();
//        System.out.println(estoque.calcularValorTotal());
        System.out.println(estoque.obterProdutoMaisCaro());

//        estoque.exibirTodosProdutos();
    }
}
