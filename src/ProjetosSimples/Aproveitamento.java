package ProjetosSimples;

import java.util.Scanner;

public class Aproveitamento {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean continua = true;

        while (continua) {
            double mediaTotal = nota1(scanner);

            System.out.println("Sua média foi de " + mediaTotal);
            System.out.println("Seu aproveitameto foi: ");

            if (mediaTotal > 9) {
                System.out.println("ProjetosSimples.Aproveitamento A ");

            } else if (mediaTotal < 9 && mediaTotal >= 7) {
                System.out.println("ProjetosSimples.Aproveitamento B ");

            } else if (mediaTotal < 7 && mediaTotal >= 6) {
                System.out.println("ProjetosSimples.Aproveitamento C ");

            } else if (mediaTotal < 6 && mediaTotal >= 5) {
                System.out.println("ProjetosSimples.Aproveitamento D ");

            } else if (mediaTotal < 5 && mediaTotal >= 4) {
                System.out.println("ProjetosSimples.Aproveitamento E ");

            } else {
                System.out.println("ProjetosSimples.Aproveitamento F ");
            }

            if (mediaTotal > 6) {
                System.out.println("Vocé foi Aprovado");
            } else {
                System.out.println("Vocé está Reprovado");
            }

            System.out.println("Você quer continuar? [S = 1 / N = 2]");
            int condicao = scanner.nextInt();
            if (condicao == 1){
                System.out.println("Próximo notas");
            } else {
                continua = false;
            }

        }
    }

    public static double nota1(Scanner scanner){
        System.out.println("=======================");
        System.out.println("ProjetosSimples.Aproveitamento do Aluno");
        System.out.println("=======================");
        System.out.print("A 1° Nota: ");
        int nota1 = scanner.nextInt();
        System.out.print("A 2° Nota: ");
        int nota2 = scanner.nextInt();
        System.out.print("A 3° Nota: ");
        int nota3 = scanner.nextInt();
        System.out.print("A 4° Nota: ");
        int nota4 = scanner.nextInt();

        return  (double) (nota1 + nota2 + nota3 + nota4) / 4;

    }


}
