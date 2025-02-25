import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Tarefa> tarefas;

    public Board() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String titulo) {
        tarefas.add(new Tarefa(titulo));
    }

    public void avancarTarefa(String titulo) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
                tarefa.avancarStatus();
                return;
            }
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa adicionada.");
        } else {
            for (Tarefa tarefa : tarefas) {
                System.out.println(tarefa);
            }
        }
    }
}
