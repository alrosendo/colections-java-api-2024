package List.OperacoesBasicas;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao) {

        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
          if(t.getDescricao().equals(descricao)) {
              tarefasParaRemover.add(t);
          };
        };
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefa() {

        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaTarefa listatarefa = new ListaTarefa();

        System.out.println("o numero total é: " + listatarefa.obterNumeroTotalTarefa());
        listatarefa.adicionarTarefa("tarefa 1");
        listatarefa.adicionarTarefa("tarefa 2");
        listatarefa.adicionarTarefa("tarefa 3");
        listatarefa.adicionarTarefa("tarefa 3");
        System.out.println("o numero total é: " + listatarefa.obterNumeroTotalTarefa());
        listatarefa.removerTarefa("tarefa 3");
        System.out.println("o numero total é: " + listatarefa.obterNumeroTotalTarefa());
    }

}

