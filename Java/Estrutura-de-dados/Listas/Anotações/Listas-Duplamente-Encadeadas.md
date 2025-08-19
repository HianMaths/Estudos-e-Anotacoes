# Lista Duplamente Encadeada em Java

Uma **lista duplamente encadeada** é uma estrutura de dados composta por nós, onde cada nó possui uma referência para o próximo e para o nó anterior da lista. Isso permite percorrer a lista em ambas as direções (frente e trás).

## Estrutura de um Nó

```java
class No {
    int dado;
    No proximo;
    No anterior;

    No(int dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }
}
```

## Estrutura da Lista

```java
class ListaDuplamenteEncadeada {
    No cabeca;
    No cauda;

    // Adiciona um elemento ao final
    void adicionar(int dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = cauda = novoNo;
        } else {
            cauda.proximo = novoNo;
            novoNo.anterior = cauda;
            cauda = novoNo;
        }
    }

    // Remove um elemento do início
    void removerInicio() {
        if (cabeca != null) {
            cabeca = cabeca.proximo;
            if (cabeca != null) {
                cabeca.anterior = null;
            } else {
                cauda = null;
            }
        }
    }

    // Percorre a lista do início ao fim
    void imprimir() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
```

## Vantagens

- Permite inserção e remoção eficiente em ambas as extremidades.
- Facilita a navegação nos dois sentidos.

## Desvantagens

- Usa mais memória devido às referências extras.
- Implementação mais complexa que listas simplesmente encadeadas.
