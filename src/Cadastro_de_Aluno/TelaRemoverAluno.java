package Cadastro_de_Aluno;

import javax.swing.*;
import java.awt.*;

public class TelaRemoverAluno extends JDialog {
    public TelaRemoverAluno(JFrame parent, CadastroAluno cadastro){
        super(parent, "Remover Aluno", true);
        setSize(300,150);
        setLocationRelativeTo(parent);

        JPanel panel = new JPanel(new GridLayout(3,1,10,10));

        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTextField campoId = new JTextField();

        panel.add(new JLabel("Digite o ID a qual será Removido: "));
        panel.add(campoId);


        JButton btnRemover = new JButton("Remover");
        panel.add(btnRemover);

        add(panel);

        btnRemover.addActionListener(e -> {
            try{
                int id = Integer.parseInt(campoId.getText().trim());
                cadastro.deleteAluno(id);
                JOptionPane.showMessageDialog(this, "Se o aluno existia, ele foi removido.");
                dispose();
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(this,"Digite um número de ID válido.");
            }
        });


    }
}
