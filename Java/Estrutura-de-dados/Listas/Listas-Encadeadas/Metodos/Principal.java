public class Principal{
   public static void main(String[] args){
      String nome = "Flávio";
      //tipo variavel = valor;
      Lista alunos = new Lista();
      
     // métodos presentes na lista 
     alunos.imprimirLista();
     alunos.adicionarComeco(nome);
     alunos.adicionarComeco("Pedro");
     alunos.adicionarComeco("Maria");
     
     alunos.inserirNoFinal("Lucas");
     alunos.inserirNoFinal("Carlos");
     
     alunos.removerComeco();
     alunos.removerFinal();
     
     String nomeProcurado = "Lucas";
        if (alunos.buscar(nomeProcurado)) {
            System.out.println(nomeProcurado + " foi encontrado na lista!");
        } else {
            System.out.println(nomeProcurado + " não está na lista.");
        }
     
     // alunos.limpar();
     // alunos.inverter();
     
     System.out.println("Tamanho da lista: " + alunos.tamanho());
     
     alunos.imprimirLista();
     //Maria -> Pedro -> Flávio 
   }
}