import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while(continua) {
            System.out.println("\n--------Tabuada---------");

            int x = selecionadordaTabuada(scanner);

            int y = selecionadorAteQuanto(scanner);

            int i = 1;
            do {
                int resultado = x * i;
                System.out.println(x + " * " + i + " = " + resultado);
                i++;
            } while (i <= y);
            int continuar = continuarouNao(scanner);
            if (continuar == 1){
                continue;
            }else{
                continua = false;
            }
        }
    }

    public static int selecionadordaTabuada(Scanner scanner){
        System.out.print("Qual tabuada: ");
        return scanner.nextInt();
    }

    public static int selecionadorAteQuanto(Scanner scanner){
        System.out.print("Quantas vezes: ");
        return scanner.nextInt();
    }

    public static int continuarouNao(Scanner scanner){
        System.out.print("Quer continuar(1) ou não(0): ");
        int pergunta = scanner.nextInt();
        System.out.println();
        if (pergunta == 0 || pergunta == 1){
            return pergunta;
        }else {
            System.out.print("Opção inválida!! Tente novamente.");
            System.out.println();
            return continuarouNao(scanner);

        }
    }
}
