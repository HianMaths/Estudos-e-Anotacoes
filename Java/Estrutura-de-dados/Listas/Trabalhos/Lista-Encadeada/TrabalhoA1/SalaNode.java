// Classe que representa cada nó da lista (uma sala da masmorra)
class SalaNode {
    String tipo; // "monstro", "tesouro", "vazia"
    int valor;   // Dano do monstro, valor do tesouro, etc.
    SalaNode proximo;

    public SalaNode(String tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.proximo = null;
    }
}