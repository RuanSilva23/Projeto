package GerenciamentoTarefas;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();
    private int proximoid = 1;

    public void adicionarTarefas(String descricao){
        Tarefa nova = new Tarefa(proximoid++, descricao);
        tarefas.add(nova);
        System.out.println("Adicionado com sucesso!");
    }

    public void listarTarefas(){
        if (tarefas.isEmpty()){
            System.out.println("Nenhuma Tarefa foi encontrada. ");
            return;
        }

        for (Tarefa t : tarefas){
            System.out.println(t);
        }
    }

    public void concluirTarefas(int id){
        for (Tarefa t : tarefas){
            if (t.getId() == id){
                t.marcarComoConcluida();
                System.out.println("Tarefa marcada como concluida.");
                return;
            }
        }
        System.out.println("Tarefa com Id" + id + " não encontrado. ");
    }

    public void removerTarefa(int id){
        tarefas.removeIf(t -> t.getId() == id);
        System.out.println("Tarefa removida. ");
    }

    public void editarTarefa(int id, String novaDescricao){
        for (Tarefa t : tarefas){
            if (t.getId() == id){
                t.setDescricao(novaDescricao);
                System.out.println("Descicao Atualizada. ");
                return;
            }
        }
        System.out.println("Tarefa com ID " + id + " não encontrada. ");
    }
}
