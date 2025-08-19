# Listas Circulares em Java

Uma **lista circular** é uma variação da lista ligada onde o último nó aponta para o primeiro nó, formando um ciclo. Isso significa que, ao percorrer a lista, não há um fim explícito; após o último elemento, retorna-se ao início.

## Características

- O ponteiro `next` do último nó aponta para o primeiro nó.
- Pode ser **simplesmente ligada** (apenas próximo) ou **duplamente ligada** (próximo e anterior).
- Não possui um nó nulo ao final.

## Vantagens

- Permite percorrer a lista a partir de qualquer ponto.
- Útil para aplicações como jogos de tabuleiro, buffers circulares, etc.

## Exemplo de Implementação em Java
```java
class No {
    int dado;
    No proximo;

    No(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}

class ListaCircular {
    No cabeca = null;

    // Inserção no final
    void inserir(int dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
            novoNo.proximo = cabeca;
        } else {
            No temp = cabeca;
            while (temp.proximo != cabeca) {
                temp = temp.proximo;
            }
            temp.proximo = novoNo;
            novoNo.proximo = cabeca;
        }
    }

    // Impressão da lista
    void imprimirLista() {
        if (cabeca == null) return;
        No temp = cabeca;
        do {
            System.out.print(temp.dado + " ");
            temp = temp.proximo;
        } while (temp != cabeca);
        System.out.println();
    }
}
```
## Observações

- É importante evitar loops infinitos ao percorrer listas circulares.
- Sempre verifique se o próximo nó é igual ao nó inicial para encerrar a iteração.
