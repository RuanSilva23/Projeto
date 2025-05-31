package ContaBancaria.Usuario;

public class UsuarioDaConta {
    private String Nome;
    private String TipoDaConta;
    private int agencia;
    private int numeroConta;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getTipoDaConta() {
        return TipoDaConta;
    }

    public int NumeroConta(int numero){
        this.numeroConta = numero;
        return numero;
    }
}
