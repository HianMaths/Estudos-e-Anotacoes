**`Java -> Estrutura de Dados`**

# Explicação sobre Matrizes e Vetores em Java

## Vetores

Vetores (ou arrays unidimensionais) são estruturas que armazenam uma sequência de elementos do mesmo tipo. Para instanciar um vetor em Java:

```java
int[] vetor = new int[5]; // Cria um vetor de 5 posições do tipo int
```

Você também pode inicializar o vetor diretamente com valores:

```java
int[] vetor = {1, 2, 3, 4, 5};
```

## Matrizes

Matrizes (ou arrays bidimensionais) são estruturas que armazenam dados em formato de tabela (linhas e colunas). Para instanciar uma matriz em Java:

```java
int[][] matriz = new int[3][4]; // Cria uma matriz com 3 linhas e 4 colunas
```

Também é possível inicializar a matriz com valores:

```java
int[][] matriz = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};
```

## Estrutura de repetição `for`

O `for` é utilizado para percorrer vetores e matrizes. Exemplo com vetor:

```java
for (int i = 0; i < vetor.length; i++) {
    System.out.println(vetor[i]);
}
```

Exemplo com matriz:

```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.println(matriz[i][j]);
    }
}
```

O `for` permite executar um bloco de código várias vezes, facilitando o acesso e manipulação dos elementos de vetores e matrizes.