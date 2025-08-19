## Lista Encadeada em Java

Uma **lista encadeada** é uma estrutura de dados composta por nós, onde cada nó armazena um valor e uma referência para o próximo nó da lista. Diferente de arrays, listas encadeadas não possuem tamanho fixo e permitem inserções e remoções eficientes.

### Estrutura de um Nó

```java
class No {
    int valor;
    No proximo;

    No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}
```

### Implementação Básica de Lista Encadeada

```java
class ListaEncadeada {
    No cabeca;

    // Adiciona um elemento ao início da lista
    void adicionarInicio(int valor) {
        No novoNo = new No(valor);
        novoNo.proximo = cabeca;
        cabeca = novoNo;
    }

    // Exibe todos os elementos da lista
    void exibir() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
```

### Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.adicionarInicio(3);
        lista.adicionarInicio(2);
        lista.adicionarInicio(1);
        lista.exibir(); // Saída: 1 2 3
    }
}
```

### Vantagens

- Inserção e remoção eficientes no início da lista.
- Tamanho dinâmico.

### Desvantagens

- Acesso sequencial (não é possível acessar diretamente um elemento pelo índice).
- Maior uso de memória devido às referências extras.
