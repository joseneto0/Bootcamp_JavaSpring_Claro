public class Main {
    public static void main(String[] args) {

        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Cozinhar");
        lista.adicionarTarefa("Estudar");
        lista.obterDescricoes();

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("coca", 2.5, 2);
        carrinho.adicionarItem("pizza", 50, 1);
        carrinho.adicionarItem("sneakers", 4, 3);
        System.out.println(carrinho.exibirItems());
        System.out.println(carrinho.calcularValorTotal());
        carrinho.removerItem("pizza");
        System.out.println(carrinho.exibirItems());
        System.out.println(carrinho.calcularValorTotal());
    }
}