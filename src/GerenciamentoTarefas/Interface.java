package GerenciamentoTarefas;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        boolean continuar = true;

        while (continuar){
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            NomeMetodos codigo = NomeMetodos.fromCodigo(opcao);

            switch (codigo){
                case ADICIONAR:{
                    System.out.println("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefas(descricao);
                    break;
                }

                case LISTAR:{
                    gerenciador.listarTarefas();
                    break;
                }

                case CONCLUIR:{
                    System.out.println("Digite o ID da tarefa a concluir: ");
                    int idConcluir = scanner.nextInt();
                    gerenciador.concluirTarefas(idConcluir);
                    break;
                }

                case REMOVER:{
                    System.out.println("Digite o ID da tarefa a remover: ");
                    int idRemover = scanner.nextInt();
                    gerenciador.removerTarefa(idRemover);
                    break;
                }

                case EDITAR:{
                    System.out.println("Digite o ID da tarefa a editar: ");
                    int idEditar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite a nova Descrição: ");
                    String novaDescricao = scanner.nextLine();
                    gerenciador.editarTarefa(idEditar, novaDescricao);
                    break;

                }

                case SAIR:{
                    continuar = false;
                    System.out.println("Encerrando... Obrigado!");
                    break;
                }

                default:{
                    System.out.println("Opção Inválida. Tente Novamente!!");

                }
            }
            System.out.println();
        }
        scanner.close();
    }

    public static void exibirMenu(){
        System.out.println(" -------GERENCIADOR DE TAREFAS--------");
        System.out.println("1 - Adicionar Tarefa");
        System.out.println("2 - Listar Tarefas");
        System.out.println("3 - Concluir Tarefa");
        System.out.println("4 - Remover Tarefa");
        System.out.println("5 - Editar Tarefa");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}
