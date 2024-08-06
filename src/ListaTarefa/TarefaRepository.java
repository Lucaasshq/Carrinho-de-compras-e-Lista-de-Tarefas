package ListaTarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefaRepository {

    private List<Tarefa> tarefasList;

    public TarefaRepository() {
        this.tarefasList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t : tarefasList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
            }
        }
        tarefasList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefasList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        TarefaRepository listaTarefa = new TarefaRepository();

        listaTarefa.adicionarTarefa("Tarefa 1 teste");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " +listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");

        System.out.println("O número total de elementos na lista é: " +listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }

}
