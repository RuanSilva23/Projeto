package Projeto_Fibonacci.AreaDosMetodos;

import Projeto_Fibonacci.AreaDeControle.FibonacciStrategy;

import java.util.Arrays;

public class FibonacciComMemo implements FibonacciStrategy {
    private int[] memo;

    public FibonacciComMemo(int[] memo){
        this.memo = memo;
        Arrays.fill(this.memo, -1);

    }

    public int calcular(int n){

        if (memo[n] != -1){
            return memo[n];
        }
        if (n == 0 || n == 1){
            return n;
        }else {
            memo[n] = calcular(n - 1) + calcular(n - 2);
            return memo[n];
        }
    }
}
