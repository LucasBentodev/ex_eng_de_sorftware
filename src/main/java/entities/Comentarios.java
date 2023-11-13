package entities;

public class Comentarios {
    private Usuario author;
    private String data;
    private  String mensagem;

    public Comentarios(Usuario author, String data, String mensagem) {
        this.author = author;
        this.data = data;
        this.mensagem = mensagem;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comentarios [");
        sb.append("Autor: ").append(author).append(", ");
        sb.append("Data: ").append(data).append(", ");
        sb.append("Mensagem: ").append(mensagem).append("]");
        return sb.toString();
    }
}
