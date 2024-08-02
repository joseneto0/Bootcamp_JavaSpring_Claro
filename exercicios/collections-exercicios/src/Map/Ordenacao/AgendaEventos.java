package Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AgendaEventos {
    private Map<LocalDate, Evento> agenda;

    public AgendaEventos(){
        this.agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agenda.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        System.out.println(agenda);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> mp: agenda.entrySet()){
            LocalDate dataEvento = mp.getKey();
            if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)){
                proximaData = dataEvento;
                proximoEvento = mp.getValue();
                break;
            }
        }
        System.out.println(proximoEvento);
    }
}
