package Projeto_Fibonacci;

public class FibonacciComMemo {
    public static int calculoMemo(int n, int[] memo){
        if (memo[n] != -1){
            return memo[n];
        }
        if (n == 0 || n == 1){
            return n;
        }else {
            return calculoMemo(n - 1, memo) + calculoMemo(n - 2, memo);
        }
    }
}
