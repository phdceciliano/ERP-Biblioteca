import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RecomendacaoLivros {
    private Map<Livro, Set<Livro>> grafoRecomendacoes;

    public RecomendacaoLivros() {
        grafoRecomendacoes = new HashMap<>();
    }

    public void adicionarLivro(Livro livro) {
        grafoRecomendacoes.putIfAbsent(livro, new HashSet<>());
    }

    public void adicionarRecomendacao(Livro livro1, Livro livro2) {
        adicionarLivro(livro1);
        adicionarLivro(livro2);
        grafoRecomendacoes.get(livro1).add(livro2);
        grafoRecomendacoes.get(livro2).add(livro1);
    }

    public Set<Livro> getRecomendacoes(Livro livro) {
        return grafoRecomendacoes.getOrDefault(livro, new HashSet<>());
    }

    public void popularGrafo() {
        // Adicionando 10 livros com recomendações
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        Livro livro3 = new Livro("O Alienista", "Machado de Assis", 1882);
        Livro livro4 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        Livro livro5 = new Livro("Crônica de uma Morte Anunciada", "Gabriel García Márquez", 1981);
        Livro livro6 = new Livro("1984", "George Orwell", 1949);
        Livro livro7 = new Livro("A Revolução dos Bichos", "George Orwell", 1945);
        Livro livro8 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro9 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937);
        Livro livro10 = new Livro("Fundação", "Isaac Asimov", 1951);

        adicionarRecomendacao(livro1, livro2);
        adicionarRecomendacao(livro1, livro3);
        adicionarRecomendacao(livro2, livro3);
        adicionarRecomendacao(livro4, livro5);
        adicionarRecomendacao(livro6, livro7);
        adicionarRecomendacao(livro8, livro9);
        adicionarRecomendacao(livro1, livro6);
        adicionarRecomendacao(livro4, livro10);
        adicionarRecomendacao(livro6, livro10);
        adicionarRecomendacao(livro8, livro10);
    }
}