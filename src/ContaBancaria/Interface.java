package ContaBancaria;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Ruan Silva";
        String tipoDeConta = "Conta corrente";
        int agencia = 1010;
        String conta = "25252-5";
        double saldo = 2500.00;

        int opcao = 0;

        System.out.println("**********************");
        System.out.println("\nBanco Mais Você");
        System.out.println("Dados Castrados:");
        System.out.println("Nome: " + nome);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo: R$2500.00");
        System.out.println("\n**********************");


        String menu = """
                Opções:
                1 - Consultar Saldo
                2 - Depositar
                3 - Sacar
                4 - Sair
                """;

        while (opcao != 4) {
            System.out.println();
            System.out.println(menu);
            System.out.print("Opção escolhida: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:{
                    System.out.println("O saldo atual é de R$" + saldo);
                    break;
                }
                case 2:{
                    System.out.print("Valor do deposito: R$");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;

                    System.out.println("Saldo atualizado: R$" + saldo);

                    break;
                }
                case 3:{
                    System.out.print("Valor do saque: R$");
                    double saque = scanner.nextDouble();

                    if (saldo >= saque) {
                        saldo = saldo - saque;

                        System.out.println("Saldo atualizado: R$" + saldo);

                    }else{
                        System.out.println("O valor para saque não está disponivel.");
                    }
                    break;
                }
                case 4:{
                    System.out.println("Encerrando....");
                    break;
                }
                default:{
                    System.out.println("Opção inválida.");
                    System.out.println("Tente novamente.");
                    break;
                }
            }
        }
    }
}
