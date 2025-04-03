import java.util.LinkedList;
import java.util.Queue;

public class ListaEspera {
    private Queue<String> filaEspera;

    public ListaEspera() {
        filaEspera = new LinkedList<>();
    }

    public void adicionarUsuario(String usuario) {
        filaEspera.add(usuario);
    }

    public String proximoUsuario() {
        return filaEspera.poll();
    }

    public boolean estaVazia() {
        return filaEspera.isEmpty();
    }

    public int tamanhoFila() {
        return filaEspera.size();
    }

    public Queue<String> getFila() {
        return new LinkedList<>(filaEspera);
    }
}