
## 🔹 1. `int` – Inteiro

* **O que é:** número inteiro (sem vírgula ou ponto decimal), pode ser positivo, negativo ou zero.
* **Uso:** quando o cálculo ou informação que o método retorna é um número inteiro.
* **Tamanho na memória:** 4 bytes.
* **Exemplo:**

```java
public class Exemplo {
    // Método que soma dois inteiros e retorna um int
    public static int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = soma(5, 3); // armazena o retorno do método
        System.out.println("Soma: " + resultado);
    }
}
```

**Saída:**

```
Soma: 8
```

> Aqui, `int` foi usado porque a soma de dois inteiros continua sendo um inteiro.

---

## 🔹 2. `double` – Decimal de alta precisão

* **O que é:** número decimal com **alta precisão** (64 bits), suporta valores muito grandes ou muito pequenos.
* **Uso:** quando precisa de resultados mais precisos, como cálculos financeiros ou científicos.
* **Tamanho na memória:** 8 bytes.
* **Exemplo:**

```java
public class Exemplo {
    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    public static void main(String[] args) {
        double media = calcularMedia(7.5, 8.2);
        System.out.println("Média: " + media);
    }
}
```

**Saída:**

```
Média: 7.85
```

> Usamos `double` porque a média pode gerar casas decimais e precisamos de boa precisão.

---

## 🔹 3. `float` – Decimal de precisão simples

* **O que é:** número decimal menos preciso que `double`, mas ocupa menos memória.
* **Uso:** quando precisa de casas decimais, mas não exige precisão máxima.
* **Tamanho na memória:** 4 bytes.
* **Observação:** sempre colocar **`f`** no final de valores `float` para diferenciar de `double`.
* **Exemplo:**

```java
public class Exemplo {
    public static float dividir(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {
        float resultado = dividir(5.0f, 2.0f);
        System.out.println("Divisão: " + resultado);
    }
}
```

**Saída:**

```
Divisão: 2.5
```

> O `float` aqui é suficiente para guardar o resultado sem gastar tanta memória.

---

## 🔹 4. `boolean` – Verdadeiro ou falso

* **O que é:** representa apenas dois valores: `true` ou `false`.
* **Uso:** quando o método responde a uma pergunta lógica.
* **Tamanho na memória:** 1 bit (na prática, ocupa mais por alinhamento de memória).
* **Exemplo:**

```java
public class Exemplo {
    public static boolean ehPar(int numero) {
        return numero % 2 == 0; // retorna true se o resto da divisão for 0
    }

    public static void main(String[] args) {
        System.out.println("É par? " + ehPar(4)); // true
        System.out.println("É par? " + ehPar(7)); // false
    }
}
```

> `boolean` é ideal para métodos que verificam condições.

---

## 🔹 5. `String` – Texto

* **O que é:** sequência de caracteres (palavras, frases, etc.).
* **Uso:** quando o método precisa devolver texto.
* **Observação:** `String` não é tipo primitivo, é uma **classe**.
* **Exemplo:**

```java
public class Exemplo {
    public static String saudacao(String nome) {
        return "Olá, " + nome + "!";
    }

    public static void main(String[] args) {
        System.out.println(saudacao("Hian"));
    }
}
```

**Saída:**

```
Olá, Hian!
```

> `String` serve para manipular textos e mensagens.

---

## 🔹 6. `char` – Um único caractere

* **O que é:** armazena apenas **um** caractere (letra, número, símbolo).
* **Uso:** quando só precisa de um símbolo isolado.
* **Tamanho na memória:** 2 bytes (suporta Unicode, incluindo acentos e emojis).
* **Exemplo:**

```java
public class Exemplo {
    public static char primeiraLetra(String palavra) {
        return palavra.charAt(0); // pega o primeiro caractere
    }

    public static void main(String[] args) {
        System.out.println("Primeira letra: " + primeiraLetra("Java"));
    }
}
```

**Saída:**

```
Primeira letra: J
```

> `char` é útil para trabalhar com letras individualmente.

---