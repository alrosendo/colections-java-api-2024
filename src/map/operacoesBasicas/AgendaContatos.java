package map.operacoesBasicas;

import Pesquisa.Contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosmap;

    public AgendaContatos() {
        this.agendaContatosmap = new HashMap<>();
    }

    public void adicionarContato(String  nome, Integer telefone){
        agendaContatosmap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!agendaContatosmap.isEmpty()){
            agendaContatosmap.remove(nome);
        }
    }
    public void exibirContato(){
        System.out.println(agendaContatosmap);
    }
    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosmap.isEmpty()){
            numeroPorNome = agendaContatosmap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("carlos", 987456982);
        agendaContatos.adicionarContato("carlos", 987456921);
        agendaContatos.adicionarContato("carlosdio", 987123648);
        agendaContatos.adicionarContato("carloskkk", 987173694);
        agendaContatos.adicionarContato("joamar", 987143694);

        agendaContatos.exibirContato();
//        agendaContatos.removerContato("carlos");
        System.out.println(agendaContatos.pesquisaPorNome("carlos"));
        agendaContatos.exibirContato();
    }
}
