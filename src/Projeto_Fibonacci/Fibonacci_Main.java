package Projeto_Fibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci_Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar){
            System.out.println("===========MENU=============");
            System.out.println("Escolha uma das alternativa abaixo:");
            System.out.println("1 - Fibonacci Recursiva Simples ");
            System.out.println("2 - Fibonacci com Memoização");
            System.out.println("3 - Fibonacci Iterativa ");
            System.out.println("0 - Sair ");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
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

            System.out.print("Quantos termos: ");

            int termos = scanner.nextInt();

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
                    System.out.println("Opção Invalida. Tente novamente!! ");
                    continue;
                }
            }

            System.out.println("A Sequência de Fibonacci: ");
            for (int i = 0; i <= termos; i++){
                System.out.print(estrategia.calcular(i) + " ");
            }
            System.out.println( );


        }
        scanner.close();
    }
}
