public class SomaDiagonalMatriz {

    public static void main(String[] args) {
        // Criação de uma matriz 3x3 de inteiros
        int[][] matriz = new int[3][3];
        // Inicialização dos elementos da matriz
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        // Variável para armazenar a soma dos elementos da diagonal principal
        int somaDiagonal = 0;
        // Percorre a matriz somando os elementos da diagonal principal (onde linha == coluna)
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonal += matriz[i][i];
        }

        // Exibe o resultado da soma da diagonal principal
        System.out.println("Soma dos elementos na diagonal principal: " + somaDiagonal);
    }
}