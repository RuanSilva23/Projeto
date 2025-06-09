package ContaBancaria.Conta;

import ContaBancaria.Usuario.Cliente;

import java.time.LocalDate;
import java.util.List;

public class Conta {
    protected String numeroDaConta;
    protected double saldo;
    protected Cliente titular;
    protected LocalDate dataAbertura;
    protected String senhaDaConta;
    protected List<Transacoes> historicoDeTransacoes;

    public Conta(String numeroDaConta, Cliente titular){
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public List<Transacoes> getHistoricoDeTransacoes() {
        return historicoDeTransacoes;
    }

    protected void adicionarTranacao(Transacoes transacoes){

    }

    public String gerarExtrato(){
        for (Transacoes transacoes : historicoDeTransacoes){
            return transacoes.toString();
        }
        return "";
    }
}
