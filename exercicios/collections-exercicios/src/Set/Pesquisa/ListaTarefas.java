package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> setTarefas;

    public ListaTarefas(){
        this.setTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        setTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        for (Tarefa tarefa: setTarefas){
            if (tarefa.getDescricao().equals(descricao)){
                setTarefas.remove(tarefa);
                break;
            }
        }
    }

    public void exibirTarefas(){
        System.out.println(setTarefas);
    }

    public void contarTarefas(){
        System.out.println(setTarefas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa: setTarefas) {
            if (tarefa.getTarefaConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa: setTarefas) {
            if (!tarefa.getTarefaConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa tarefa: setTarefas){
            if (tarefa.getDescricao().equals(descricao)){
                tarefa.setTarefaConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa tarefa: setTarefas){
            if (tarefa.getDescricao().equals(descricao)){
                tarefa.setTarefaConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas(){
        setTarefas.clear();
    }


}
