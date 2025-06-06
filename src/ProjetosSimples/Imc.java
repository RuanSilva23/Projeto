package ProjetosSimples;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculador de IMC");

        System.out.print("Qual é sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Qual é seu peso: ");
        double peso = scanner.nextDouble();



        double resultadoImc = peso/(altura*altura);

        System.out.printf("Seu IMC é: %.2f\n", resultadoImc);

        if (resultadoImc < 16){
            System.out.println("Magreza grau III ");


        } else if (resultadoImc >= 16 && resultadoImc < 17 ) {
            System.out.println("Magreza grau II ");


        } else if (resultadoImc>=17 && resultadoImc <= 18.4) {
            System.out.println("Magreza grau I ");


        } else if (resultadoImc >18.4 && resultadoImc <= 24.9) {
            System.out.println("Peso Ideal ");


        } else if (resultadoImc >24.9 && resultadoImc <= 29.9) {
            System.out.println("Pré-Obesidade ");


        } else if (resultadoImc >29.9 && resultadoImc <= 34.9) {
            System.out.println("Obesidade grau I ");


        } else if (resultadoImc > 34.9 && resultadoImc <= 39.9) {
            System.out.println("Obesidade grau II ");


        }else {
            System.out.println("Obesidade grau III ");


        }
    }
}
