public class Principal{
    // --- Função main para testar a implementação ---
    public static void main(String[] args) {
        Playlist minhaPlaylist = new Playlist();
        minhaPlaylist.adicionarMusica("Bohemian Rhapsody", "Queen", 355);
        minhaPlaylist.adicionarMusica("Smells Like Teen Spirit", "Nirvana", 301);
        minhaPlaylist.adicionarMusica("Hotel California", "Eagles", 391);
        minhaPlaylist.adicionarMusica("Stairway to Heaven", "Led Zeppelin", 482);
        
        System.out.println("Playlist original:");
        minhaPlaylist.exibirPlaylist();

        // --- ÁREA DE TESTES PARA OS ALUNOS ---
        
        // Teste do Objetivo 1: Tocar a playlist
        System.out.println("\n--- Testando tocarProxima ---");
        minhaPlaylist.tocarProxima(); // Deveria tocar a 1a
        minhaPlaylist.tocarProxima(); // Deveria tocar a 2a
        
        // Teste do Objetivo 2: Mover música
        System.out.println("\n--- Testando moverMusica ---");
        // Exemplo: Mover "Hotel California" para a segunda posição
        minhaPlaylist.moverMusica("Hotel California", 2); 
        minhaPlaylist.exibirPlaylist();
        
        // Teste do Objetivo 3 (Bônus): Inverter a playlist
        System.out.println("\n--- Testando inverterPlaylist ---");
        minhaPlaylist.inverterPlaylist();
        minhaPlaylist.exibirPlaylist();
    }
}