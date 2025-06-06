package Cadastro_de_Aluno.AreaDeProcessamento;

public class Mensagem {
    public static void alunoNaopodeVazio(){
        System.out.println(" Erro.....");
        System.out.println("O nome do aluno não pode ser vazio.");
        System.out.println();
    }

    public static void idadeNaoNegativa(){
        System.out.println("Erro!!!");
        System.out.println("Idade não pode ser negativa.");
    }
}
