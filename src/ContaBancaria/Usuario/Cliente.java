package ContaBancaria.Usuario;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {
    private String nome;
    private String CPF;
    private String endereco;
    private LocalDate dataDeNascimento;
    private  String email;
    private String senha;

    public Cliente(String nome, String CPF, String endereco, LocalDate dataDeNascimento, String email, String senha) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean autenticador(String senha){
        if (Objects.equals(senha, getSenha())){
            return true;
        }else {
            return false;
        }
    }
}
