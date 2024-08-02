package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!contatos.isEmpty()){
            contatos.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Integer pesquisarPorNome(String nome){
        Integer telefone = null;
        if (!contatos.isEmpty()){
            telefone = contatos.get(nome);
        }
        return telefone;
    }

}
