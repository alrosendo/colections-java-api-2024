package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEventos(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }
    public void exibirAgenda(LocalDate data) {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEventos(LocalDate.of(2019, 1, 1), "evento1", "atração1");
        agendaEventos.adicionarEventos(LocalDate.of(2020, 3, 8), "evento2", "atração3");
        agendaEventos.adicionarEventos(LocalDate.of(2021, 4, 15), "evento3", "atração5");
        agendaEventos.adicionarEventos(LocalDate.of(2023, 8, 19), "evento7", "atração6");
        agendaEventos.adicionarEventos(LocalDate.of(2024, 10, 29), "aniversario aloisio", "43 anos");

        agendaEventos.obterProximoEvento();

    }
}
