package ContaBancaria.Usuario;

public class UsuarioDaConta {
    private String nome;
    private String CPF;
    private String tipodaConta;
    private int Cep;

    public UsuarioDaConta(String nome, String CPF, String tipodaConta, int cep) {
        this.nome = nome;
        this.CPF = CPF;
        this.tipodaConta = tipodaConta;
        Cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getTipodaConta() {
        return tipodaConta;
    }

    public int getCep() {
        return Cep;
    }

    @Override
    public String toString() {
        return "Conta " + tipodaConta +
                "Nome: " + nome +
                "Cpf: " + CPF
                ;
    }
}
