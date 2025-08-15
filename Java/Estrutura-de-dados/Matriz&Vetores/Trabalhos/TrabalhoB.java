public class TrabalhoB {
   // Imprimir diagonal principal
   // Soma de linhas
   // Matriz identidade

   public static void imprimirDiagonalPrincipal(int[][] matriz) {
      for (int i = 0; i < matriz.length; i++) {
         System.out.print(matriz[i][i]);
      }
   };

   public static void soma(int[][] matriz) {
      int soma = 0;
      for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[i].length; j++) {
            soma += matriz[i][j];
            System.out.print(soma + " ");
         }
      }
   };

   public static boolean identidadeMatriz(int[][] matriz) {
      for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[i].length; j++) {
            if (i == j && matriz[i][j] != 1) {
               return false;
            }
            ;
            if (i != j && matriz[i][j] != 0) {
               return false;
            }
            ;

         }
      }

      return true;
   }

   public static void main(String[] args) {
      int[][] matriz1 = { { 2, 4 }, { 3, 2 } };
      int[][] matriz2 = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

      imprimirDiagonalPrincipal(matriz2);
      soma(matriz1);
      System.out.println(identidadeMatriz(matriz2));

   }
}