package Projeto_Fibonacci.Calculos;

import Projeto_Fibonacci.AreaDeControle.FibonacciStrategy;

public class BenchmarkFibonacci {
    private FibonacciStrategy estrategia;
    private int termos;

    public BenchmarkFibonacci(FibonacciStrategy estrategia, int termos){
        this.estrategia = estrategia;
        this.termos = termos;
    }

    public double executar(){
        long inicio = System.nanoTime();

        for (int i = 0; i <= termos; i++){
            estrategia.calcular(i);
        }

        long fim = System.nanoTime();

        return (fim - inicio)/1_000_000.00;

    }
}
