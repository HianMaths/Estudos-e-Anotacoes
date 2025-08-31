**`Java -> Estrutura de Dados`**

## 📌 O que é uma lista duplamente encadeada?

É uma **estrutura de dados dinâmica** onde cada elemento (nó) possui **dois ponteiros/referências**:

* Um que aponta para o **nó anterior**;
* Outro que aponta para o **próximo nó**.

Diferente da lista simplesmente encadeada (que só vai para frente), a **lista duplamente encadeada** permite **navegação nos dois sentidos** (pra frente e pra trás).

---

## 📦 Estrutura de um nó

Um nó de lista duplamente encadeada geralmente tem:

* **Dado** (a informação que você quer guardar);
* **Ponteiro anterior** (para o nó que vem antes);
* **Ponteiro próximo** (para o nó que vem depois).

Exemplo em pseudo-estrutura:

```
class No {
    dado
    No anterior
    No proximo
}
```

---

## 🎯 Vantagens

* Pode percorrer a lista tanto **do início para o fim** quanto **do fim para o início**.
* Inserção e remoção ficam **mais rápidas e flexíveis**, já que você não precisa percorrer toda a lista para achar o nó anterior (você já tem a referência).
* Boa para cenários como **playlists**, **histórico de navegador**, **desfazer/refazer** em editores.

---

## ⚙️ Operações comuns

### 1. Inserir no início

* Cria um novo nó.
* Faz ele apontar para o antigo primeiro nó.
* Atualiza o `anterior` do antigo primeiro nó.
* Atualiza a referência da cabeça (head).

### 2. Inserir no fim

* Cria um novo nó.
* Faz o último nó apontar para ele.
* Atualiza o `anterior` do novo nó.
* Atualiza a referência da cauda (tail).

### 3. Remover um nó

* Ajusta o `proximo` do nó anterior para pular o nó removido.
* Ajusta o `anterior` do próximo nó para apontar para o anterior.
* Se for o primeiro ou último, atualiza `head` ou `tail`.

### 4. Percorrer

* Da **cabeça para a cauda** usando `proximo`.
* Ou da **cauda para a cabeça** usando `anterior`.

---

## 🔎 Visualização simples

Imagina que temos os elementos: **10 ⇄ 20 ⇄ 30 ⇄ 40**

* O `head` aponta para 10.
* O `tail` aponta para 40.
* Cada nó aponta para o anterior e o próximo.

```
null ← [10] ⇄ [20] ⇄ [30] ⇄ [40] → null
```

---

👉 Resumindo:
A **lista duplamente encadeada** é como uma "rua de mão dupla", enquanto a **simplesmente encadeada** é "mão única".
