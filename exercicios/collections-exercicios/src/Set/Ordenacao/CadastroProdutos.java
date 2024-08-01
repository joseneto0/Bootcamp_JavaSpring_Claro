package Set.Ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> setProdutos;

    public CadastroProdutos(){
        this.setProdutos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        setProdutos.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosOrdenadosNome = new TreeSet<>(setProdutos);
        return produtosOrdenadosNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosOrdenadosPreco = new TreeSet<>(new OrdenarPorPreco());
        produtosOrdenadosPreco.addAll(setProdutos);
        return produtosOrdenadosPreco;
    }
}
