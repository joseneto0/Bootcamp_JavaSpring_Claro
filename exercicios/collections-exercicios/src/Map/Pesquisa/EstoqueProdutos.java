package Map.Pesquisa;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
    private Map<Long, Produto> estoque;

    public EstoqueProdutos(){
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoque.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoque);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        for (Map.Entry<Long, Produto> mp: estoque.entrySet()){
            valorTotal += mp.getValue().getPreco() * mp.getValue().getQuantidade();
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double valorMaisCaro = -1;
        for (Map.Entry<Long, Produto> mp: estoque.entrySet()){
            if (mp.getValue().getPreco() > valorMaisCaro){
                valorMaisCaro = mp.getValue().getPreco();
                produtoMaisCaro = mp.getValue();
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double valorMaisBarato = 999999999;
        for (Map.Entry<Long, Produto> mp: estoque.entrySet()){
            if (mp.getValue().getPreco() < valorMaisBarato){
                valorMaisBarato = mp.getValue().getPreco();
                produtoMaisBarato = mp.getValue();
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQntdValor = null;
        double valor = -1;
        for (Map.Entry<Long, Produto> mp: estoque.entrySet()){
            if (mp.getValue().getPreco() * mp.getValue().getQuantidade() > valor){
                valor = mp.getValue().getPreco() * mp.getValue().getQuantidade();
                produtoMaiorQntdValor = mp.getValue();
            }
        }
        return produtoMaiorQntdValor;
    }
}
