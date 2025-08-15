public class MatrizExCorrigido { // Declaração da classe principal

    public static int[][] matriz1 = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 },
    };

    /*************** Métodos já implementados como exemplo ***************/
    // Método para buscar um número na matriz e imprimir sua posição
    public static void buscaNumero(int[][] matriz, int num) {
        for (int i = 0; i < matriz.length; i++) { // Percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // Percorre as colunas
                if (num == matriz[i][j]) { // Verifica se o elemento é igual ao número buscado
                    System.out.println("Achou na posição [" + i + "][" + j + "]!"); // Imprime a posição
                }
            }
        }
    }

    // Método para imprimir os elementos da diagonal principal da matriz
    public static void imprimirDiagonalPrincipal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { // Percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // Percorre as colunas
                if (i == j) { // Verifica se está na diagonal principal
                    System.out.print(matriz[i][j] + " "); // Imprime o elemento da diagonal
                }
            }
        }
        System.out.println(); // Quebra de linha após imprimir a diagonal
    }

    /*********************************************************************/

    // Exercicio 1: Impressão de Matriz
    // Método para imprimir todos os elementos da matriz em formato tabulado
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { // Percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // Percorre as colunas
                System.out.print(matriz[i][j] + "\t"); // Imprime o elemento seguido de tabulação
            }
            System.out.println(); // Quebra de linha ao final de cada linha da matriz
        }
    }

    // Exercicio 2: Soma de Elementos
    // Método para somar todos os elementos da matriz
    public static int somarMatriz(int[][] matriz) {
        int soma = 0; // Inicializa a variável soma
        for (int i = 0; i < matriz.length; i++) { // Percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // Percorre as colunas
                soma += matriz[i][j]; // Adiciona o elemento à soma
            }
        }
        return soma; // Retorna o valor total da soma
    }

    // Exercicio 3: Maior Valor
    // Método para encontrar o maior valor presente na matriz
    public static int encontrarMaiorValor(int[][] matriz) {
        int maior = matriz[0][0]; // Inicializa com o primeiro elemento da matriz
        for (int i = 0; i < matriz.length; i++) { // Percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // Percorre as colunas
                if (matriz[i][j] > maior) { // Se encontrar um valor maior
                    maior = matriz[i][j]; // Atualiza o maior valor
                }
            }
        }
        return maior; // Retorna o maior valor encontrado
    }

    // Exercicio 4: Transposição de Matriz
    // Método para transpor a matriz (troca linhas por colunas)
    public static int[][] transporMatriz(int[][] matriz) {
        int linhas = matriz.length; // Número de linhas da matriz original
        int colunas = matriz[0].length; // Número de colunas da matriz original
        int[][] transposta = new int[colunas][linhas]; // Cria matriz transposta

        for (int i = 0; i < linhas; i++) { // Percorre as linhas
            for (int j = 0; j < colunas; j++) { // Percorre as colunas
                transposta[j][i] = matriz[i][j]; // Troca linha por coluna
            }
        }
        return transposta; // Retorna a matriz transposta
    }

    // Exercicio 5: Multiplicação de Matrizes
    // Método para multiplicar duas matrizes e retornar o resultado
    public static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhas1 = matriz1.length; // Número de linhas da primeira matriz
        int colunas1 = matriz1[0].length; // Número de colunas da primeira matriz
        int colunas2 = matriz2[0].length; // Número de colunas da segunda matriz

        int[][] resultado = new int[linhas1][colunas2]; // Cria matriz para o resultado

        for (int i = 0; i < linhas1; i++) { // Percorre as linhas da primeira matriz
            for (int j = 0; j < colunas2; j++) { // Percorre as colunas da segunda matriz
                for (int k = 0; k < colunas1; k++) { // Percorre as colunas da primeira matriz (ou linhas da segunda)
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j]; // Multiplica e acumula o resultado
                }
            }
        }
        return resultado; // Retorna a matriz resultado da multiplicação
    }

    public static void main(String[] args) {
        buscaNumero(matriz1, 8);
        imprimirDiagonalPrincipal(matriz1);

        // Teste dos exercícios
        imprimirMatriz(matriz1); 
        System.out.println(somarMatriz(matriz1)); 
        System.out.println(encontrarMaiorValor(matriz1)); 
        imprimirMatriz(transporMatriz(matriz1)); 
        imprimirMatriz(multiplicarMatrizes(matriz1, matriz1)); 
    }
}
