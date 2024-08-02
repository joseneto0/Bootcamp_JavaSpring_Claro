package Map.Pesquisa;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(1231231, "leite", 5, 4);
        estoque.adicionarProduto(123, "coca", 2, 8);
        estoque.adicionarProduto(1234, "chiclete", 1000, 0.5);
        estoque.exibirProdutos();
        System.out.println(estoque.calcularValorTotalEstoque());
        System.out.println(estoque.obterProdutoMaisCaro());
        System.out.println(estoque.obterProdutoMaisBarato());
        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        System.out.println();
        ContagemPalavras contagem = new ContagemPalavras();
        contagem.adicionarPalavra("a", 2);
        contagem.adicionarPalavra("b", 5);
        contagem.adicionarPalavra("c", 7);
        contagem.exibirContagemPalavras();
        System.out.println(contagem.encontrarPalavraMaisFrequente());
        contagem.removerPalavra("c");
        contagem.exibirContagemPalavras();
        System.out.println(contagem.encontrarPalavraMaisFrequente());
    }
}
