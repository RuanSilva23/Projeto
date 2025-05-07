package Cadastro_de_Aluno;

import javax.swing.*;
import java.awt.*;

public class TelaAdicionarAluno extends JDialog {
    private final JTextField campoNome = new JTextField();
    private final JTextField campoIdade = new JTextField();
    private final JTextField campoCurso = new JTextField();
    private final CadastroAluno cadastro;

    public TelaAdicionarAluno(JFrame parent, CadastroAluno cadastro){
        super(parent, "Adicionar Aluno", true);
        this.cadastro = cadastro;

        configurarJanela(parent);
        inicializarComponentes();
    }

    //Configuração da estrutura Central da Tela
    private void configurarJanela(JFrame parent) {
        setSize(350, 300);
        setLocationRelativeTo(parent);
        setLayout(new BorderLayout());
    }

    
    private void inicializarComponentes() {
        JLabel titulo = criarTitulo("Cadastro de Novo Aluno");

        JPanel painel = new JPanel(new GridLayout(7, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        painel.add(new JLabel("Nome do Aluno:"));
        painel.add(campoNome);

        painel.add(new JLabel("Idade do Aluno:"));
        painel.add(campoIdade);

        painel.add(new JLabel("Curso do Aluno:"));
        painel.add(campoCurso);


        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(e -> salvarAluno());
        painel.add(btnSalvar);

        add(titulo, BorderLayout.NORTH);
        add(painel, BorderLayout.CENTER);
    }

    //Título
    private JLabel criarTitulo(String texto){
        JLabel titulo = new JLabel(texto, JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 14));
        titulo.setBorder(BorderFactory.createEmptyBorder(15,10,10,10));
        return titulo;
    }

    //Salvação em arquivo
    private void salvarAluno(){
        String nome = campoNome.getText().trim();
        String idadeAluno = campoIdade.getText().trim();
        String curso = campoCurso.getText().trim();

        if (nome.isEmpty() || idadeAluno.isEmpty() || curso.isEmpty()){
            exibirMensagem("Todos os campos são obrigatórios");
            return;
        }


        try {
            int idade = Integer.parseInt(idadeAluno);

            if (idade < 0){
                exibirMensagem("Idade não pode ter valor negativo.");
                return;
            }


            cadastro.adicionarAluno(nome, idade, curso);
            exibirMensagem("Aluno cadastrado com sucesso.");
            dispose();
        }catch (NumberFormatException ex){
            exibirMensagem("Idade inválida. Digite um número válido.");
        }
    }


    private void exibirMensagem(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem);
    }

}
