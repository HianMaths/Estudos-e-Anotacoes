public class Principal{
// --- Função main para testar a implementação ---
    public static void main(String[] args) {
        Masmorra trilhaPrincipal = new Masmorra();
        trilhaPrincipal.adicionarSala("vazia", 0);
        trilhaPrincipal.adicionarSala("monstro", 10);
        trilhaPrincipal.adicionarSala("tesouro", 50);

        System.out.println("Trilha Principal Original:");
        trilhaPrincipal.explorarMasmorra();

        // --- ÁREA DE TESTES PARA OS ALUNOS ---

        // Teste do Objetivo 1: Fundir Masmorras
        System.out.println("\n--- Testando fundirMasmorras ---");
        Masmorra caminhoSecundario = new Masmorra();
        caminhoSecundario.adicionarSala("monstro", 25);
        caminhoSecundario.adicionarSala("vazia", 0);
        System.out.println("Caminho Secundário:");
        caminhoSecundario.explorarMasmorra();

        trilhaPrincipal.fundirMasmorras(caminhoSecundario);
        System.out.println("Trilha Principal após a fusão:");
        trilhaPrincipal.explorarMasmorra();
        System.out.println("Caminho Secundário após a fusão (deve estar vazio):");
        caminhoSecundario.explorarMasmorra();

        // Teste do Objetivo 2: Inserir Caminho Secreto
        System.out.println("\n--- Testando inserirCaminhoSecreto ---");
        trilhaPrincipal.inserirCaminhoSecreto("vazia", "tesouro", 100);
        System.out.println("Trilha após inserir sala secreta:");
        trilhaPrincipal.explorarMasmorra();

        // Teste do Objetivo 3 (Bônus): Remover Salas Perigosas
        System.out.println("\n--- Testando removerSalasPerigosas ---");
        trilhaPrincipal.adicionarSala("monstro", 99); // Monstro perigoso
        trilhaPrincipal.removerSalasPerigosas(20); // Remove monstros com dano > 20
        System.out.println("Trilha após limpar salas perigosas:");
        trilhaPrincipal.explorarMasmorra();
    }

}