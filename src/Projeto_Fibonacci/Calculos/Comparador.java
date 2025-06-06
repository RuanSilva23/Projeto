package Projeto_Fibonacci.Calculos;

import Projeto_Fibonacci.AreaDosMetodos.FibonacciComMemo;
import Projeto_Fibonacci.AreaDosMetodos.FibonacciIterativa;
import Projeto_Fibonacci.AreaDosMetodos.FibonacciRecursivaSimples;
import Projeto_Fibonacci.AreaDeControle.FibonacciStrategy;

import java.util.Arrays;

public class Comparador {
    public static void comparar(int termos){

        /* Fibonacci Recursiva Simples*/
        FibonacciStrategy recursiva = new FibonacciRecursivaSimples();

        long inicioRecursiva = System.nanoTime();

        for (int i = 0; i <= termos; i++){
            recursiva.calcular(i);
        }
        long fimRecursiva = System.nanoTime();

        double tempoRecursiva = (fimRecursiva - inicioRecursiva)/1_000_000.00;

        /*Fibonacci com Memo*/
        FibonacciStrategy memoizacao = new FibonacciComMemo(Arrays.copyOf(new int[termos + 1], termos + 1));

        long inicioComMemo = System.nanoTime();
        for (int i = 0; i <= termos; i++){
            memoizacao.calcular(i);
        }
        long fimComMemo = System.nanoTime();

        double tempoMemo = (fimComMemo - inicioComMemo)/1_000_000.00;

        /*Fibonacci Interativo*/
        FibonacciStrategy interativo = new FibonacciIterativa();

        long inicioIterativo = System.nanoTime();

        for (int i = 0;i <= termos; i++){
            interativo.calcular(i);
        }

        long fimIterativo = System.nanoTime();

        double tempoInterativo = (fimIterativo - inicioIterativo)/1_000_000.00;

        /*Mostrador dos tempos*/

        System.out.println("\n======Comparador de tempo======");
        System.out.printf("Recursiva Simples: %.4f ms\n", tempoRecursiva);
        System.out.printf("Memoização: %.4f ms\n", tempoMemo);
        System.out.printf("Interativo: %.4f ms\n", tempoInterativo);
        System.out.println("==================================\n");
    }
}
