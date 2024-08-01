package List.Pesquisa;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("A volta dos que nao foram", "Zezinho", 2020);
        System.out.println(catalogo.pesquisarPorTitulo("A volta dos que nao foram"));
        System.out.println(catalogo.pesquisarPorAutor("Zezinho"));

        SomaNumeros valores = new SomaNumeros();

        valores.adicionarNumero(5);
        valores.adicionarNumero(10);
        valores.adicionarNumero(20);
        valores.adicionarNumero(1);

        System.out.println(valores.exibirNumeros());
        System.out.println(valores.encontrarMenorNumero());
        System.out.println(valores.encontrarMaiorNumero());
        System.out.println(valores.calcularSoma());
    }
}
