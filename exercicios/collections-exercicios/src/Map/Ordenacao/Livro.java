package Map.Ordenacao;

import java.util.Comparator;
import java.util.Map;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }
}

class CompararPorPreco implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> m1, Map.Entry<String, Livro> m2) {
        return Double.compare(m1.getValue().getPreco(), m2.getValue().getPreco());
    }
}

class CompararPorAutor implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> m1, Map.Entry<String, Livro> m2) {
        return m1.getValue().getAutor().compareToIgnoreCase(m2.getValue().getAutor());
    }
}
