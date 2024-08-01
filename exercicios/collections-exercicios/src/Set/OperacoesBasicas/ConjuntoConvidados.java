package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> setConvidados;

    public ConjuntoConvidados(){
        this.setConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int condigoConvite){
        setConvidados.add(new Convidado(nome, condigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        setConvidados.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
    }

    public int contarConvidados(){
        return setConvidados.size();
    }

    public Set<Convidado> exibirConvidados(){
        return setConvidados;
    }


}
