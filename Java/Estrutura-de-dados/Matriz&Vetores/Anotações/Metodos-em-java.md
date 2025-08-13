# 🌟 Métodos em Java para Matrizes

Este arquivo reúne exemplos de métodos úteis para manipulação de **matrizes** em Java.  
Aqui você encontrará implementações, explicações e exemplos de uso para os principais métodos:

---

## 📋 Lista de Métodos

- [Procurar Ocorrência](#procurar-ocorrência)
- [Imprimir Matriz](#imprimir-matriz)
- [Multiplicar Matrizes](#multiplicar-matrizes)
- [Buscar Número](#buscar-número)
- [Imprimir Diagonal Principal](#imprimir-diagonal-principal)
- [Transpor Matriz](#transpor-matriz)
- [Encontrar Maior Valor](#encontrar-maior-valor)
- [Somar Matriz](#somar-matriz)

---

## Procurar Ocorrência

```java
public static boolean procurarOcorrencia(int[][] matriz, int valor) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] == valor) {
                return true;
            }
        }
    }
    return false;
}
```
**Exemplo de uso:**
```java
boolean existe = procurarOcorrencia(matriz, 5);
```

---

## Imprimir Matriz

```java
public static void imprimirMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
}
```
**Exemplo de uso:**
```java
imprimirMatriz(matriz);
```

---

## Multiplicar Matrizes

```java
public static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
    int linhas1 = matriz1.length;
    int colunas1 = matriz1[0].length;
    int colunas2 = matriz2[0].length;
    int[][] resultado = new int[linhas1][colunas2];

    for (int i = 0; i < linhas1; i++) {
        for (int j = 0; j < colunas2; j++) {
            for (int k = 0; k < colunas1; k++) {
                resultado[i][j] += matriz1[i][k] * matriz2[k][j];
            }
        }
    }
    return resultado;
}
```
**Exemplo de uso:**
```java
int[][] produto = multiplicarMatrizes(matrizA, matrizB);
```

---

## Buscar Número

```java
public static void buscaNumero(int[][] matriz, int num) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (num == matriz[i][j]) {
                System.out.println("Achou na posição [" + i + "][" + j + "]!");
            }
        }
    }
}
```
**Exemplo de uso:**
```java
buscaNumero(matriz, 7);
```

---

## Imprimir Diagonal Principal

```java
public static void imprimirDiagonalPrincipal(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        System.out.print(matriz[i][i] + " ");
    }
    System.out.println();
}
```
**Exemplo de uso:**
```java
imprimirDiagonalPrincipal(matriz);
```

---

## Transpor Matriz

```java
public static int[][] transporMatriz(int[][] matriz) {
    int linhas = matriz.length;
    int colunas = matriz[0].length;
    int[][] transposta = new int[colunas][linhas];

    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            transposta[j][i] = matriz[i][j];
        }
    }
    return transposta;
}
```
**Exemplo de uso:**
```java
int[][] transposta = transporMatriz(matriz);
```

---

## Encontrar Maior Valor

```java
public static int encontrarMaiorValor(int[][] matriz) {
    int maior = matriz[0][0];
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] > maior) {
                maior = matriz[i][j];
            }
        }
    }
    return maior;
}
```
**Exemplo de uso:**
```java
int maior = encontrarMaiorValor(matriz);
```

---

## Somar Matriz

```java
public static int somarMatriz(int[][] matriz) {
    int soma = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            soma += matriz[i][j];
        }
    }
    return soma;
}
```
**Exemplo de uso:**
```java
int total = somarMatriz(matriz);
```

---

> Consulte cada método para exemplos de uso e explicações