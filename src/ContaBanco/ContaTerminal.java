package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("      Banco Mais Você      ");
        System.out.println("Crie sua conta agora ");

        System.out.print("Por favor, Digite sua Agência: ");
        String agencia = scanner.nextLine();


        System.out.print("Digite sua conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Digite seu nome: ");
        String nomes = scanner.nextLine();


        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomes + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque ");

    }
}
