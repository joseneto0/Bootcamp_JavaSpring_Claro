package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefa;

    public ListaTarefas() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> listaRemovidos = new ArrayList<>();
        for (Tarefa tarefa: listaTarefa){
            if (tarefa.getDescricao().equals(descricao)){
                listaRemovidos.add(tarefa);
            }
        }
        listaTarefa.removeAll(listaRemovidos);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefa.size();
    }

    public void obterDescricoes(){
        System.out.println(listaTarefa);
    }
}
