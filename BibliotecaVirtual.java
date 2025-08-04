import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

//classe main/Bib.
public class BibliotecaVirtual {
    public static void main(String[] args) {

        // Inicializando classes
        Biblioteca biblioteca = new Biblioteca();
        ListaEspera listaEspera = new ListaEspera();
        HistoricoNavegacao historico = new HistoricoNavegacao();
        RecomendacaoLivros recomendacoes = new RecomendacaoLivros();

        // Adicionando na estante
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        Livro livro3 = new Livro("O Alienista", "Machado de Assis", 1882);
        Livro livro4 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        Livro livro5 = new Livro("1984", "George Orwell", 1949);
        Livro livro6 = new Livro("A Revolução dos Bichos", "George Orwell", 1945);
        Livro livro7 = new Livro("Crime e Castigo", "Fiódor Dostoiévski", 1866);
        Livro livro8 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        Livro livro9 = new Livro("Orgulho e Preconceito", "Jane Austen", 1813);
        Livro livro10 = new Livro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 1954);

        //Adicionando livro na biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro6);
        biblioteca.adicionarLivro(livro7);
        biblioteca.adicionarLivro(livro8);
        biblioteca.adicionarLivro(livro9);
        biblioteca.adicionarLivro(livro10);

        // LinkedList estante
        System.out.println("LIVROS NA BIBLIOTECA");
        LinkedList<Livro> todosLivros = biblioteca.listarLivros();
        for (Livro livro : todosLivros) {
            System.out.println(livro);
        }

        // Queue lista de espera
        System.out.println("\nLISTA DE ESPERA");
        listaEspera.adicionarUsuario("Pedro");
        listaEspera.adicionarUsuario("Henrique");
        listaEspera.adicionarUsuario("Ceciliano");

        System.out.println("Próximo na fila: " + listaEspera.proximoUsuario());
        System.out.println("Fila atual: " + listaEspera.getFila());

        // Stack histórico de navegação
        System.out.println("\nHISTÓRICO DE NAVEGAÇÃO");
        historico.adicionarAoHistorico(livro1);
        historico.adicionarAoHistorico(livro2);
        historico.adicionarAoHistorico(livro3);

        System.out.println("Último livro visualizado: " + historico.verUltimoLivro());
        System.out.println("Voltando... Livro anterior: " + historico.voltar());

        // Graph recomendação do sistema
        System.out.println("\nSISTEMA DE RECOMENDAÇÕES");
        recomendacoes.popularGrafo();

        Set<Livro> recomendacoesLivro1 = recomendacoes.getRecomendacoes(livro1);
        System.out.println("Recomendações para " + livro1.getTitulo() + ":");
        for (Livro recomendacao : recomendacoesLivro1) {
            System.out.println("- " + recomendacao);

            // Utilizando Dijkstra
            recomendacoes.CaminhosProximos(livro1);

        }
    }
}