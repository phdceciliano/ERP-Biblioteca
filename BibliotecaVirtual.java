import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class BibliotecaVirtual {
    public static void main(String[] args) {
        // Inicializando componentes
        Biblioteca biblioteca = new Biblioteca();
        ListaEspera listaEspera = new ListaEspera();
        HistoricoNavegacao historico = new HistoricoNavegacao();
        RecomendacaoLivros recomendacoes = new RecomendacaoLivros();

        // Adicionando na biblioteca
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        Livro livro3 = new Livro("O Alienista", "Machado de Assis", 1882);
        Livro livro4 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);

        // LinkedList (Biblioteca)
        System.out.println("=== LIVROS NA BIBLIOTECA ===");
        LinkedList<Livro> todosLivros = biblioteca.listarLivros();
        for (Livro livro : todosLivros) {
            System.out.println(livro);
        }

        // Queue (Lista de Espera)
        System.out.println("\n=== LISTA DE ESPERA ===");
        listaEspera.adicionarUsuario("João");
        listaEspera.adicionarUsuario("Maria");
        listaEspera.adicionarUsuario("Carlos");

        System.out.println("Próximo na fila: " + listaEspera.proximoUsuario());
        System.out.println("Fila atual: " + listaEspera.getFila());

        // Stack (Histórico de Navegação)
        System.out.println("\n=== HISTÓRICO DE NAVEGAÇÃO ===");
        historico.adicionarAoHistorico(livro1);
        historico.adicionarAoHistorico(livro2);
        historico.adicionarAoHistorico(livro3);

        System.out.println("Último livro visualizado: " + historico.verUltimoLivro());
        System.out.println("Voltando... Livro anterior: " + historico.voltar());

        // Graph (Sistema de Recomendações)
        System.out.println("\n=== SISTEMA DE RECOMENDAÇÕES ===");
        recomendacoes.popularGrafo();

        Set<Livro> recomendacoesLivro1 = recomendacoes.getRecomendacoes(livro1);
        System.out.println("Recomendações para " + livro1.getTitulo() + ":");
        for (Livro recomendacao : recomendacoesLivro1) {
            System.out.println("- " + recomendacao);
        }
    }
}