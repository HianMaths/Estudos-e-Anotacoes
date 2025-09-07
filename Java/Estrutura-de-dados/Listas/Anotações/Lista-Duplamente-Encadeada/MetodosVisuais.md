**`Java -> Estrutura de Dados`**

## 🧭 Visuais passo a passo (diagramas ASCII)

> Convenções: `head` = cabeça, `tail` = cauda. Cada nó: `[valor]`. Setas duplas mostram ligações nos dois sentidos `⇄`.

### 1) Inserir no início (addFirst)

Antes:

```
head          tail
 ↓             ↓
[10] ⇄ [20] ⇄ [30]
```

Passos:

```
Cria [5]
[5]

[5] → proximo = head (aponta para antigo primeiro)
[5] → [10] ⇄ [20] ⇄ [30]

antigo head (10) → anterior = [5]
[5] ⇄ [10] ⇄ [20] ⇄ [30]

head = [5]
head              tail
 ↓                 ↓
[5] ⇄ [10] ⇄ [20] ⇄ [30]
```

Depois: `null ← [5] ⇄ [10] ⇄ [20] ⇄ [30] → null`

---

### 2) Inserir no fim (addLast)

Antes:

```
head          tail
 ↓             ↓
[10] ⇄ [20] ⇄ [30]
```

Passos:

```
Cria [40]

antigo tail (30) → proximo = [40]
[10] ⇄ [20] ⇄ [30] → [40]

[40] → anterior = [30]
[10] ⇄ [20] ⇄ [30] ⇄ [40]

tail = [40]
```

Depois: `null ← [10] ⇄ [20] ⇄ [30] ⇄ [40] → null`

---

### 3) Remover do início (removeFirst)

Antes:

```
head                    tail
 ↓                       ↓
[10] ⇄ [20] ⇄ [30] ⇄ [40]
```

Passos:

```
head = head.proximo  (novo head é [20])
[10]   X  [20] ⇄ [30] ⇄ [40]

novo head ([20]) → anterior = null
null ← [20] ⇄ [30] ⇄ [40]
```

Depois: `null ← [20] ⇄ [30] ⇄ [40] → null`

---

### 4) Remover do fim (removeLast)

Antes:

```
head                    tail
 ↓                       ↓
[10] ⇄ [20] ⇄ [30] ⇄ [40]
```

Passos:

```
tail = tail.anterior  (novo tail é [30])
[10] ⇄ [20] ⇄ [30]   X   [40]

novo tail ([30]) → proximo = null
[10] ⇄ [20] ⇄ [30] → null
```

Depois: `null ← [10] ⇄ [20] ⇄ [30] → null`

---

### 5) Inserir em posição específica (addAtPosition)

Objetivo: inserir `15` na posição `2`.

Antes (índices):

```
 0     1     2     3     4
[5] ⇄ [10] ⇄ [20] ⇄ [30] ⇄ [40]
 ^head                          ^tail
```

Passos:

```
Caminha até índice 1 (nó [10])

Cria [15]

[15].proximo = [20]
[15].anterior = [10]

[10].proximo = [15]
[20].anterior = [15]
```

Depois:

```
[5] ⇄ [10] ⇄ [15] ⇄ [20] ⇄ [30] ⇄ [40]
```

---

### 6) Remover pelo valor (removeByValue)

Objetivo: remover a **primeira ocorrência** do valor `30`.

Antes:

```
[5] ⇄ [10] ⇄ [20] ⇄ [30] ⇄ [40]
```

Passos (nó do meio):

```
Encontra [30]

[20].proximo = [40]
[40].anterior = [20]

[30] fica isolado e será coletado posteriormente
```

Depois:

```
[5] ⇄ [10] ⇄ [20] ⇄ [40]
```

Casos especiais: se for o primeiro, chama `removeFirst()`; se for o último, `removeLast()`.

---

### 7) Buscar elemento (contains)

Antes:

```
[5] ⇄ [10] ⇄ [20] ⇄ [40]
```

Passos:

```
Percorre do head ao tail comparando cada valor.
Se achar o valor procurado, retorna true; senão, false.
```

Exemplos:

```
contains(10) → true
contains(99) → false
```

---

### 8) Tamanho da lista (size)

Passos:

```
count = 0
para cada nó visitado: count++
quando nó == null: retorna count
```

Exemplo:

```
[5] ⇄ [10] ⇄ [20] ⇄ [40]  → size = 4
```

---

### 9) Limpar a lista (clear)

Passos:

```
head = null
tail = null
// sem referências, todos os nós são elegíveis ao garbage collector
```

Depois:

```
(null)
```

---

### 10) Converter em array (toArray)

Passos:

```
cria arr com tamanho = size()
varre a lista do head ao tail, copiando cada dado
retorna arr
```

Exemplo:

```
Lista: [10] ⇄ [20] ⇄ [40]
Array: [10, 20, 40]
```

