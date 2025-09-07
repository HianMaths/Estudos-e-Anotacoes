
import java.util.Arrays;

// Nó da lista duplamente encadeada
class No {
    int dado;
    No anterior;
    No proximo;

    No(int dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}

// Lista Duplamente Encadeada com 10 operações
public class ListaMetodos{
    private No head; // cabeça
    private No tail; // cauda

    public ListaMetodos() {
        this.head = null;
        this.tail = null;
    }

    // 1) Inserir no início (addFirst)
    public void addFirst(int dado) {
        No novo = new No(dado);
        if (head == null) {
            head = tail = novo;
        } else {
            novo.proximo = head;     // novo -> antigo head
            head.anterior = novo;    // antigo head -> novo
            head = novo;             // atualiza cabeça
        }
    }

    // 2) Inserir no fim (addLast)
    public void addLast(int dado) {
        No novo = new No(dado);
        if (tail == null) {
            head = tail = novo;
        } else {
            tail.proximo = novo;     // antigo tail -> novo
            novo.anterior = tail;    // novo -> antigo tail
            tail = novo;             // atualiza cauda
        }
    }

    // 3) Remover do início (removeFirst)
    public void removeFirst() {
        if (head == null) return;    // lista vazia
        if (head == tail) {          // 1 único elemento
            head = tail = null;
        } else {
            head = head.proximo;     // avança a cabeça
            head.anterior = null;    // novo head não tem anterior
        }
    }

    // 4) Remover do fim (removeLast)
    public void removeLast() {
        if (tail == null) return;    // lista vazia
        if (head == tail) {          // 1 único elemento
            head = tail = null;
        } else {
            tail = tail.anterior;    // recua a cauda
            tail.proximo = null;     // novo tail não tem próximo
        }
    }

    // 5) Inserir em posição específica (0 = início; >= tamanho = fim)
    public void addAtPosition(int dado, int posicao) {
        if (posicao <= 0 || head == null) {
            addFirst(dado);
            return;
        }
        No atual = head;
        // caminhar até o nó na posição (posicao-1) ou até o fim
        for (int i = 0; i < posicao - 1 && atual.proximo != null; i++) {
            atual = atual.proximo;
        }
        if (atual.proximo == null) { // chegamos na cauda: inserir no fim
            addLast(dado);
        } else {
            No novo = new No(dado);
            novo.proximo = atual.proximo;    // novo -> próximo
            novo.anterior = atual;           // novo -> atual
            atual.proximo.anterior = novo;   // próximo -> novo
            atual.proximo = novo;            // atual -> novo
        }
    }

    // 6) Remover pelo valor (remove a primeira ocorrência)
    public void removeByValue(int dado) {
        No atual = head;
        while (atual != null && atual.dado != dado) {
            atual = atual.proximo;
        }
        if (atual == null) return; // não encontrado

        if (atual == head) {
            removeFirst();
        } else if (atual == tail) {
            removeLast();
        } else {
            // "pula" o nó atual
            atual.anterior.proximo = atual.proximo;
            atual.proximo.anterior = atual.anterior;
        }
    }

    // 7) Buscar elemento (true se existir)
    public boolean contains(int dado) {
        No atual = head;
        while (atual != null) {
            if (atual.dado == dado) return true;
            atual = atual.proximo;
        }
        return false;
    }

    // 8) Tamanho da lista
    public int size() {
        int count = 0;
        No atual = head;
        while (atual != null) {
            count++;
            atual = atual.proximo;
        }
        return count;
    }

    // 9) Limpar lista
    public void clear() {
        head = null;
        tail = null;
    }

    // 10) Converter em array
    public int[] toArray() {
        int[] arr = new int[size()];
        int i = 0;
        No atual = head;
        while (atual != null) {
            arr[i++] = atual.dado;
            atual = atual.proximo;
        }
        return arr;
    }

    // Utilidades de depuração (impressões)
    public void printForward() {
        No a = head;
        System.out.print("(início → fim) ");
        while (a != null) { System.out.print("[" + a.dado + "] "); a = a.proximo; }
        System.out.println();
    }

    public void printBackward() {
        No a = tail;
        System.out.print("(fim → início) ");
        while (a != null) { System.out.print("[" + a.dado + "] "); a = a.anterior; }
        System.out.println();
    }

    // Demonstração
    public static void main(String[] args) {
        ListaMetodos lista = new ListaMetodos();

        // 1 e 2: inserir no início/fim
        lista.addFirst(10);
        lista.addFirst(5);
        lista.addLast(20);
        lista.addLast(30);
        lista.printForward(); // [5] [10] [20] [30]

        // 5: inserir em posição
        lista.addAtPosition(15, 2);  // 0:5, 1:10, 2:⟵
        lista.printForward(); // [5] [10] [15] [20] [30]

        // 7: contains
        System.out.println("contains 20? " + lista.contains(20));
        System.out.println("contains 99? " + lista.contains(99));

        // 6: remover por valor
        lista.removeByValue(15);
        lista.printForward(); // [5] [10] [20] [30]

        // 3 e 4: remover início/fim
        lista.removeFirst();  // remove 5
        lista.removeLast();   // remove 30
        lista.printForward(); // [10] [20]
        lista.printBackward();// [20] [10]

        // 8 e 10: size + toArray
        System.out.println("size=" + lista.size());
        System.out.println("array=" + Arrays.toString(lista.toArray()));

        // 9: clear
        lista.clear();
        lista.printForward(); // vazio
        System.out.println("size=" + lista.size());
    }
}
