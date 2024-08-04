package BootcampClasses;

import java.util.ArrayList;
import java.util.List;

public class Devs {
    private String nome;
    private String linguagemFavorita;
    private List<Bootcamp> bootcampsMatriculados;
    private int xp;

    public Devs(String nome, String linguagemFavorita) {
        this.nome = nome;
        this.linguagemFavorita = linguagemFavorita;
        this.bootcampsMatriculados = new ArrayList<>();
        this.xp = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagemFavorita() {
        return linguagemFavorita;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setLinguagemFavorita(String linguagemFavorita) {
        this.linguagemFavorita = linguagemFavorita;
    }

    protected void adicionarBootcamp(Bootcamp bootcamp){
        bootcampsMatriculados.add(bootcamp);
    }

    public void visualizarBootcamps(){
        System.out.println(bootcampsMatriculados);
    }

    @Override
    public String toString() {
        return "BootcampClasses.Devs{" +
                "nome='" + nome + '\'' +
                ", linguagemFavorita='" + linguagemFavorita + '\'' +
                ", bootcampsMatriculados=" + bootcampsMatriculados +
                '}';
    }
}
