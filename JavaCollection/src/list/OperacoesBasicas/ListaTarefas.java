package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> removeTarefas = new ArrayList<>();
        for (Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                removeTarefas.add(t);
            }
        }
        tarefaList.removeAll(removeTarefas);
    }

    public int contTarefas(){
        return tarefaList.size();
    }

    public void descricoesTarefas(){
        System.out.println(tarefaList);
    }

    //Teste dos metódos
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("tarefa 1");
        listaTarefas.adicionarTarefa("tarefa 2");
        listaTarefas.adicionarTarefa("tarefa 2");
        listaTarefas.adicionarTarefa("tarefa 3");

        System.out.println(listaTarefas.contTarefas());

        listaTarefas.removerTarefa("tarefa 2");

        System.out.println(listaTarefas.contTarefas());

        listaTarefas.descricoesTarefas();
    }
}
