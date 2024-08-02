package Map.Ordenacao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.now(), "parque", "trampolin");
        agenda.exibirAgenda();
        System.out.println();
        LivrariaOnline livraria = new LivrariaOnline();
        livraria.adicionarLivro("www.com", "Aaaaa", "eu", 100);
        livraria.adicionarLivro("www2.com", "Bbbb", "eu", 200);
        livraria.adicionarLivro("www3.com", "ccc", "au", 500);
        System.out.println(livraria.obterLivroMaisCaro());
        System.out.println(livraria.obterLivroMaisBarato());
        System.out.println(livraria.exibirLivrosOrdenadosPorPreco());
        System.out.println(livraria.pesquisarLivrosPorAutor("eu"));
    }

}
