package Projeto_Fibonacci;

public enum MetodosFibo {
    RECURSIVO_SIMPLES,
    MEMOIZACAO,
    INTERATIVA,
    SAIR;

    public static  MetodosFibo fromCodigo(int codigo){
        switch (codigo){
            case 1:
                return RECURSIVO_SIMPLES;

            case 2:
                return MEMOIZACAO;

            case 3:
                return INTERATIVA;

            case 0:
                return SAIR;

            default:
                return null;

        }
    }
}
