package Map.Pesquisa;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {
    private Map<String, Integer> mapContagem;

    public ContagemPalavras() {
        this.mapContagem = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        mapContagem.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        mapContagem.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(mapContagem);
    }

    public String encontrarPalavraMaisFrequente(){
        Integer palavraFrequente = -1;
        String palavra = null;
        for (Map.Entry<String, Integer> mp: mapContagem.entrySet()){
            if (mp.getValue() > palavraFrequente){
                palavraFrequente = mp.getValue();
                palavra = mp.getKey();
            }
        }
        return palavra;
    }

}
