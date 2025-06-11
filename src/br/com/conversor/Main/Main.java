package br.com.conversor.Main;

import br.com.conversor.Configuracao.Menus;
import br.com.conversor.Configuracao.NomeDasUnidades;
import br.com.conversor.Unidades.Comprimento;
import br.com.conversor.Unidades.Massa;
import br.com.conversor.Unidades.Temperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;


        while (continuar){
            Menus.MenuPrincipal();
            System.out.print("Escolha a opção: ");
            int opcao = scanner.nextInt();

            NomeDasUnidades unidades = NomeDasUnidades.fromCodigo(opcao);

            switch (unidades){
                case COMPRIMENTO:{
                    Menus.MenuComprimento();
                    System.out.print("Opção: ");
                    int opcaoCompri = scanner.nextInt();
                    if (opcaoCompri == 1){
                        System.out.print("Quantos metros: ");
                        int valor = scanner.nextInt();
                        System.out.println("Valor: " + Comprimento.metroParaCm(valor) + " cm.");

                    } else if (opcaoCompri == 2) {
                        System.out.print("Quantos centimetros: ");
                        int valor = scanner.nextInt();
                        System.out.println("Valor: " + Comprimento.centimetroParaMetros(valor) + " m.");

                    }
                    break;
                }
                case MASSA:{
                    Menus.MenuMassa();
                    System.out.print("Opção: ");
                    int opcaoMassa = scanner.nextInt();
                    if (opcaoMassa == 1){
                        System.out.print("Quantos KG: ");
                        double kg = scanner.nextDouble();
                        System.out.println("Valor: " + Massa.KG(kg));
                    } else if (opcaoMassa == 2 ) {
                        System.out.print("Quantas g: ");
                        double g = scanner.nextDouble();
                        System.out.println("Valor: " + Massa.G(g));

                    } else if (opcaoMassa == 3) {
                        System.out.print("Quantas t: ");
                        double t = scanner.nextDouble();
                        System.out.println("Valor: " + Massa.T(t));
                    }else {
                        System.out.println("Opção Invalida.");
                        continue;
                    }
                    break;
                }
                case TEMPERATURA:{
                    Menus.MenuTemperatura();
                    System.out.print("Opção: ");
                    int opcaoTempe = scanner.nextInt();
                    if (opcaoTempe == 1){
                        System.out.print("Qual a temperatura em ºC: ");
                        double valorC = scanner.nextDouble();
                        System.out.println("Temperatura: " + Temperatura.temperaturaCelsius(valorC));

                    } else if (opcaoTempe == 2) {
                        System.out.print("Qual a temperatura em ºF: ");
                        double valorF = scanner.nextDouble();
                        System.out.println("Temperatura: " + Temperatura.temperaturaFahrenheit(valorF));

                    }else if (opcaoTempe == 3){
                        System.out.print("Qual a temperatura em K: ");
                        double valorK = scanner.nextDouble();
                        System.out.println("Temperatura: " + Temperatura.temperaturaKelvin(valorK));

                    }else {
                        System.out.println("Opção Invalida.");
                        continue;
                    }
                    break;
                }
                /*case TEMPO:{

                    break;
                }
                case VELOCIDADE:{

                    break;
                }
                case METROCUBICO:{

                    break;
                }
                case METROQUADRADO:{

                }*/
                case SAIR:{
                    continuar = false;
                    System.out.println("Encerrando..");
                    System.out.println( );
                    break;
                }
                default:{
                    System.out.println("Opção Invalida. Tente novamente.");
                    break;
                }

            }

        }
    }
}
