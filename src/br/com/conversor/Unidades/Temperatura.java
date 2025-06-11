package br.com.conversor.Unidades;

import java.util.Scanner;

public class Temperatura {
    public static double temperaturaCelsius(double valor){
        Scanner scanner = new Scanner(System.in);
        String menuC = """
                Para qual:
                1 - ºC para ºF
                2 - ºC para K""";
        System.out.println(menuC);

        System.out.print("Opção: ");
        int opcaoC = scanner.nextInt();

        if (opcaoC == 1){
            return (valor*9/5)+32;

        } else if (opcaoC == 2) {
            return valor + 273.15;
        }else {
            System.out.println("Opção Invalida.");
            return 0;
        }
    }

    public static double temperaturaFahrenheit(double valor){
        Scanner scanner = new Scanner(System.in);
        String menuF = """
                Para qual:
                1 - ºF para ºC
                2 - ºF para K""";
        System.out.println(menuF);

        System.out.print("Opção: ");
        int opcaoF = scanner.nextInt();

        if (opcaoF == 1){
            return (valor - 32)*5/9;

        } else if (opcaoF == 2) {
            return (valor - 32)*(5/9) + 273.15;
        }else {
            System.out.println("Opção Invalida.");
            return 0;
        }
    }

    public static double temperaturaKelvin(double valor){
        Scanner scanner = new Scanner(System.in);
        String menuF = """
                Para qual:
                1 - K para ºC
                2 - K para ºF""";
        System.out.println(menuF);

        System.out.print("Opção: ");
        int opcaoK = scanner.nextInt();

        if (opcaoK == 1){
            return valor - 273.15;

        } else if (opcaoK == 2) {
            return (valor - 273.15)*(9/5)+32;
        }else {
            System.out.println("Opção Invalida.");
            return 0;
        }
    }
}
