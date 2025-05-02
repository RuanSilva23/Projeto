package Cadastro_de_Aluno;

import javax.swing.*;
import java.awt.*;

public class InterfaceGrafica extends JFrame {

    private CadastroAluno cadastro;

    public InterfaceGrafica(){
        cadastro = new CadastroAluno();
        cadastro.carregardoArquivo();

        setTitle("Sistema de Cadastro de Aluno");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(6, 1, 10, 10));

        painel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        JButton btnAdicionar = new JButton("Adicionar Aluno");
        JButton btnConsultar = new JButton("Consultar Aluno");
        JButton btnAtualizar = new JButton("Atualizar Aluno");
        JButton btnRemover = new JButton("Remover Aluno");
        JButton btnSair = new JButton("Sair");

        painel.add(btnAdicionar);
        painel.add(btnConsultar);
        painel.add(btnAtualizar);
        painel.add(btnRemover);
        painel.add(btnSair);

        add(painel);

        btnAdicionar.addActionListener(e -> {
            new TelaAdicionarAluno(this, cadastro).setVisible(true);
        });
        btnConsultar.addActionListener(e -> {
            new TelaConsultarAluno(this, cadastro).setVisible(true);
        });
        btnAtualizar.addActionListener(e -> {
            new TelaAtualizarAluno(this, cadastro).setVisible(true);
        });
        btnRemover.addActionListener(e -> {
            new TelaRemoverAluno(this, cadastro).setVisible(true);
        });
        btnSair.addActionListener(e -> System.exit(0));


    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            InterfaceGrafica app = new InterfaceGrafica();
            app.setVisible(true);
        });
    }

}
