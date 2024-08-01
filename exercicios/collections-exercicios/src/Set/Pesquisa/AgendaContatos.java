package Set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
    private Set<Contato> setContatos;

    public AgendaContatos() {
        this.setContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        setContatos.add(new Contato(nome, numero));
    }

    public Set<Contato> exibirContatos(){
        return setContatos;
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosNome = new HashSet<>();
        for (Contato contato: setContatos){
            if (contato.getNome().equals(nome)){
                contatosNome.add(contato);
            }
        }
        return contatosNome;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        Set<Contato> contatosNome = new HashSet<>();
        for (Contato contato: setContatos){
            if (contato.getNome().equals(nome)){
                contato.setTelefone(novoNumero);
                return;
            }
        }
    }
}
