package Projeto_Fibonacci;

public class FibonacciIterativa implements FibonacciStrategy {
    public int calcular(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int a = 0;
        int b = 1;
        int soma = 0;

        for (int i = 2; i <= n; i++){
            soma = a + b;
            a = b;
            b = soma;
        }
        return soma;
    }
}
