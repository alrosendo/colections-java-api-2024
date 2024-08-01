package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCogigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);

    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoconvidados = new ConjuntoConvidados();

        System.out.println("existem " + conjuntoconvidados.contarConvidados() + " dentro do setconvidados");
        conjuntoconvidados.adicionarConvidado("aloisio", 1);
        conjuntoconvidados.adicionarConvidado("bento", 2);
        conjuntoconvidados.adicionarConvidado("davi", 3);



        System.out.println("existem " + conjuntoconvidados.contarConvidados() + " dentro do setconvidados");


    }
}