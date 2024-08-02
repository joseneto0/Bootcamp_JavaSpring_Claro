package Map.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("zezin", 1231231);
        agenda.adicionarContato("neto", 314123);
        agenda.removerContato("zezin");
        agenda.exibirContatos();
        System.out.println();
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("aaaa", "aaaaaaaaaa");
        dicionario.adicionarPalavra("zezin", "jênio");
        dicionario.exibirPalavras();
        dicionario.pesquisarPorPalavra("zezin");
        dicionario.removerPalavra("aaaa");
        dicionario.exibirPalavras();
    }
}
