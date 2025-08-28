// Classe que gerencia a masmorra (a lista encadeada)
public class Masmorra {
    private SalaNode entrada; // Equivalente ao "head"

    public Masmorra() {
        this.entrada = null;
    }

    // --- MÉTODOS JÁ IMPLEMENTADOS ---

    // Adiciona uma nova sala no FINAL da masmorra
    public void adicionarSala(String tipo, int valor) {
        SalaNode novaSala = new SalaNode(tipo, valor);
        if (entrada == null) {
            entrada = novaSala;
        } else {
            SalaNode atual = entrada;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novaSala;
        }
    }

    // Percorre a masmorra e exibe os eventos de cada sala
    public void explorarMasmorra() {
        if (entrada == null) {
            System.out.println("A masmorra está vazia. O herói não tem para onde ir.");
            return;
        }
        System.out.println("--- O Herói entra na masmorra... ---");
        SalaNode atual = entrada;
        int passo = 1;
        while (atual != null) {
            System.out.print("Passo " + passo + ": ");
            switch (atual.tipo) {
                case "monstro":
                    System.out.println("Um " + atual.tipo + " feroz aparece! Causa " + atual.valor + " de dano.");
                    break;
                case "tesouro":
                    System.out.println("Você encontrou um " + atual.tipo + "! Ganhou " + atual.valor + " moedas de ouro.");
                    break;
                case "vazia":
                    System.out.println("Esta sala está " + atual.tipo + ". Um momento de paz.");
                    break;
                default:
                    System.out.println("Sala misteriosa...");
                    break;
            }
            atual = atual.proximo;
            passo++;
        }
        System.out.println("--- Fim da exploração. ---");
    }

    // --- DESAFIO: IMPLEMENTAR ESTES MÉTODOS ---

    /*
     * OBJETIVO 1: Anexar outra masmorra no final da masmorra atual.
     * A 'outraMasmorra' representa um novo caminho que se conecta ao final do caminho atual.
     * Após a fusão, a 'outraMasmorra' deve ficar vazia para evitar que o mesmo caminho
     * seja gerenciado por dois objetos diferentes.
     * Dica: Percorra a masmorra atual até o último nó e aponte o 'proximo' dele
     * para a entrada da 'outraMasmorra'. Não se esqueça de "esvaziar" a outra masmorra.
    */
    public void fundirMasmorras(Masmorra outraMasmorra) {
        if (outraMasmorra == null || outraMasmorra.entrada == null) {
        System.out.println("Nada para fundir.");
        return;
    }

    if (entrada == null) {
        entrada = outraMasmorra.entrada;
    } else {
        SalaNode atual = entrada;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = outraMasmorra.entrada;
    }

    outraMasmorra.entrada = null; // esvazia a outra
    System.out.println("Masmorras fundidas com sucesso!");
    }

    /*
     * OBJETIVO 2: Inserir uma nova sala (um caminho secreto) após a primeira
     * ocorrência de uma sala de um tipo específico.
     * Ex: Inserir uma sala "tesouro" após a primeira sala "vazia" encontrada.
     * Dica: Percorra a lista até encontrar um nó com o tipo 'tipoSalaAnterior'.
     * Quando encontrar, crie a nova sala e ajuste as referências para inseri-la logo após.
    */
    public void inserirCaminhoSecreto(String tipoSalaAnterior, String novoTipo, int novoValor) {
        SalaNode atual = entrada;

    while (atual != null && !atual.tipo.equals(tipoSalaAnterior)) {
        atual = atual.proximo;
    }

    if (atual == null) {
        System.out.println("Nenhuma sala do tipo '" + tipoSalaAnterior + "' encontrada.");
        return;
    }

    SalaNode nova = new SalaNode(novoTipo, novoValor);
    nova.proximo = atual.proximo;
    atual.proximo = nova;

    System.out.println("Caminho secreto inserido apos a sala '" + tipoSalaAnterior + "'.");    }

    /*
     * OBJETIVO 3 (BÔNUS): Percorrer a masmorra e remover todas as salas de monstro
     * cujo dano ('valor') seja maior que 'danoMaximo'.
     * Isso torna a masmorra mais segura para o herói.
     * Dica: Cuidado ao remover nós! Você precisará de uma referência para o nó 'anterior'.
     * Lembre-se de tratar os casos especiais:
     * - O monstro a ser removido é a entrada da masmorra.
     * - Existem monstros perigosos em sequência.
    */
    public void removerSalasPerigosas(int danoMaximo) {
        // Remove monstros perigosos no início
    while (entrada != null && entrada.tipo.equals("monstro") && entrada.valor > danoMaximo) {
        entrada = entrada.proximo;
    }

    SalaNode atual = entrada;
    SalaNode anterior = null;

    while (atual != null) {
        if (atual.tipo.equals("monstro") && atual.valor > danoMaximo) {
            anterior.proximo = atual.proximo; // remove o nó
        } else {
            anterior = atual;
        }
        atual = atual.proximo;
    }

    System.out.println("Salas perigosas removidas (dano > " + danoMaximo + ").");
    }

}