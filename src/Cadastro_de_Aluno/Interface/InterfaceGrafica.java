package Cadastro_de_Aluno.Interface;

import Cadastro_de_Aluno.AreaDeProcessamento.CadastroAluno;
import Cadastro_de_Aluno.TelasDeExibicao.TelaAdicionarAluno;
import Cadastro_de_Aluno.TelasDeExibicao.TelaAtualizarAluno;
import Cadastro_de_Aluno.TelasDeExibicao.TelaConsultarAluno;
import Cadastro_de_Aluno.TelasDeExibicao.TelaRemoverAluno;

import javax.swing.*;
import java.awt.*;

public class InterfaceGrafica extends JFrame {

    private CadastroAluno cadastro;

    public InterfaceGrafica(){
        cadastro = new CadastroAluno();
        cadastro.carregardoArquivo();

        setTitle("Sistema de Cadastro de Aluno");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel titulo = new JLabel("Cadastro de Alunos", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));


        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(6, 1, 10, 10));

        painel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        JButton btnAdicionar = new JButton("Adicionar Aluno");
        JButton btnConsultar = new JButton("Consultar Aluno");
        JButton btnAtualizar = new JButton("Atualizar Aluno");
        JButton btnRemover = new JButton("Remover Aluno");
        JButton btnSair = new JButton("Sair");

        btnAdicionar.setToolTipText("Cadastrar um novo aluno");
        btnConsultar.setToolTipText("Visualizar todos os alunos");
        btnAtualizar.setToolTipText("Alterar dados do aluno");
        btnRemover.setToolTipText("Remover dados do aluno");
        btnSair.setToolTipText("Fechar o sistema");


        JButton[] botoes = {btnAdicionar, btnConsultar, btnAtualizar, btnRemover, btnSair};
        for (JButton btn : botoes){
            btn.setFont(new Font("Arial", Font.PLAIN, 16));
            btn.setBackground(new Color(200,220,255));
            painel.add(btn);
        }


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

        setLayout(new BorderLayout());
        add(titulo, BorderLayout.NORTH);
        add(painel, BorderLayout.CENTER);


    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            InterfaceGrafica app = new InterfaceGrafica();
            app.setVisible(true);
        });
    }

}
