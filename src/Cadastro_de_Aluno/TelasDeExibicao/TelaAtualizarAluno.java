package Cadastro_de_Aluno.TelasDeExibicao;

import Cadastro_de_Aluno.AreaDeProcessamento.CadastroAluno;

import javax.swing.*;
import java.awt.*;

public class TelaAtualizarAluno extends JDialog {
    private final JTextField campoId = new JTextField();
    private final JTextField campoNome = new JTextField();
    private final JTextField campoIdade = new JTextField();
    private final JTextField campoCurso = new JTextField();
    private final CadastroAluno cadastro;

    public TelaAtualizarAluno(JFrame parent, CadastroAluno cadastro) {
        super(parent, "Atualizar Aluno", true);
        this.cadastro = cadastro;

        configurarJanela(parent);
        inicializarComponentes();
    }


    private void configurarJanela(JFrame parent) {
        setSize(400, 300);
        setLocationRelativeTo(parent);
        setLayout(new BorderLayout());
    }


    private void inicializarComponentes() {
        JLabel titulo = criarTitulo("Atualização de Cadastro");

        JPanel painel = new JPanel(new GridLayout(8, 1, 10, 10));

        painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        painel.add(new JLabel("ID do Aluno a Atualizar: "));
        painel.add(campoId);

        painel.add(new JLabel("Novo Nome: "));
        painel.add(campoNome);

        painel.add(new JLabel("Nova Idade do Aluno: "));
        painel.add(campoIdade);

        painel.add(new JLabel("O Curso do Aluno: "));
        painel.add(campoCurso);

        JButton btnAtualizar = new JButton("Atualizar");
        btnAtualizar.addActionListener(e -> atualizarAluno());
        painel.add(btnAtualizar);

        add(titulo, BorderLayout.NORTH);
        add(painel, BorderLayout.CENTER);
    }


    private JLabel criarTitulo(String texto) {
        JLabel titulo = new JLabel(texto, JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 14));
        titulo.setBorder(BorderFactory.createEmptyBorder(15,10,10,10));
        return titulo;
    }


    private void atualizarAluno(){
        String idAluno = campoId.getText().trim();
        String nome = campoNome.getText().trim();
        String idadeAluno = campoIdade.getText().trim();
        String curso = campoCurso.getText().trim();

        if (idAluno.isEmpty() || nome.isEmpty() || idadeAluno.isEmpty() || curso.isEmpty()){
            exibirMensagem("Todos os campos são obrigatórios.");
            return;
        }

        try {
            int id = Integer.parseInt(idAluno);
            int idade = Integer.parseInt(idadeAluno);


            if (idade < 0){
                exibirMensagem("A idade não pode ter valor negativo.");
                return;
            }

            cadastro.atualizarAluno(id, nome, idade, curso);
            exibirMensagem("Aluno atualizado com sucesso.");
            dispose();
        }catch (NumberFormatException ex){
            exibirMensagem("ID e idade devem ser valores válidos.");
        }
    }


    private void exibirMensagem(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem);
    }

}