package Cadastro_de_Aluno;

public class Aluno {
    private int id;
    private String aluno;
    private int idade;
    private String curso;

    public Aluno(int id, String nomeAluno, int idade, String curso){
        this.id = id;
        this.aluno = nomeAluno;
        this.idade = idade;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString(){
        return String.format("ID: %d | Nome: %s | Idade: %d | Curso: %s", id, aluno, idade, curso);
    }
}
