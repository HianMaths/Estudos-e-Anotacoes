**`Java -> Estrutura de Dados`**

## 📌 O que é uma lista simplesmente encadeada?

Uma **lista simplesmente encadeada** é uma estrutura de dados **dinâmica**, formada por **nós (nodes)**.
Cada nó contém:

1. Um **valor/dado**.
2. Uma **referência (ponteiro)** para o **próximo nó** da lista.

➡️ Diferente de um array, onde os elementos ficam em posições fixas de memória, na lista encadeada cada nó pode estar em qualquer lugar da memória, e a ligação é feita pelos ponteiros.

---

## 📌 Estrutura de um nó

Em Java, um nó pode ser representado assim:

```java
public class No{
   String nome; //dado armazenado
   No proximo; //referência para o próximo nó
}
```

---

## 📌 Estrutura da lista

A lista simplesmente encadeada precisa ter uma referência para o **primeiro nó** (chamado de **cabeça ou head**).

```java
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
```

---

## 📌 Exemplo de uso

```java
public class Principal{
   public static void main(String[] args){
      String nome = "Flávio";
      //tipo variavel = valor;
      Lista alunos = new Lista();
      
     // métodos presentes na lista 
     alunos.imprimirLista();
     alunos.adicionarComeco(nome);
     alunos.adicionarComeco("Pedro");
     alunos.adicionarComeco("Maria");
     
     alunos.imprimirLista();
     
   }
}
```

👉 Saída:

```
Maria -> Pedro -> Flávio -> null
```

---

## 📌 Ilustração (em texto)

Depois das inserções, a lista fica assim:

```
[Maria] -> [Pedro] -> [Flávio] -> null
```

* Cada bloco é um **nó**.
* A seta representa o **ponteiro** `proximo`.
* O `null` indica o fim da lista.

---

## 📌 Características da lista simplesmente encadeada:

✔️ Inserções e remoções no início são rápidas (**O(1)**).
✔️ Tamanho flexível (não precisa definir antes como em arrays).
❌ Acesso direto a um elemento é lento (**O(n)**), pois precisa percorrer a lista.
❌ Não é possível voltar (sem ser lista duplamente encadeada).

