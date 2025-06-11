package br.com.conversor.Configuracao;

public class Menus {

    public static void MenuPrincipal(){
        String principal = """
                Conversor de Grandezas:
                1 - Comprimento
                2 - Massa
                3 - Temperatura
                4 - Tempo
                5 - Velocidade
                6 - Metros Cúbicos
                7 - Metros Quadrado
                0 - Sair
                """;
        System.out.println(principal);
    }

    public static void MenuComprimento(){
        String comprimento = """
                Qual será a conversão:
                1 - Metros para centimetros
                2 - Centimetros para metros 
                """;

        System.out.println(comprimento);
    }

    public static void MenuMassa(){
        String massa = """
                De qual:
                1 - Kilograma
                2 - grama
                3 - Tonelada
                """;
        System.out.println(massa);
    }

    public static void MenuTemperatura(){
        String temperatura = """
                Para qual:
                1 - Celsius
                2 - Fahrenheit
                3 - Kelvin
                """;
        System.out.println(temperatura);
    }
}
