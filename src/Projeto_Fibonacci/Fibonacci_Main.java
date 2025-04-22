package Projeto_Fibonacci;

import java.util.Scanner;

public class Fibonacci_Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar){
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");

            int opcao = scanner.nextInt();

            if (opcao==0){
                continuar = false;
                System.out.println();
                continue;
            } else if (opcao > 4 || opcao < 0) {
                System.out.println(" ");
                continue;
            }

            System.out.println(" ");

            int n = scanner.nextInt();

            switch (opcao){
                case 1:{

                    break;
                }

                case 2:{

                    break;
                }

                case 3:{

                    break;
                }

                default:{
                    System.out.println(" ");
                    break;
                }
            }


        }
    }
}
