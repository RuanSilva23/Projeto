package Cadastro_de_Aluno;

import javax.swing.*;
import java.awt.*;

public class TelaAdicionarAluno extends JDialog {
    public TelaAdicionarAluno(JFrame parent, CadastroAluno cadastro){
        super(parent, "Adicionar Aluno", true);
        setSize(300,250);
        setLocationRelativeTo(parent);


        JPanel panel = new JPanel(new GridLayout(5,1,10,10));

        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        JLabel tituload = new JLabel("Cadastro de Novo Aluno", JLabel.CENTER);
        tituload.setFont(new Font("Arial", Font.BOLD, 15));
        tituload.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));

        JTextField campoNome = new JTextField();
        JTextField campoIdade = new JTextField();
        JTextField campoCurso = new JTextField();


        panel.add(new JLabel("Nome do Aluno: "));
        panel.add(campoNome);

        panel.add(new JLabel("Idade do Aluno: "));
        panel.add(campoIdade);

        panel.add(new JLabel("Curso do Aluno: "));
        panel.add(campoCurso);

        JButton btnSalvar = new JButton("Salvar");
        panel.add(btnSalvar);

        btnSalvar.addActionListener(e -> {
            String nome = campoNome.getText().trim();
            String idadeDoAluno = campoIdade.getText().trim();
            String cursoDoAluno = campoCurso.getText().trim();

            if (nome.isEmpty() || idadeDoAluno.isEmpty() || cursoDoAluno.isEmpty()){
                JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios.");
                return;
            }

            try {
                int idade = Integer.parseInt(idadeDoAluno);
                if (idade < 0){
                    JOptionPane.showMessageDialog(this,"Idade não pode ter valores negativa!!!");
                    return;
                }

                cadastro.adicionarAluno(nome, idade, cursoDoAluno);
                JOptionPane.showMessageDialog(this,"Aluno cadastrado com sucesso!!");
                dispose();
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Idade inválida. Digite um número.");
            }

        });

        setLayout(new BorderLayout());
        add(tituload, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);


        add(panel);
    }
}
