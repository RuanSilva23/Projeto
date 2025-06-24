package ProjetosSimples;

import java.util.Scanner;

public class Logica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String escolha = """
                1 - Tabuada
                2 - Jogo Do Número Secreto
                """;
        System.out.print(escolha);
        System.out.print("Opção escolhida: ");
        int opcaoescolhida = scanner.nextInt();
        if (opcaoescolhida < 1 || opcaoescolhida > 2){
            System.out.println("Opção Inválida");
        }
        switch (opcaoescolhida) {
            case 1: {

                System.out.print("Me diga um número: ");
                int numero = scanner.nextInt();

                for (int i = 0; i <= 10; i++) {
                    System.out.println(numero + "x" + i + " = " + numero * i);
                }
                break;
            }
            case 2: {
                int numeroSecreto = geradorDeNumero();
                int numeroEscolhido;
                int tentativas = 0;


                telaInicial();


                boolean condicao = true;

                do {
                    System.out.print("número digitado: ");
                    numeroEscolhido = scanner.nextInt();
                    if (numeroSecreto < numeroEscolhido) {
                        System.out.println("\nO número procurado é menor.");
                    } else if (numeroSecreto > numeroEscolhido) {
                        System.out.println("\nO número secreto é maior.");
                    } else {
                        condicao = false;
                        System.out.println("\nVocê acertou o número secreto " + numeroSecreto);
                        System.out.println("O número de tentativas é igual a " + tentativas + " tentativas.");
                    }
                    tentativas++;
                } while (condicao);
                break;
            }
        }


    }

    public static int geradorDeNumero(){
        return (int)(Math.random()* 100) + 1;
    }

    public static void telaInicial(){
        System.out.println("----------------------");
        System.out.println("Jogo do número secreto");
        System.out.println("O número secreto está entre 1 a 100.");
        System.out.println("----------------------");
    }
}
