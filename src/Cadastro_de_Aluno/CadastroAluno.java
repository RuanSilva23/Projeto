package Cadastro_de_Aluno;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class CadastroAluno {
    private List<Aluno> alunos = new ArrayList<>();
    private int proximoId = 1;

    public void adicionarAluno(String aluno, int idade, String curso){
        Aluno novoAluno = new Aluno(proximoId++, aluno, idade, curso);
        alunos.add(novoAluno);
        salvaremArquivo();
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
        salvaremArquivo();
    }

    public void deleteAluno(int id){
        boolean removido = alunos.removeIf(a -> a.getId() == id);
        if (removido){
            System.out.println("Aluno removido com sucesso. ");
        }else {
            System.out.println("O aluno com a matrícula " + id + " não encontrado.");
        }
        salvaremArquivo();
    }

    private void salvaremArquivo(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("alunos.txt"))){
            for(Aluno a : alunos){
                String linha = String.format("%d;%s;%d;%s", a.getId(), a.getAluno(), a.getIdade(), a.getCurso());
                writer.write(linha);
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }

    }

    public void carregardoArquivo(){
        File arquivo = new File("alunos.txt");
        if (!arquivo.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))){
            String linha;
            while ((linha = reader.readLine()) != null){
                String[] partes = linha.split(";");
                int id = Integer.parseInt(partes[0]);
                String nomeAluno = partes[1];
                int idade = Integer.parseInt(partes[2]);
                String curso = partes[3];

                alunos.add(new Aluno(id, nomeAluno, idade, curso));
                if (id >=proximoId){
                    proximoId = id + 1;
                }
            }
        }catch (IOException e){
            System.out.println("Erro ao abrir o arquivo " + e.getMessage());
        }
    }

    public List<Aluno> getAlunos(){
        return new ArrayList<>(alunos);
    }
}
