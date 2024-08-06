package ExerciciosResolvidoEmAula;

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


}
