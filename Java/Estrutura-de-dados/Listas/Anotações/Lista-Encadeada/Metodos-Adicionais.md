**`Java -> Estrutura de Dados`**


# 📌 Métodos adicionais em uma lista simplesmente encadeada

---

### 11. Inserir no começo

Adiciona um novo nó **no início da lista**.

* Muito eficiente (O(1)), pois não precisa percorrer a lista.
* O novo nó passa a ser a **cabeça**.

```java
public void inserirNoComeco(String novoNome) {
    No novo = new No();
    novo.nome = novoNome;
    novo.proximo = cabeca; // o antigo primeiro vira o segundo
    cabeca = novo;         // agora o novo é a cabeça
}
```

**`Como utilizar o método:`**

```
alunos.inserirNoComeco("Maria");
```

---

### 12. Remover em uma posição específica

Remove um nó de acordo com o **índice** (posição).

* Se a posição for 0, é igual a remover do começo.
* Caso contrário, percorremos até o nó anterior e ajustamos os ponteiros.
* Complexidade: **O(n)**.

```java
public void removerEmPosicao(int posicao) {
    if (cabeca == null || posicao < 0) return;

    if (posicao == 0) {
        cabeca = cabeca.proximo;
        return;
    }

    No atual = cabeca;
    for (int i = 0; atual != null && i < posicao - 1; i++) {
        atual = atual.proximo;
    }

    if (atual == null || atual.proximo == null) return;

    atual.proximo = atual.proximo.proximo;
}
```

**`Como utilizar o método:`**

```
alunos.removerEmPosicao(2);
```

---

### 13. Obter elemento em uma posição

Retorna o valor armazenado em um índice específico.

* Se o índice for inválido, retorna `null`.
* Complexidade: **O(n)**, pois precisa percorrer a lista até a posição.

```java
public String obter(int posicao) {
    No atual = cabeca;
    int contador = 0;

    while (atual != null) {
        if (contador == posicao) {
            return atual.nome;
        }
        contador++;
        atual = atual.proximo;
    }
    return null; // posição não encontrada
}
```

**`Como utilizar o método:`**

```
System.out.println("Elemento na posição 3: " + alunos.obter(3));
```

---

### 14. Clonar a lista

Cria uma **cópia independente** da lista atual.

* Cada nó da lista original é copiado para a nova lista.
* Complexidade: **O(n)**.

```java
public ListaEncadeada clonar() {
    ListaEncadeada nova = new ListaEncadeada();
    No atual = cabeca;
    while (atual != null) {
        nova.inserirNoFinal(atual.nome); // reaproveita método já existente
        atual = atual.proximo;
    }
    return nova;
}
```

**`Como utilizar o método:`**

```
ListaEncadeada copia = alunos.clonar();
```

---

### 15. Concatenar duas listas

Junta os elementos de outra lista no **final da lista atual**.

* Se a lista atual estiver vazia, a cabeça passa a ser a da outra lista.
* Caso contrário, percorremos até o final e ligamos ao início da outra.
* Complexidade: **O(n)**.

```java
public void concatenar(ListaEncadeada outra) {
    if (cabeca == null) {
        cabeca = outra.cabeca;
        return;
    }
    No atual = cabeca;
    while (atual.proximo != null) {
        atual = atual.proximo;
    }
    atual.proximo = outra.cabeca;
}
```

**`Como utilizar o método:`**

```
alunos.concatenar(outraLista);
```

---

### 16. Encontrar o maior elemento (se for números)

Percorre toda a lista para achar o **maior valor**.

* Assume que os valores armazenados são números em formato `String` (nesse caso, converte para `int`).
* Complexidade: **O(n)**.

```java
public int maior() {
    if (cabeca == null) throw new RuntimeException("Lista vazia");
    No atual = cabeca;
    int maior = Integer.parseInt(atual.nome);
    while (atual != null) {
        int valor = Integer.parseInt(atual.nome);
        if (valor > maior) maior = valor;
        atual = atual.proximo;
    }
    return maior;
}
```

**`Como utilizar o método:`**

```
System.out.println("Maior valor da lista: " + alunos.maior());
```

---

📌 **Resumindo os novos métodos:**

* **Inserção:** no começo.
* **Remoção:** em posição específica.
* **Busca/Consulta:** obter elemento em posição.
* **Utilitários:** clonar, concatenar, encontrar maior valor.
