package ContaBancaria;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("Cadastramento de conta");
        System.out.print("Nome do Titular: ");
        String nome = scanner.nextLine();
        System.out.print("Número da Conta: ");
        String conta = scanner.nextLine();
        System.out.print("Valor do deposito inicial: ");
        double saldoInicial = scanner.nextDouble();

        usuario.setNome(nome);
        usuario.setConta(conta);
        usuario.setSaldo(saldoInicial);

        int opcao = 0;

        usuario.exibircadastro();

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
                    usuario.exibicaoSaldo();
                    break;
                }
                case 2:{
                    System.out.print("Valor do deposito: R$");
                    double deposito = scanner.nextDouble();
                    usuario.adicaoSaldo(deposito);

                    double saldo = usuario.getSaldo();
                    System.out.println("Saldo atualizado: R$" + saldo);



                    break;
                }
                case 3:{
                    System.out.print("Valor do saque: R$");
                    double saque = scanner.nextDouble();
                    double saldo = usuario.getSaldo();
                    if (saldo >= saque) {
                        saldo = saldo - saque;

                        System.out.println("Saldo atualizado: R$" + saldo);
                        usuario.setSaldo(saldo);

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
