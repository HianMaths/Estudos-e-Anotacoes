**`Java -> Estrutura de Dados`**

# 📌 Métodos principais

## 1. **Inserir no início (addFirst)**

### Como funciona:

* Cria um novo nó.
* Faz ele apontar para o antigo `head`.
* Atualiza o `anterior` do antigo `head`.
* Atualiza `head` para o novo nó.

### Exemplo:

Lista antes:

```
null ← [10] ⇄ [20] ⇄ [30] → null
```

Inserindo **5 no início**:

```
null ← [5] ⇄ [10] ⇄ [20] ⇄ [30] → null
```

---

## 2. **Inserir no fim (addLast)**

### Como funciona:

* Cria um novo nó.
* Faz ele ser o `próximo` do antigo `tail`.
* Ajusta o `anterior` do novo nó.
* Atualiza `tail` para ele.

### Exemplo:

Lista antes:

```
null ← [10] ⇄ [20] ⇄ [30] → null
```

Inserindo **40 no fim**:

```
null ← [10] ⇄ [20] ⇄ [30] ⇄ [40] → null
```

---

## 3. **Remover do início (removeFirst)**

### Como funciona:

* Atualiza `head` para o próximo nó.
* Ajusta `anterior` do novo `head` para `null`.

### Exemplo:

Lista antes:

```
null ← [10] ⇄ [20] ⇄ [30] → null
```

Removendo o primeiro (10):

```
null ← [20] ⇄ [30] → null
```

---

## 4. **Remover do fim (removeLast)**

### Como funciona:

* Atualiza `tail` para o nó anterior.
* Ajusta `próximo` do novo `tail` para `null`.

### Exemplo:

Lista antes:

```
null ← [10] ⇄ [20] ⇄ [30] ⇄ [40] → null
```

Removendo o último (40):

```
null ← [10] ⇄ [20] ⇄ [30] → null
```

---

## 5. **Percorrer para frente**

### Como funciona:

* Começa no `head`.
* Vai seguindo `próximo` até `null`.

### Exemplo (saída):

```
10 → 20 → 30 → 40
```

---

## 6. **Percorrer para trás**

### Como funciona:

* Começa no `tail`.
* Vai seguindo `anterior` até `null`.

### Exemplo (saída):

```
40 → 30 → 20 → 10
```

---

✨ Assim, os métodos básicos são:

* `addFirst(dado)`
* `addLast(dado)`
* `removeFirst()`
* `removeLast()`
* `printForward()`
* `printBackward()`


