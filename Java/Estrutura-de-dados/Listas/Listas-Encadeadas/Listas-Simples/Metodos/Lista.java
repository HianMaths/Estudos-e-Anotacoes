public class Lista{
   public No cabeca;
   
   // Adicioanar no começo
   public void adicionarComeco(String novoNome){
      // Cria um novo nó com o nome fornecido
      No novoNo = new No();
      novoNo.nome = novoNome;// <-- aqui você armazena o valor no nó
     
      if(cabeca == null){ // se alista estiver vazia
         cabeca = novoNo; // o novo nó passa a ser a cabeça
      }else{
         novoNo.proximo = cabeca; // o novo nó aponta para a antiga cabeça
         cabeca = novoNo; // e a cabeça passa a ser o novo nó
      }
   }
   
   // Remover do começo
   public void removerComeco(){
       if (cabeca != null) {
           cabeca = cabeca.proximo; // cabeça passa a ser o próximo nó
       }
   }

   // Inserir no final
   public void inserirNoFinal(String novoNome) {
       // Cria um novo nó com o nome fornecido
       No novo = new No();
       novo.nome = novoNome; // <-- Aqui você armazena o valor no nó
       novo.proximo = null;  // sempre será null porque será o último da lista
   
       if (cabeca == null) {   // se a lista estiver vazia
           cabeca = novo;      // o novo nó passa a ser a cabeça
       } else {
           No atual = cabeca; // começa pela cabeça da lista
           while (atual.proximo != null) {  // percorre até chegar em null(fim da lista)
               atual = atual.proximo; // avança para o próximo nó
           }
           atual.proximo = novo;    // último nó aponta para o novo
       }
   }

   // Remover do final
   public void removerFinal(){
       if (cabeca == null) { // lista vazia
           return;
       }
       if (cabeca.proximo == null) { // só tem 1 nó
           cabeca = null;
           return;
       }
   
       No atual = cabeca;
       while (atual.proximo.proximo != null) { // para no penúltimo nó
           atual = atual.proximo;
       }
       atual.proximo = null; // remove a ligação com o último
   }

   // Obter tamanho da lista
   public int tamanho(){
       int contador = 0;
       No atual = cabeca;
       while (atual != null) {
           contador++;
           atual = atual.proximo;
       }
       return contador;
   }
   
   
   // Limpar a lista
   public void limpar(){
       cabeca = null; // todos os nós são removidos automaticamente pelo garbage collector
   }
   
   
   // Inverter a lista
   public void inverter(){
       No anterior = null;
       No atual = cabeca;
       No proximo;
   
       while (atual != null) {
           proximo = atual.proximo;  // guarda o próximo nó
           atual.proximo = anterior; // inverte a referência
           anterior = atual;         // move o ponteiro anterior
           atual = proximo;          // avança para o próximo nó
       }
   
       cabeca = anterior; // atualiza a cabeça para o último nó
   }


      // Buscar por valor
      public boolean buscar(String nome){
          No atual = cabeca;
          while (atual != null) {
              if (atual.nome.equals(nome)) {
                  return true;
              }
              atual = atual.proximo;
          }
          return false;
      }
      
   // Remover por valor
   public void removerPorValor(String nome){
       if (cabeca == null) return;
   
       if (cabeca.nome.equals(nome)) { // está na cabeça
           cabeca = cabeca.proximo;
           return;
       }
   
       No atual = cabeca;
       while (atual.proximo != null && !atual.proximo.nome.equals(nome)) {
           atual = atual.proximo;
       }
   
       if (atual.proximo != null) { // encontrou
           atual.proximo = atual.proximo.proximo;
       }
   }
      
      // Inserir em uma posição específica
      public void inserirEmPosicao(String novoNome, int posicao) {
          // Se a posição for negativa, não faz sentido
          if (posicao < 0) {
              System.out.println("Posição inválida!");
              return;
          }
      
          // Criar o novo nó
          No novoNo = new No();
          novoNo.nome = novoNome;
      
          // Caso 1: inserir no começo
          if (posicao == 0) {
              novoNo.proximo = cabeca;
              cabeca = novoNo;
              return;
          }
      
          // Percorrer até a posição anterior
          No atual = cabeca;
          int contador = 0;
      
          while (atual != null && contador < posicao - 1) {
              atual = atual.proximo;
              contador++;
          }
      
          // Se atual for null, a posição não existe
          if (atual == null) {
              System.out.println("Posição fora do limite da lista!");
              return;
          }
      
          // Inserir no meio ou no final
          novoNo.proximo = atual.proximo;
          atual.proximo = novoNo;
      }


   // Imprimir lista com os nomes
   public void imprimirLista(){
      if(cabeca == null){ // se a lista estiver vazia
         System.out.println("Lista Vazia"); // exibe a mensagem "Lista Vazia"
      }else{
         No atual = cabeca; // começa pela cabeça da lista
         while(atual != null){ // percorre até chegar em null(fim da lista)
            System.out.println(atual.nome); // imprime o dado do nó atual
            atual = atual.proximo; // avança para o próximo nó
         }
      }
   }
}