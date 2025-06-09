package ContaBancaria.Interface;

import ContaBancaria.Usuario.UsuarioDaConta;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco Vitória.");
        System.out.println("Selecione o que você precisa: ");
        System.out.println("1 - Abertura de conta.");
        System.out.println("2 - Login na sua conta");
        System.out.print("Opção escolhida: ");

        int opcao = scanner.nextInt();

        if (opcao > 2 || opcao < 1){
            System.out.println("Opção invalida.");
            System.out.println("Tente novamente.");

        }

        switch (opcao){
            case 1:{
                scanner.nextLine();
                System.out.println("Área de Cadastramento para abertura.");
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Cpf: ");
                String cpf = scanner.nextLine();
                scanner.nextLine();
                System.out.print("Tipo da Conta a qual quer abrir: ");
                String tipoDaConta = scanner.nextLine();
                System.out.print("Cep: ");
                int cep = scanner.nextInt();
                UsuarioDaConta usuario = new UsuarioDaConta(nome, cpf, tipoDaConta,cep);

                System.out.println(usuario);
            }

            case 2:{
                System.out.println("Área de Login");
                System.out.print("Email: ");
                String autenticacaoDeEmail = scanner.nextLine();
                System.out.print("Senha: ");
                String autenticacaoDeSenha = scanner.nextLine();

            }

        }
    }
}
