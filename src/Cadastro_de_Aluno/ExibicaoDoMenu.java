package Cadastro_de_Aluno;

import java.util.Scanner;

public class ExibicaoDoMenu {
    public static int exibirMenu(Scanner scanner ){
        System.out.println("------ Cadastro de Aluno -------- ");
        System.out.println("1 - Cadastro do Aluno ");
        System.out.println("2 - Consultar listar dos alunos ");
        System.out.println("3 - Atualizar cadastro do aluno ");
        System.out.println("4 - Remover cadastro do aluno ");
        System.out.println("5 - Sair ");
        System.out.print("Opção escolhida: ");
         return scanner.nextInt();

    }
}
