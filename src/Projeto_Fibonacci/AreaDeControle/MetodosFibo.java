package Projeto_Fibonacci.AreaDeControle;

public enum MetodosFibo {
    RECURSIVO_SIMPLES,
    MEMOIZACAO,
    INTERATIVA,
    COMPARAR_TODAS,
    SAIR;

    public static  MetodosFibo fromCodigo(int codigo){
        switch (codigo){
            case 1:
                return RECURSIVO_SIMPLES;

            case 2:
                return MEMOIZACAO;

            case 3:
                return INTERATIVA;

            case 4:
                return COMPARAR_TODAS;

            case 0:
                return SAIR;

            default:
                return null;

        }
    }
}
