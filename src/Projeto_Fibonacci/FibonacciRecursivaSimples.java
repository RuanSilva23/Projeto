package Projeto_Fibonacci;

public class FibonacciRecursivaSimples {
    public static int calculoRecursivaSimples(int n){
        if (n == 0 || n == 1){
            return n;
        }else {
            return calculoRecursivaSimples(n - 1) + calculoRecursivaSimples(n - 2);
        }
    }
}
