package Cadastro_de_Aluno;

import java.util.ArrayList;
import java.util.List;

public class CadastroAluno {
    private List<Aluno> alunos = new ArrayList<>();
    private int proximoId = 1;

    public void adicionarAluno(String aluno, int idade, String curso){
        Aluno novoAluno = new Aluno(proximoId++, aluno, idade, curso);
        alunos.add(novoAluno);
        System.out.println("Aluno adicionado com sucesso. ");
    }

    public void listarAlunos(){
        if (alunos.isEmpty()){
            System.out.println("Aluno não encontrado");
            return;
        }
        for (Aluno a : alunos){
            System.out.println(a);
        }
    }

    public void atualizarAluno(int id, String novoAluno, int novaIdade, String novoCurso){

        boolean encontrado = false;

        for (Aluno a : alunos){
            if (a.getId() == id){
                a.setAluno(novoAluno);
                a.setIdade(novaIdade);
                a.setCurso(novoCurso);
                System.out.println("Alteração feita com sucesso.");
                encontrado = true;
                break;
            }
        }
        if(!encontrado) {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void deleteAluno(int id){
        boolean removido = alunos.removeIf(a -> a.getId() == id);
        if (removido){
            System.out.println("Aluno removido com sucesso. ");
        }else {
            System.out.println("O aluno com a matrícula " + id + " não encontrado.");
        }
    }
}
