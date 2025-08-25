**`Java -> Estrutura de Dados`**

# 📌 Principais métodos em uma lista simplesmente encadeada

### 1. Inserir no final

Adiciona um novo nó **no final da lista**.

* Se a lista estiver vazia, o novo nó vira a **cabeça**.
* Caso contrário, percorremos a lista até o último nó e fazemos ele apontar para o novo nó.
* Complexidade: **O(n)**, pois é preciso percorrer todos os nós.

```java
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

```
**`Como utilizar o método:`**
```
alunos.inserirNoFinal("Antonio");
```

---

###  2. Remover do começo

Remove o **primeiro nó** (cabeça).

* Basta mover a **cabeça** para apontar para o próximo nó.
* Complexidade: **O(1)**.

```java
public void removerComeco(){
       if (cabeca != null) {
           cabeca = cabeca.proximo; // cabeça passa a ser o próximo nó
       }
   }
```
**`Como utilizar o método:`**
```
alunos.removerComeco();
```
---

### 3. Remover do final

Remove o **último nó**.

* É necessário percorrer até o penúltimo nó e fazer ele apontar para `null`.
* Complexidade: **O(n)**.

```java
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
```
**`Como utilizar o método:`**
```
alunos.removerFinal();
```
---
### 4. Remover por valor

Procura um nó que tenha o valor desejado e o remove da lista.

* Se o valor estiver no primeiro nó, é igual a removerDoComeco().

* Caso contrário, é preciso percorrer até encontrar e ajustar os ponteiros.

```java
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
```
**`Como utilizar o método:`**
```
lista.removerPorValor("Bruno");
```
---

### 5. Buscar (pesquisar um valor)

Percorre a lista para verificar se um valor existe.

* Pode retornar `true/false` ou o **índice** onde o valor foi encontrado.
* Complexidade: **O(n)**.

```java
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
```
**`Como utilizar o método:`**
```
     String nomeProcurado = "Lucas";
        if (alunos.buscar(nomeProcurado)) {
            System.out.println(nomeProcurado + " foi encontrado na lista!");
        } else {
            System.out.println(nomeProcurado + " não está na lista.");
        }
```
---

### 6. Tamanho da lista

Conta quantos nós existem na lista.

* Pode ser feito percorrendo todos os nós.
* Também é possível manter um contador que atualiza a cada inserção/remoção.

```java
 public int tamanho(){
       int contador = 0;
       No atual = cabeca;
       while (atual != null) {
           contador++;
           atual = atual.proximo;
       }
       return contador;
   }
```
**`Como utilizar o método:`**
```
System.out.println("O tamanho da lista e: " + alunos.tamanho());
```
---

### 7. Verificar se a lista está vazia

Checar se a referência da **cabeça** é `null`.

* Muito útil para evitar erros em remoções ou buscas.

```java
```

---

### 8. Inverter a lista

Transformar a lista de forma que o último nó vire o primeiro, e assim por diante.

Exemplo:

```
1 -> 2 -> 3 -> null
```

vira

```
3 -> 2 -> 1 -> null
```

```java
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
```
**`Como utilizar o método:`**
```
alunos.inverter();
```
---

### 9. Limpar a lista

Remover todos os nós de uma vez, simplesmente definindo `cabeça = null`.

```java
 public void limpar(){
       cabeca = null; // todos os nós são removidos automaticamente pelo garbage collector
   }
```
**`Como utilizar o método:`**
```
alunos.limpar();
```
---

### 10. Inserir em uma posição específica
Permite adicionar um novo nó em qualquer índice da lista (meio, por exemplo). 
* Se a posição for 0, é como inserir no começo. 
* Se a posição for igual ao tamanho da lista, é como inserir no final.
```java
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
```
**`Como utilizar o método:`**
```
alunos.InserirEmPosicao("Daniel",4);
```
---

# 📌 Resumindo

👉 Os métodos comuns em **lista simplesmente encadeada** são:

* **Inserção:** no começo, no final, em posição específica.
* **Remoção:** do começo, do final, por valor, em posição específica.
* **Busca:** por valor, por posição.
* **Utilitários:** obter tamanho, verificar se está vazia, inverter, limpar.

---
