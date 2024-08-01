package List.Ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacao = new OrdenacaoPessoas();
        ordenacao.adicionarPessoa("zezin", 25, 1.73);
        ordenacao.adicionarPessoa("netin", 21, 1.90);
        System.out.println(ordenacao.ordenarPorAltura());
        System.out.println(ordenacao.ordenarPorIdade());
    }
}
