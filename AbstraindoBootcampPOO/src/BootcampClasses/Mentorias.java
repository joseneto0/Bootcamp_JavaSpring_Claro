package BootcampClasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mentorias extends Conteudo{
    private List<String> tecnologiasUtilizadas;
    private LocalDate data;

    public Mentorias(String nome, String descricao, int duracao, LocalDate data) {
        super(nome, descricao, duracao);
        this.data = data;
        this.tecnologiasUtilizadas = new ArrayList<>();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString() + "Tecnologias Utilizadas=" + tecnologiasUtilizadas + '\'' + "Data=" + data;
    }
}
