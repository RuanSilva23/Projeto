package Projeto_Fibonacci;

public class FibonacciIterativa {
    public static int calculoInterativo(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++){
            int soma = a + b;
            a = b;
            b = soma;
        }
        return b;
    }
}
