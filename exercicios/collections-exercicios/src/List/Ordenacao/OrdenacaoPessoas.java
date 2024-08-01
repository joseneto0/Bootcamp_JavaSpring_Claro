package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class OrdenacaoPessoas{
    List<Pessoa> listPessoas;

    public OrdenacaoPessoas() {
        this.listPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listOrdenadaIdade = new ArrayList<>(listPessoas);
        Collections.sort(listOrdenadaIdade);
        return listOrdenadaIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listOrdenadaAltura = new ArrayList<>(listPessoas);
        Collections.sort(listOrdenadaAltura, new OrdenarPorAltura());
        return listOrdenadaAltura;
    }
}
