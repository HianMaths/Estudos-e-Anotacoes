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