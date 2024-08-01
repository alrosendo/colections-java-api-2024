package Pesquisa;


import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoset;

    public AgendaContato() {
        this.contatoset = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        Contato contato = new Contato(nome, numero);
        this.contatoset.add(contato);
    }
    public void exibirContatos() {
        for (Contato contato : contatoset) {
            System.out.println(contato);
        }
    }
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoset) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoset) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendacontato = new AgendaContato();

//        agendacontato.exibirContatos();
//
        agendacontato.adicionarContato("maria", 99998877);
        agendacontato.adicionarContato("camiladio", 99965594);
        agendacontato.adicionarContato("camila", 99972648);
        agendacontato.adicionarContato("camila", 99914259);
//
//        agendacontato.exibirContatos();
        System.out.println(agendacontato.pesquisarPorNome("camila"));

    }
}
