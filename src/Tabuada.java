import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--------Tabuada---------");
        System.out.print("Qual tabuada: ");
        int x = scanner.nextInt();
        System.out.print("Quantas vezes: ");
        int y = scanner.nextInt();

        int i = 0;
        do {
            int resultado = x * i;
            System.out.println(x + " * " + i + " = " + resultado);
            i++;
        }while (i <= y);
    }
}
