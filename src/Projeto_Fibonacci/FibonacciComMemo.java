package Projeto_Fibonacci;

import java.util.Arrays;

public class FibonacciComMemo implements FibonacciStrategy {
    private int[] memo;

    public int calcular(int n) {
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return calcularComMemo(n);
    }

    private int calcularComMemo(int n){

        if (memo[n] != -1){
            return memo[n];
        }
        if (n == 0 || n == 1){
            return n;
        }else {
            memo[n] = calcularComMemo(n - 1) + calcularComMemo(n - 2);
            return memo[n];
        }
    }
}
