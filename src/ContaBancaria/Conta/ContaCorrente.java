package ContaBancaria.Conta;

import ContaBancaria.Usuario.Cliente;

public class ContaCorrente extends Conta{
    private double LimiteChequeEspecial;
    private double taxaDeManuntencao;


    public ContaCorrente(String numeroDaConta, Cliente titular, double limiteChequeEspecial) {
        super(numeroDaConta, titular);
        this.LimiteChequeEspecial = limiteChequeEspecial;
    }

    public boolean sacar(double valor){
        if (valor <= saldo){
            saldo-=valor;
            return true;
            //System.out.println("Saque realizado com sucesso.");
            //System.out.println("Saldo restante: " + saldo);
            //System.out.println("Cheque Especial: " + LimiteChequeEspecial);


        }else if (valor <= LimiteChequeEspecial){
            LimiteChequeEspecial -= valor;
            System.out.println("Limite do Cheque Especial usado para saque.");
            System.out.println("Saque realizado com sucesso.");
        }else {
            System.out.println("Valor para saque insuficiente.");
            return false;
        }
        return false;
    }

    public boolean depositar(double valor){
        if (valor<0){
            return false;
        }
        return true;
    }

    public boolean transferir(Conta destino, double valor){
        if (numeroDaConta.equals(destino) && valor > 0 && valor <= saldo){
            return true;
        }else {
            return false;
        }
    }

    public double getLimiteChequeEspecial() {
        return LimiteChequeEspecial;
    }

    public void aplicarTaxaManuntencao(){
        if (dataAbertura.isLeapYear()){
                saldo -= taxaDeManuntencao;
        }
    }
}
