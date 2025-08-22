public class Principal{

   public static void main(String[] args) {
   
      ListaEncadeadaA lista = new ListaEncadeadaA();
      
      lista.adicionarNoInicio(10);
      lista.adicionarNoInicio(20);
      lista.adicionarNoInicio(30);
      lista.imprimirLista(); // Deve imprimir: Lista: [30 -> 20 -> 10 -> NULL]
      System.out.println("--- Testando a Atividade ---");
      // Testando o Objetivo 1
      System.out.println("Tamanho da lista: " + lista.tamanho()); // Deve imprimir 3
      // Testando o Objetivo 2
      lista.adicionarNoFinal(5);
      lista.imprimirLista(); // Deve imprimir: Lista:  30  20  10  5  NULL 
      System.out.println("Novo tamanho da lista: " + lista.tamanho()); // Deve imprimir 4
      // Teste extra para o addLast
      ListaEncadeadaA listaVazia = new ListaEncadeadaA();
      listaVazia.adicionarNoFinal(100);
      System.out.print("Testando addLast em lista vazia: ");
      listaVazia.imprimirLista(); // Deve imprimir: Lista:  100  NULL 
}


}