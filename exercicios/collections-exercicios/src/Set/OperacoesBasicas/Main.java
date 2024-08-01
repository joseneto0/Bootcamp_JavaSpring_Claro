package Set.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();

        conjunto.adicionarConvidado("Zezin", 123123);
        conjunto.adicionarConvidado("Neto", 1234);
        System.out.println(conjunto.exibirConvidados());
        System.out.println(conjunto.contarConvidados());
        conjunto.removerConvidadoPorCodigoConvite(1234);
        System.out.println(conjunto.exibirConvidados());
        System.out.println(conjunto.contarConvidados());

        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
        palavrasUnicas.adicionarPalavra("zezinho");
        palavrasUnicas.adicionarPalavra("zezinho");
        palavrasUnicas.adicionarPalavra("neto");
        System.out.println(palavrasUnicas.verificarPalavra("zezinho"));
        System.out.println(palavrasUnicas.exibirPalavrasUnicas());
        palavrasUnicas.removerPalavra("zezinho");
        System.out.println(palavrasUnicas.exibirPalavrasUnicas());
    }
}
