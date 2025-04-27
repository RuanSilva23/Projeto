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

            MetodosFibo metodo  = MetodosFibo.fromCodigo(opcao);



            if (metodo == null) {
                System.out.println("Opção invalida!! Tente novamente!!");
                continue;
            }


            int termos = quantidadeTermos(scanner);





            switch (metodo){
                case RECURSIVO_SIMPLES:{
                    estrategia = new FibonacciRecursivaSimples();
                    break;
                }

                case MEMOIZACAO:{
                    estrategia = new FibonacciComMemo(Arrays.copyOf(new int[termos + 1], termos + 1));
                    break;
                }

                case INTERATIVA:{
                    estrategia = new FibonacciIterativa();
                    break;
                }

                case COMPARAR_TODAS:{
                    Comparador.comparar(termos);
                    break;
                }

                case SAIR:{
                    continuar = false;
                    System.out.println("Obrigado por usar");
                    System.out.println("Encerrando......... ");
                    continue;
                }

                default:{
                    assert false;
                }
            }

            if (metodo != MetodosFibo.COMPARAR_TODAS && metodo != MetodosFibo.SAIR){
                BenchmarkFibonacci benckmark = new BenchmarkFibonacci(estrategia, termos);
                double tempoExecucao = benckmark.executar();
                System.out.printf("\nTempo de execução com Benchmark: %.4f milissegundos.\n", tempoExecucao);
            }

            System.out.println(" ");


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
        System.out.println("4 - Comparar todas as estratégias ");
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
