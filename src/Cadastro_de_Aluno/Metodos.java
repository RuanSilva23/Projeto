package Cadastro_de_Aluno;

public enum Metodos {
    ADICIONAR,
    CONSULTAR,
    ATUALIZAR,
    DELETAR,
    SAIR,
    INVALIDO;

    public static Metodos fromCodigo(int codigo){
         switch (codigo){
            case 1:{
                return ADICIONAR;
            }
            case 2:{
                return CONSULTAR;
            }
            case 3:{
                return ATUALIZAR;
            }
            case 4:{
                return DELETAR;
            }
            case 5:{
                return SAIR;
            }
            default:{
                return INVALIDO;
            }
        }
    }
}
