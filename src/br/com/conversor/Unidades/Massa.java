package br.com.conversor.Unidades;

import java.util.Random;
import java.util.Scanner;

public class Massa {
    /*
    * 1 - Kilograma:
    * 1.1 - Kg -> t
    * 1.2 - Kg -> g

    * 2 - Gramas:
    * 2.1 - g -> Kg
    * 2.2 - g -> t

    * 3 - Tonelada:
    * 3.1 - T -> Kg
    * 3.2 - T -> g
     */


    public static double KG(double valor){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tipo de conversão: ");
        System.out.println("1 - Kg -> t");
        System.out.println("2 - Kg -> g");
        System.out.print("Opção: ");
        int opcaoKG = scanner.nextInt();
        switch (opcaoKG){
            case 1:{
                return valor / 1000;
            }
            case 2:{
                return valor*1000;
            }
            default:{
                System.out.println("Opção Invalida.");
                return 0;
            }
        }

    }

    public static double G(double valor){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tipo de conversão: ");
        System.out.println("1 - g -> Kg");
        System.out.println("2 - g -> T");
        System.out.print("Opção: ");
        int opcaoG = scanner.nextInt();
        switch (opcaoG) {
            case 1: {
                return valor / 1000;
            }
            case 2: {
                return valor / 1000000;
            }
            default: {
                System.out.println("Opção Invalida.");
                return 0;
            }
        }
    }

    public static double T(double valor){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tipo de conversão: ");
        System.out.println("1 - T -> Kg");
        System.out.println("2 - T -> g");
        System.out.print("Opção: ");
        int opcaoT = scanner.nextInt();
        switch (opcaoT) {
            case 1: {
                return valor * 1000;
            }
            case 2: {
                return valor * 1000000;
            }
            default: {
                System.out.println("Opção Invalida.");
                return 0;
            }
        }
    }
}
