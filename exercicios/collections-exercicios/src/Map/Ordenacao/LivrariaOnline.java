package Map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro>  livraria;

    public LivrariaOnline() {
        this.livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livraria.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        for (Map.Entry<String, Livro> mp: livraria.entrySet()){
            if (mp.getValue().getTitulo().equals(titulo)){
                livraria.remove(mp.getKey());
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosOrdenadosPreco = new ArrayList<>(livraria.entrySet());
        Collections.sort(livrosOrdenadosPreco, new CompararPorPreco());

        Map<String, Livro> ordenados = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> mp: livrosOrdenadosPreco){
            ordenados.put(mp.getKey(), mp.getValue());
        }

        return ordenados;
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor){
        List<Livro> livros = new ArrayList<>();
        for (Map.Entry<String, Livro> mp: livraria.entrySet()){
            if (mp.getValue().getAutor().equals(autor)){
                livros.add(mp.getValue());
            }
        }
        return livros;
    }

    public Livro obterLivroMaisCaro(){
        double maior = -1;
        Livro livro = null;
        for (Map.Entry<String, Livro> mp: livraria.entrySet()){
            if (mp.getValue().getPreco() > maior){
                maior = mp.getValue().getPreco();
                livro = mp.getValue();
            }
        }
        return livro;
    }

    public Livro obterLivroMaisBarato(){
        double menor = 1000000000;
        Livro livro = null;
        for (Map.Entry<String, Livro> mp: livraria.entrySet()){
            if (mp.getValue().getPreco() < menor){
                menor = mp.getValue().getPreco();
                livro = mp.getValue();
            }
        }
        return livro;
    }
}
