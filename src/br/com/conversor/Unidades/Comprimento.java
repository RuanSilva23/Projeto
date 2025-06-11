package br.com.conversor.Unidades;

public class Comprimento {
    private int metro;
    private int centimetro;

    public static int metroParaCm(int valor){
        return valor * 100;
    }

    public static int centimetroParaMetros(int valor){
        return valor/100;
    }

}
