import java.util.LinkedList;

public class Biblioteca {
    private LinkedList<Livro> livros;

    public Biblioteca() {
        livros = new LinkedList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public boolean removerLivro(Livro livro) {
        return livros.remove(livro);
    }

    public Livro buscarPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public LinkedList<Livro> listarLivros() {
        return new LinkedList<>(livros);
    }

    public LinkedList<Livro> buscarPorAutor(String autor) {
        LinkedList<Livro> resultado = new LinkedList<>();
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }

    public LinkedList<Livro> buscarPorAno(int ano) {
        LinkedList<Livro> resultado = new LinkedList<>();
        for (Livro livro : livros) {
            if (livro.getAnoPublicacao() == ano) {
                resultado.add(livro);
            }
        }
        return resultado;
    }
}