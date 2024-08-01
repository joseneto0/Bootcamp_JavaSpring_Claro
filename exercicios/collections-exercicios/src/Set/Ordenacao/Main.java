package Set.Ordenacao;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();
        produtos.adicionarProduto(1231232131, "ovo", 5.50, 2);
        produtos.adicionarProduto(124231, "leite", 10.20, 1);
        produtos.adicionarProduto(1242313123, "arroz", 10.50, 1);
        System.out.println(produtos.exibirProdutosPorNome());
        System.out.println(produtos.exibirProdutosPorPreco());
        System.out.println();
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.adicionarAluno("zezin", 1231321, 10);
        gerenciador.adicionarAluno("neto", 12412, 9);
        System.out.println(gerenciador.exibirAlunos());
        System.out.println(gerenciador.exibirAlunosPorNota());
        System.out.println(gerenciador.exibirAlunosPorNome());
    }
}
