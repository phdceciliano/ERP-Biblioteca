import java.util.LinkedList;
// lista ligada
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

    //metodo buscar
    public Livro buscarPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
    //metodo listar
    public LinkedList<Livro> listarLivros() {
        return new LinkedList<>(livros);
    }

    //metodo buscar por autor
    public LinkedList<Livro> buscarPorAutor(String autor) {
        LinkedList<Livro> resultado = new LinkedList<>();
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }
    //metodo buscar por ano
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