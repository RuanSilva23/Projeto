package GerenciamentoTarefas;

public class Tarefa {
    private int id;
    private String descricao;
    private boolean concluida;

    public Tarefa(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    public int getId(){
        return id;
    }

    public String getDescricao(){
        return descricao;
    }

    public boolean isConcluida(){
        return concluida;
    }

    public void setDescricao(String NovaDescricao) {
        this.descricao = NovaDescricao;
    }

    public void marcarComoConcluida(){
        this.concluida = true;
    }

    public String toString(){
        return String.format("[%d] %s - %s", id, descricao, (concluida ? "Concluida" : "Pendente") );
    }
}
