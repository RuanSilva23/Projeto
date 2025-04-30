package GerenciamentoTarefas;

public enum NomeMetodos {
    ADICIONAR,
    LISTAR,
    CONCLUIR,
    REMOVER,
    EDITAR,
    SAIR;

    public static NomeMetodos fromCodigo(int codigo){
        switch (codigo){
            case 1:{
                return ADICIONAR;
            }
            case 2:{
                return LISTAR;
            }
            case 3:{
                return CONCLUIR;
            }
            case 4:{
                return REMOVER;
            }
            case 5:{
                return EDITAR;
            }
            case 0:{
                return SAIR;
            }
            default:
                return null;
        }

    }
}
