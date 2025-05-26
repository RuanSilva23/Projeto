package ContaBancaria.Informacao.Usuario;

public class Usuario{
    private String nome;
    private String tipoDeConta;
    private int agencia;
    private String conta;
    private double saldo;


    public String getNome() {
        return nome;
    }

    public Usuario(String nome, String tipoDeConta, int agencia, String conta, double saldo) {
        this.nome = nome;
        this.tipoDeConta = tipoDeConta;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
