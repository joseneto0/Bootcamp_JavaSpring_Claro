package Set.Ordenacao;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> setAlunos;

    public GerenciadorAlunos(){
        this.setAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double nota){
        setAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(int matricula){
        setAlunos.removeIf(aluno -> aluno.getMatricula() == matricula);
    }

    public Set<Aluno> exibirAlunos(){
        return setAlunos;
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(setAlunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new CompararPorNota());
        alunosPorNota.addAll(setAlunos);
        return alunosPorNota;
    }
}
