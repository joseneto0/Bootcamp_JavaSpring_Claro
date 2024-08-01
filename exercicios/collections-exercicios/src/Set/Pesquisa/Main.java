package Set.Pesquisa;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Zezin", 11111111);
        agenda.adicionarContato("Zezin", 12112122);
        agenda.adicionarContato("Azul", 12345678);
        System.out.println(agenda.exibirContatos());
        System.out.println(agenda.pesquisarPorNome("Zezin"));
        System.out.println();
        ListaTarefas tarefas = new ListaTarefas();
        tarefas.adicionarTarefa("legal legal");
        tarefas.adicionarTarefa("oi oi oi");
        tarefas.contarTarefas();
        tarefas.marcarTarefaConcluida("legal legal");
        tarefas.exibirTarefas();
        tarefas.removerTarefa("legal legal");
        tarefas.exibirTarefas();
        tarefas.limparListaTarefas();
        tarefas.exibirTarefas();
    }
}
