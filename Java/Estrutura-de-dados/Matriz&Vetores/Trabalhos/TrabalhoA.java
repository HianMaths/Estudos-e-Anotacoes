public class TrabalhoA {
    // Encontrar maior valor e posição
    public static int[] encontrarMaiorValor(int[][] matriz) {
        int maior = Integer.MIN_VALUE;
        int idx = -1, idy = -1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    idx = i;
                    idy = j;
                }
            }
        }

        // retorna {valor, linha, coluna}
        return new int[]{maior, idx, idy};
    }

    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhas = matriz1.length;
        int colunas = matriz1[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    public static int[][] transporMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        return transposta;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz1 = { { 2, 4 }, { 3, 2 } };
        int[][] matriz2 = { { 2, 5 }, { 7, 2 } };

        int[] resultado = encontrarMaiorValor(matriz1);
        System.out.println("Maior valor da matriz1: " + resultado[0] + 
                           " encontrado na posição [" + resultado[1] + "][" + resultado[2] + "]");

        System.out.println("Soma das matrizes:");
        imprimirMatriz(somarMatrizes(matriz1, matriz2));

        System.out.println("Transposta da matriz 1:");
        imprimirMatriz(transporMatriz(matriz1));
    }
}
