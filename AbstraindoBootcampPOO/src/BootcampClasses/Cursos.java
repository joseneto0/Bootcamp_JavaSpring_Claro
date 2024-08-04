package BootcampClasses;

public class Cursos extends Conteudo{
    private enumNivel nivel;

    public Cursos(String nome, String descricao, int duracao, enumNivel nivel) {
        super(nome, descricao, duracao);
        this.nivel = nivel;
    }

    public enumNivel getNivel() {
        return nivel;
    }

    public void setNivel(enumNivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString() + "nivel=" + nivel;
    }
}


