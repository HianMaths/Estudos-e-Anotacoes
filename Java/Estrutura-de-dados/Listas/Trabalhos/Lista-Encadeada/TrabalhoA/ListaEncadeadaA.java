// ARQUIVO SUBTURMA A
public class ListaEncadeadaA {
   No inicio;// O ponto de partida da nossa lista. Equivalente ao "head".

   // Método já ensinado
   public void adicionarNoInicio(int dado) {
      No novoNo = new No(dado);
      novoNo.proximo = inicio;
      inicio = novoNo;
   }

   // Método já ensinado
   public void imprimirLista() {
      System.out.print("Lista: [ ");
      No atual = this.inicio; // Começamos a percorrer pelo início.
      while (atual != null) {
         System.out.print(atual.dado + " -> ");
         atual = atual.proximo; // Pulamos para o próximo nó.
      }
      System.out.println("NULL]");
   }

   // Método de contar o tamanho da lista
   public int tamanho() {
      int contador = 0;
      No atual = inicio;
      while (atual != null) {
         contador++;
         atual = atual.proximo;
      }
      return contador;
   }

   // Método de adicionar no final
   public void adicionarNoFinal(int dado) {
      No novoNo = new No(dado);

      if (inicio == null) {
         inicio = novoNo;
         System.out.println("Lista Vazia");
      } else {
         No ultimo = this.inicio;
         while (ultimo.proximo != null) {
            ultimo = ultimo.proximo;
         }
         ultimo.proximo = novoNo;
      }

   }

}