import java.util.*;
//class
public class RecomendacaoLivros {
    private Map<Livro, Set<Livro>> grafoRecomendacoes;

    public RecomendacaoLivros() {
        grafoRecomendacoes = new HashMap<>();
    }
    //metodo adicionar L.
    public void adicionarLivro(Livro livro) {
        grafoRecomendacoes.putIfAbsent(livro, new HashSet<>());
    }
    //metodo adicionar R.
    public void adicionarRecomendacao(Livro livro1, Livro livro2) {
        adicionarLivro(livro1);
        adicionarLivro(livro2);
        grafoRecomendacoes.get(livro1).add(livro2);
        grafoRecomendacoes.get(livro2).add(livro1);
    }
    //metodo introdução
    public Set<Livro> getRecomendacoes(Livro livro) {
        return grafoRecomendacoes.getOrDefault(livro, new HashSet<>());
    }
    //metodo
    public void popularGrafo() {
        // Livros de Machado de Assis
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        Livro livro3 = new Livro("O Alienista", "Machado de Assis", 1882);

        // Livros de Gabriel García Márquez
        Livro livro4 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        Livro livro5 = new Livro("Crônica de uma Morte Anunciada", "Gabriel García Márquez", 1981);

        // Livros de George Orwell
        Livro livro6 = new Livro("1984", "George Orwell", 1949);
        Livro livro7 = new Livro("A Revolução dos Bichos", "George Orwell", 1945);

        // Livros de J.R.R. Tolkien
        Livro livro8 = new Livro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 1954);
        Livro livro9 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937);
        Livro livro10 = new Livro("O Senhor dos Anéis: As Duas Torres", "J.R.R. Tolkien", 1954);


        // Adicionando recomendações (criando "arestas" no grafo)

        // Recomendações entre livros dos mesmos autores
        adicionarRecomendacao(livro1, livro2);//Machado de Assis para baixo
        adicionarRecomendacao(livro1, livro3);
        adicionarRecomendacao(livro2, livro3);
        adicionarRecomendacao(livro4, livro5);//Gabriel García Márquez
        adicionarRecomendacao(livro6, livro7);//George Orwell
        adicionarRecomendacao(livro8, livro9);//J.R.R. Tolkien para baixo
        adicionarRecomendacao(livro8, livro10);
        adicionarRecomendacao(livro9, livro10);

        // Recomendações baseadas nos temas dos livros
        adicionarRecomendacao(livro1, livro6);  // Crítica social
        adicionarRecomendacao(livro4, livro1);  // Narrativa complexa
        adicionarRecomendacao(livro8, livro9);  // Fantasía
        adicionarRecomendacao(livro9, livro10); // Fantasía
        adicionarRecomendacao(livro8, livro10); // Fantasía

    }

    // exibir recomendação metodo
    public void mostrarRecomendacoes(Livro livro) {
        System.out.println("Recomendações para '" + livro.getTitulo() + "':");
        getRecomendacoes(livro).forEach(l ->
                System.out.println("- " + l.getTitulo() + " (" + l.getAutor() + ")"));
    }
    //metodo djikstra
    public Map<Livro, Integer> djikstraSimples(Livro origem) {
        Map<Livro, Integer> distancias = new HashMap<>();
        Queue<Livro> fila = new LinkedList<>();

        distancias.put(origem, 0);
        fila.add(origem);

        while (!fila.isEmpty()) {
            Livro atual = fila.poll();
            int distanciaAtual = distancias.get(atual);

            for (Livro vizinho : grafoRecomendacoes.getOrDefault(atual, new HashSet<>())) {
                if (!distancias.containsKey(vizinho)) {
                    distancias.put(vizinho, distanciaAtual + 1);
                    fila.add(vizinho);
                }
            }
        }

        return distancias;
    }
    //metodo projetar
    public void CaminhosProximos(Livro origem) {
        Map<Livro, Integer> distancias = djikstraSimples(origem);

        System.out.println("\nCaminhos próximos a seguir '" + origem.getTitulo() + "':");
        distancias.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> {
                    if (!entry.getKey().equals(origem)) {
                        System.out.println("- " + entry.getKey().getTitulo() + " (Distância: " + entry.getValue() + ")");
                    }
                });
    }

}