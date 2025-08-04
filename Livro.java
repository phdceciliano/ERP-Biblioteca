import java.util.Objects;
//classe atributo
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    //construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    //get
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    //metodos herdados de java.lang.object
    @Override
    public String toString() {
        return titulo + " ("+ autor +", "+anoPublicacao+")";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return anoPublicacao == livro.anoPublicacao &&
                Objects.equals(titulo, livro.titulo) &&
                Objects.equals(autor, livro.autor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, anoPublicacao);
    }
}