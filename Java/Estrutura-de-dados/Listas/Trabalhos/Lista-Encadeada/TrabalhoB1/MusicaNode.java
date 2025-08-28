// Classe que representa cada nó da lista (uma música)
class MusicaNode {
    String titulo;
    String artista;
    int duracao; // em segundos
    MusicaNode proximo;

    // Construtor para facilitar a criação de uma nova música
    public MusicaNode(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.proximo = null; // Em Java, a referência já é inicializada como null por padrão
    }
}