package Cadastro_de_Aluno;

import javax.swing.*;
import java.awt.*;

public class TelaRemoverAluno extends JDialog {
    private final JTextField campoId = new JTextField();
    private final CadastroAluno cadastro;

    public TelaRemoverAluno(JFrame parent, CadastroAluno cadastro) {
        super(parent, "Remover Aluno", true);
        this.cadastro = cadastro;

        configurarJanela(parent);
        inializarComponentes();
    }


    private void configurarJanela(JFrame parent) {
        setSize(300, 200);
        setLocationRelativeTo(parent);
        setLayout(new BorderLayout());

    }


    private void inializarComponentes() {

        JLabel tituloremover = new JLabel("Exclusão de Cadastro de Aluno", JLabel.CENTER);
        tituloremover.setFont(new Font("Arial", Font.BOLD, 13));
        tituloremover.setBorder(BorderFactory.createEmptyBorder(15, 10, 5, 10));

        JPanel painel = new JPanel(new GridLayout(3, 1, 10, 10));

        painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        painel.add(new JLabel("Digite o ID a qual será Removido:"));
        painel.add(campoId);


        JButton btnRemover = new JButton("Remover");
        btnRemover.addActionListener(e -> removerAluno());
        painel.add(btnRemover);


        add(tituloremover, BorderLayout.NORTH);
        add(painel, BorderLayout.CENTER);
    }


    private void removerAluno(){
        try{
            int id = Integer.parseInt(campoId.getText().trim());
            cadastro.deleteAluno(id);
            JOptionPane.showMessageDialog(this, "Se o aluno existia, ele foi removido.");
            dispose();
        }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(this,"Digite um número de ID válido.");
        }
    }
}
