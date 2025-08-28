//Hian Matheus e Joao Vitor Façanha

// Classe que gerencia a playlist
public class Playlist {
    private MusicaNode head; // Referência para o início da lista
    private MusicaNode musicaAtual; // Referência para a música que está "tocando"

    // Construtor: inicializa uma playlist vazia
    public Playlist() {
        this.head = null;
        this.musicaAtual = null;
    }

    // --- MÉTODOS JÁ IMPLEMENTADOS ---

    // Adiciona uma nova música no FINAL da playlist
    public void adicionarMusica(String titulo, String artista, int duracao) {
        MusicaNode novaMusica = new MusicaNode(titulo, artista, duracao);
        if (head == null) {
            head = novaMusica;
        } else {
            MusicaNode atual = head;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novaMusica;
        }
        System.out.println("Musica '" + titulo + "' adicionada.");
    }

    // Remove uma música da playlist pelo título
    public void removerMusica(String titulo) {
        if (head == null) {
            System.out.println("Playlist vazia, nada a remover.");
            return;
        }

        // Caso especial: o nó a ser removido é a cabeça da lista
        // Em Java, usamos .equals() para comparar strings
        if (head.titulo.equals(titulo)) {
            head = head.proximo;
            // O Garbage Collector do Java cuidará de limpar a memória do nó antigo
            System.out.println("Musica '" + titulo + "' removida.");
            return;
        }

        MusicaNode anterior = head;
        MusicaNode atual = head.proximo;
        while (atual != null && !atual.titulo.equals(titulo)) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Musica '" + titulo + "' nao encontrada na playlist.");
        } else {
            anterior.proximo = atual.proximo;
            System.out.println("Musica '" + titulo + "' removida.");
        }
    }

    // Exibe todas as músicas da playlist
    public void exibirPlaylist() {
        if (head == null) {
            System.out.println("A playlist esta vazia.");
            return;
        }
        System.out.println("--- MINHA PLAYLIST ---");
        MusicaNode atual = head;
        int index = 1;
        while (atual != null) {
            System.out.println(index++ + ". " + atual.titulo + " - " 
                               + atual.artista + " (" + atual.duracao / 60 + "m" 
                               + atual.duracao % 60 + "s)");
            atual = atual.proximo;
        }
        System.out.println("---------------------");
    }

    // --- DESAFIO: IMPLEMENTAR ESTES MÉTODOS ---

    /*
     * OBJETIVO 1: Simular a reprodução de músicas.
     * A primeira vez que for chamada, deve exibir a primeira música.
     * Nas chamadas seguintes, deve exibir a próxima música da lista.
     * Se chegar ao final da playlist, deve voltar para o início (comportamento de "repeat").
     * Dica: Use a referência 'musicaAtual'. Se ela for nula, comece do 'head'.
    */
    public void tocarProxima() {
      if (head == null) {
        System.out.println("A playlist esta vazia.");
        return;
    }

    if (musicaAtual == null) {
        musicaAtual = head; // primeira chamada
    } else {
        musicaAtual = musicaAtual.proximo; // avança
        if (musicaAtual == null) {
            musicaAtual = head; // repeat
        }
    }

    System.out.println("Tocando agora: " + musicaAtual.titulo + " - " 
                       + musicaAtual.artista + " (" 
                       + musicaAtual.duracao / 60 + "m" 
                       + musicaAtual.duracao % 60 + "s)");    }
    

    /*
     * OBJETIVO 2: Reorganizar a playlist.
     * Encontrar a música com o 'titulo' fornecido e movê-la para a 'novaPosicao'.
     * As posições começam em 1. Ex: novaPosicao = 1 significa mover para o início.
     * Lembre-se de tratar os casos especiais:
     * - Mover o primeiro elemento.
     * - Mover para a primeira posição.
     * - Mover para a última posição.
     * - Posição inválida ou música não encontrada.
     * Dica: Você precisará de referências para o nó anterior ao que será movido
     * e para o nó anterior à nova posição.
    */
    public void moverMusica(String titulo, int novaPosicao) {
        if (head == null) {
        System.out.println("A playlist esta vazia.");
        return;
    }

    // Conta o tamanho da lista
    int tamanho = 0;
    MusicaNode temp = head;
    while (temp != null) {
        tamanho++;
        temp = temp.proximo;
    }

    if (novaPosicao < 1 || novaPosicao > tamanho) {
        System.out.println("Posicao invalida.");
        return;
    }

    // Encontrar o nó da música e seu anterior
    MusicaNode anterior = null;
    MusicaNode atual = head;
    while (atual != null && !atual.titulo.equals(titulo)) {
        anterior = atual;
        atual = atual.proximo;
    }

    if (atual == null) {
        System.out.println("Musica '" + titulo + "' nao encontrada.");
        return;
    }

    // Se já está na posição desejada, nada muda
    int posAtual = 1;
    MusicaNode aux = head;
    while (aux != atual) {
        posAtual++;
        aux = aux.proximo;
    }
    if (posAtual == novaPosicao) {
        System.out.println("Musica '" + titulo + "' ja esta na posicao " + novaPosicao + ".");
        return;
    }

    // Remove o nó da posição original
    if (anterior == null) { // se era head
        head = atual.proximo;
    } else {
        anterior.proximo = atual.proximo;
    }

    // Inserir na nova posição
    if (novaPosicao == 1) {
        atual.proximo = head;
        head = atual;
    } else {
        MusicaNode antesNovaPos = head;
        for (int i = 1; i < novaPosicao - 1; i++) {
            antesNovaPos = antesNovaPos.proximo;
        }
        atual.proximo = antesNovaPos.proximo;
        antesNovaPos.proximo = atual;
    }

    System.out.println("Musica '" + titulo + "' movida para a posicao " + novaPosicao + ".");
}
   

    /*
     * OBJETIVO 3 (BÔNUS): Inverter a ordem de toda a playlist.
     * O último elemento deve se tornar o primeiro, o penúltimo o segundo, e assim por diante.
     * Tente fazer isso "in-place", ou seja, sem criar uma nova lista,
     * apenas manipulando as referências 'proximo' dos nós existentes.
     * Dica: Você precisará de três referências: 'anterior', 'atual' e 'proximo'.
    */
    public void inverterPlaylist() {
      if (head == null || head.proximo == null) {
        System.out.println("Nada para inverter.");
        return;
    }

    MusicaNode anterior = null;
    MusicaNode atual = head;
    MusicaNode proximo = null;

    while (atual != null) {
        proximo = atual.proximo;
        atual.proximo = anterior;
        anterior = atual;
        atual = proximo;
    }

    head = anterior;
    System.out.println("Playlist invertida com sucesso!");
}
}