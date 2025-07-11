package Cadastro_de_Aluno.AreaDeProcessamento;

public enum Metodos {
    ADICIONAR,
    CONSULTAR,
    ATUALIZAR,
    DELETAR,
    SAIR,
    INVALIDO;

    public static Metodos fromCodigo(int codigo){
         return switch (codigo) {
             case 1 -> ADICIONAR;


             case 2 -> CONSULTAR;


             case 3 -> ATUALIZAR;


             case 4 -> DELETAR;


             case 0 -> SAIR;


             default -> INVALIDO;

         };
    }
}
