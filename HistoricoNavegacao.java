import java.util.Stack;

public class HistoricoNavegacao {
    private Stack<Livro> historico;

    public HistoricoNavegacao() {
        historico = new Stack<>();
    }

    public void adicionarAoHistorico(Livro livro) {
        historico.push(livro);
    }

    public Livro verUltimoLivro() {
        if (historico.empty()) {
            return null;
        }
        return historico.peek();
    }

    public Livro voltar() {
        if (historico.empty()) {
            return null;
        }
        return historico.pop();
    }

    public boolean estaVazio() {
        return historico.empty();
    }

    public Stack<Livro> getHistorico() {
        return (Stack<Livro>) historico.clone();
    }
}