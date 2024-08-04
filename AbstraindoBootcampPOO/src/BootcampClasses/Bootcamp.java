package BootcampClasses;

import java.util.ArrayList;
import java.util.List;


public class Bootcamp extends Conteudo{
    private enumNivel nivel;
    private List<Cursos> cursos;
    private List<Mentorias> mentorias;
    private List<Devs> devs;

    public Bootcamp(String nome, String descricao, int duracao, enumNivel nivel) {
        super(nome, descricao, duracao);
        this.nivel = nivel;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    public enumNivel getNivel() {
        return nivel;
    }

    public void setNivel(enumNivel nivel) {
        this.nivel = nivel;
    }

    public void adicionarCurso(Cursos curso){
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentorias mentoria){
        mentorias.add(mentoria);

    }

    public void adicionarDev(Devs dev){
        devs.add(dev);
        dev.adicionarBootcamp(this);
    }

    public void visualizarCursos(){
        System.out.println("Atualmente, contamos com " + cursos.size() + " cursos cadastrados");
        System.out.println("Lista dos cursos: " + cursos);
    }

    public void visualizarMentorias(){
        System.out.println("Atualmente, contamos com " + mentorias.size() + " mentorias cadastradas");
        System.out.println("Lista das mentorias: " + mentorias);
    }

    public void visualizarDevs(){
        System.out.println("Atualmente, contamos com " + devs.size() + " devs matriculados");
        System.out.println("Lista dos Devs: " + devs);
    }

    public void exibirBootcamp(){
        System.out.println("Bootcamp " + this.getNome());
        System.out.println("Nivel: " + this.getNivel());
        System.out.println("Duracao: " + this.getDuracao());
        System.out.println("Cursos: " + cursos);
        System.out.println("Mentorias: " + mentorias);
        System.out.println("Devs: " + devs);
    }
 }
