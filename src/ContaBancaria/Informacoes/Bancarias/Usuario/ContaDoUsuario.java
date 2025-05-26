package ContaBancaria.Informacoes.Bancarias.Usuario;

import ContaBancaria.Informacao.Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ContaDoUsuario {
    private List<Usuario> usuario = new ArrayList<>();

    public void adicionarNovoCliente(String nome, String tipoDeConta, int agencia, String conta, double saldo){
        Usuario usuario = new Usuario(nome, tipoDeConta, agencia, conta);
        usuario.add();
    }

}
