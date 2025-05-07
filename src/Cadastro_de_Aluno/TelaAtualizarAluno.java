package Cadastro_de_Aluno;

import javax.swing.*;
import java.awt.*;

public class TelaAtualizarAluno extends JDialog {
    public TelaAtualizarAluno(JFrame parent, CadastroAluno cadastro){
        super(parent, "Atualizar Aluno", true);
        setSize(400,300);
        setLocationRelativeTo(parent);

        JPanel panel = new JPanel(new GridLayout(6,1,10,10));

        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel tituloatualizar = new JLabel("Atualização de Cadastro", JLabel.CENTER);
        tituloatualizar.setFont(new Font("Arial", Font.BOLD, 15));
        tituloatualizar.setBorder(BorderFactory.createEmptyBorder(15,10,10,10));

        JTextField campoId = new JTextField();
        JTextField campoNome = new JTextField();
        JTextField campoIdade = new JTextField();
        JTextField campoCurso = new JTextField();

        panel.add(new JLabel("ID do Aluno a Atualizar: "));
        panel.add(campoId);

        panel.add(new JLabel("Novo Nome: "));
        panel.add(campoNome);

        panel.add(new JLabel("Nova Idade do Aluno: "));
        panel.add(campoIdade);

        panel.add(new JLabel("O Curso do Aluno: "));
        panel.add(campoCurso);

        JButton btnAtualizar = new JButton("Atualizar");
        panel.add(btnAtualizar);

        add(panel);

        btnAtualizar.addActionListener(e -> {
            try{
                int id = Integer.parseInt(campoId.getText().trim());
                String nome = campoNome.getText().trim();
                int idade = Integer.parseInt(campoIdade.getText().trim());
                String curso = campoCurso.getText().trim();

                if (nome.isEmpty() || curso.isEmpty()){
                    JOptionPane.showMessageDialog(this, "O Nome e o Curso não podem ficar em branco.");
                    return;
                }

                if (idade < 0){
                    JOptionPane.showMessageDialog(this,"A Idade não pode ter valor negativo.");
                    return;
                }

                cadastro.atualizarAluno(id, nome, idade, curso);
                JOptionPane.showMessageDialog(this,"Aluno atualizado com sucesso!!");
                dispose();
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "ID e Idade precisam ser números válidos.");
            }
        });

        setLayout(new BorderLayout());
        add(tituloatualizar, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
    }
}
