package Set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private Set<String> setPalavras;

    public ConjuntoPalavrasUnicas() {
        this.setPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        setPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        setPalavras.remove(palavra);
    }

    public Boolean verificarPalavra(String palavra){
        return setPalavras.contains(palavra);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "setPalavras=" + setPalavras +
                '}';
    }

    public Set<String> exibirPalavrasUnicas(){
        return setPalavras;
    }
}
