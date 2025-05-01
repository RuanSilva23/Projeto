package Cadastro_de_Aluno;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        CadastroAluno cadastro = new CadastroAluno();

        cadastro.carregardoArquivo();

        boolean continuar = true;

        while (continuar){
           int Leropcao = ExibicaoDoMenu.exibirMenu();

            if (Leropcao >= 6 || Leropcao < 1){
                System.out.println("Opção invalida, Tente novamente");
                continue;
            }

            Metodos codigo = Metodos.fromCodigo(Leropcao);

            switch (codigo){
                case ADICIONAR:{

                   System.out.print("Digite o nome do aluno: ");
                   String aluno = scanner.nextLine();


                   System.out.print("Digite a idade do aluno: ");
                   int idade = scanner.nextInt();
                   scanner.nextLine();

                   System.out.print("Qual o curso: ");
                   String curso = scanner.nextLine();

                   cadastro.adicionarAluno(aluno, idade, curso);
                    break;
                }

                case CONSULTAR:{
                    cadastro.listarAlunos();
                    break;
                }

                case ATUALIZAR:{
                    System.out.println("Digite o ID para ser atualizado: ");
                    int alunoAtualiza = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome do aluno: ");
                    String novoNome = scanner.nextLine();

                    System.out.print("A idade do aluno: ");
                    int novaIdade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("O curso do aluno: ");
                    String novoCurso = scanner.nextLine();

                    cadastro.atualizarAluno(alunoAtualiza, novoNome, novaIdade, novoCurso);

                    break;
                }

                case DELETAR:{
                    System.out.println("Digite o ID para remover: ");
                    int alunoDelete = scanner.nextInt();
                    scanner.nextLine();

                    cadastro.deleteAluno(alunoDelete);
                    break;
                }

                case SAIR:{
                    continuar = false;
                    System.out.println("Obrigado por Usar.");
                    System.out.println("Encerrando......");
                    break;
                }

                case INVALIDO:{
                    System.out.println("Opção inválida.");
                    break;
                }
            }
        }
        scanner.close();
    }

}
