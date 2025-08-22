public class Principal {
   public static void main(String[] args) {
      ListaEncadeadaB lista = new ListaEncadeadaB();
         lista.adicionarNoInicio(10);
         lista.adicionarNoInicio(20);
         lista.adicionarNoInicio(30);
         lista.adicionarNoInicio(40);
         lista.imprimirLista(); // Deve imprimir: Lista: [ 40 -> 30 -> 20 -> 10 -> NULL]
         System.out.println(" Testando a Atividade ---");
         // Testando o Objetivo 1
         System.out.println("Somatório da lista: " + lista.somarTudo());
         // Deve imprimir: 100
         // Testando o Objetivo 2
         System.out.println("Existe o número 30? " + lista.verificarExistencia(30));
         // Deve imprimir: true
         System.out.println("Existe o número 99? " + lista.verificarExistencia(99));
         // Deve imprimir: false
         // Teste extra em lista vazia
         ListaEncadeadaB listaVazia = new ListaEncadeadaB();
         System.out.println("Somatório da lista vazia: " + listaVazia.somarTudo());
         // Deve imprimir: 0
         System.out.println("Existe o número 1 na lista vazia? " + listaVazia.verificarExistencia(1));
         // Deve imprimir: false
      }
   }