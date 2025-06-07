package ContaBancaria.Conta;

import ContaBancaria.Usuario.Cliente;

public class Conta {
    private String agencia;
    private String numeroDaConta;
    private Cliente titularDaConta;
    private double saldo;

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public Cliente getTitularDaConta() {
        return titularDaConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
