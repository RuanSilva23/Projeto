package Projeto_Fibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci_Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar){

            int opcao = exibirMenu(scanner);
            FibonacciStrategy estrategia = null;

            if (opcao==0){
                continuar = false;
                System.out.println("Obrigado por usar");
                System.out.println("Encerrando......... ");
                continue;
            } else if (opcao > 4 || opcao < 0) {
                System.out.println("Opção invalida!! Tente novamente!!");
                continue;
            }

            int termos = quantidadeTermos(scanner);


            switch (opcao){
                case 1:{
                    estrategia = new FibonacciRecursivaSimples();
                    break;
                }

                case 2:{
                    estrategia = new FibonacciComMemo(Arrays.copyOf(new int[termos + 1], termos + 1));
                    break;
                }

                case 3:{
                    estrategia = new FibonacciIterativa();
                    break;
                }

                default:{
                    assert false;
                }
            }

            System.out.println(" ");

            System.out.println("A Sequência de Fibonacci: ");

            long inicio = System.nanoTime();
            for (int i = 0; i <= termos; i++){
                System.out.print(estrategia.calcular(i) + " ");
            }
            long fim = System.nanoTime();

            double nano_milisegundo = (fim - inicio)/1_000_000.0;

            System.out.println(" ");

            System.out.printf("\nTempo de execução: %.4f milissegundos.\n", nano_milisegundo );

            System.out.println( );


        }
        scanner.close();
    }
    public static int exibirMenu(Scanner scanner){
        System.out.println("===========MENU=============");
        System.out.println(" ");
        System.out.println("Escolha uma das alternativa abaixo:");
        System.out.println(" ");
        System.out.println("1 - Fibonacci Recursiva Simples ");
        System.out.println("2 - Fibonacci com Memoização");
        System.out.println("3 - Fibonacci Iterativa ");
        System.out.println("0 - Sair ");
        System.out.print("Escolha uma opção: ");

        return scanner.nextInt();
    }

    public static int quantidadeTermos(Scanner scanner){
        int termos;
        do {
            System.out.print("Quantos termos: ");
            termos = scanner.nextInt();

            if (termos < 0){
                System.out.println("Coloque números não negativos!!");
            }
        }while(termos < 0);

        return termos;
    }
}
