
// ARQUIVO SUBTURMA B
public class ListaEncadeadaB {
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
   
   
   //Método de somar todos os elementos
   public int somarTudo() {
    int soma = 0;          
    No atual = inicio;     

    while (atual != null) {   
        soma += atual.dado;   
        atual = atual.proximo; 
    }

    return soma; 
}

   // Método de verificar existencia
  public boolean verificarExistencia(int valor) {
    No atual = inicio; 

    while (atual != null) {  
        if (atual.dado == valor) { 
            return true;
        }
        atual = atual.proximo; 
    }

    return false;
  }
}