package br.com.conversor.Configuracao;

public enum NomeDasUnidades {
    COMPRIMENTO,
    MASSA,
    TEMPERATURA,
    TEMPO,
    VELOCIDADE,
    METROCUBICO,
    METROQUADRADO,
    SAIR;

    public static NomeDasUnidades fromCodigo(int codigo){
        switch (codigo){
            case 1: {
                return COMPRIMENTO;
            }
            case 2:{
                return MASSA;
            }
            case 3:{
                return TEMPERATURA;
            }
            case 4:{
                return TEMPO;
            }
            case 5:{
                return VELOCIDADE;
            }
            case 6:{
                return METROCUBICO;
            }
            case 7:{
                return METROQUADRADO;
            }
            case 0:{
                return SAIR;
            }
            default:{
                return null;
            }
        }
    }
}
