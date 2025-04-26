package Projeto_Fibonacci;

public class ResultadoEstrategia implements Comparable<ResultadoEstrategia> {
    private final String nome;
    private final double tempo;

    public ResultadoEstrategia(String nome, double tempo){
        this.nome = nome;
        this.tempo = tempo;
    }

    public String getNome(){
        return nome;
    }

    public double getTempo(){
        return tempo;
    }


    @Override
    public int compareTo(ResultadoEstrategia outro) {
        return Double.compare(this.tempo, outro.tempo);
    }
}
