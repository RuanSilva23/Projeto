package Projeto_Fibonacci.AreaDosMetodos;

import Projeto_Fibonacci.AreaDeControle.FibonacciStrategy;

public class FibonacciRecursivaSimples implements FibonacciStrategy {
    @Override
    public int calcular(int n) {

        if (n == 0 || n == 1){
            return n;
        }else {
            return calcular(n - 1) + calcular(n - 2);
        }
    }
}
