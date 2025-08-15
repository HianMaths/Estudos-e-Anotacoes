public class Matriz{
   //Imprimir matriz
   //Procurar ocorrencia
   //Multiplicar matrizes
   
   // i = linhas existentes em uma matriz
   // j = colunas exxistentes em uma matriz
   
   public static void imprimirMatriz(int[][] matriz){
      for(int i = 0; i < matriz.length; i++){
         for(int j = 0; j < matriz.length; j++){
            System.out.println(matriz[i][j] + " ");
         }
      }
   }
   
   
   
   public static boolean procurarOcorrencia(int[][] matriz, int valor){
      for(int i = 0; i < matriz.length; i++){
         for(int j = 0; j < matriz.length; j++){
             if(matriz[i][j] == valor){
               return true;
             }
         }
      }
       return false;
   }
   
   
   
   public static void main(String[] args){
      int[][] matriz1 = {{2,4},{3,2}};
      int[][] matriz2 = {{2,4},{3,2}};
      int[][] matriz3 = {{2,4,6},{1,3,2}};
      
      
      //imprimirMatriz(matriz1);
      
      System.out.println("Deve imprimir true para 3:" + procurarOcorrencia(matriz1, 3));
      System.out.println("Deve imprimir true para 2:" + procurarOcorrencia(matriz2, 2));
      System.out.println("Deve imprimir false para 9:" + procurarOcorrencia(matriz3, 9));
   }
}