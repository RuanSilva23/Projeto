package ContaBancaria.Conta;

import ContaBancaria.Usuario.Cliente;

import java.time.LocalDate;

public class ContaPoupanca extends Conta{
    private double taxaDeJuros;
    private LocalDate dataDoUltimoRendimento;

    public ContaPoupanca(String numeroDaConta, Cliente titular, double taxaDeJuros) {
        super(numeroDaConta, titular);
        this.taxaDeJuros = taxaDeJuros;
    }

    public boolean sacar(double valor){
        if (valor<=saldo){
            return true;
        }
        return false;
    }

    public boolean depositar(double valor){
        if (valor < 0){
            return false;
        }
        return true;
    }

    public boolean transferir(Conta destino, double valor){
        if (numeroDaConta.equals(destino) && valor > 0){
            return true;
        }
        return false;
    }

    public void aplicarTaxadeRendimento(){
        taxaDeJuros = 0.45;
        saldo += (saldo * taxaDeJuros);
    }
}
