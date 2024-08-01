package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listLivros;

    public CatalogoLivros(){
        listLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listAutor = new ArrayList<>();
        for (Livro livro: listLivros){
            if (livro.getAutor().equalsIgnoreCase(autor)){
                listAutor.add(livro);
            }
        }
        return listAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listIntervalo = new ArrayList<>();
        for (Livro livro: listLivros){
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                listIntervalo.add(livro);
            }
        }
        return listIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        for (Livro livro: listLivros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null;
    }
}
