package Cadastro_de_Aluno;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class TelaConsultarAluno extends JDialog {
    public TelaConsultarAluno(JFrame parent, CadastroAluno cadastro){
        super(parent, "Lista de Alunos", true);
        setSize(500,300);
        setLocationRelativeTo(parent);

        List<Aluno> alunos = cadastro.getAlunos();



        String[] colunas = {"ID", "Nome", "Idade", "Curso"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (Aluno a : alunos){
            Object[] linha = {
                    a.getId(),
                    a.getAluno(),
                    a.getIdade(),
                    a.getCurso()
            };
            modelo.addRow(linha);
        }

        JTable tabela = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabela);
        add(scroll, BorderLayout.CENTER);



    }
}
