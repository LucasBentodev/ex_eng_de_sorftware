package entities;
import java.util.ArrayList;
import java.util.List;

public class Postagem {
    private String titulo;
    private String texto;
    private String imagem;
    private List<Comentarios> comentarios = new ArrayList<>();

    public Postagem(String titulo, String texto, String imagem) {
        this.titulo = titulo;
        this.texto = texto;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentarios> comentarios) {
        this.comentarios = comentarios;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Postagem [");
        sb.append("Título: ").append(titulo).append(", ");
        sb.append("Texto: ").append(texto).append(", ");
        sb.append("Imagem: ").append(imagem).append(", ");
        sb.append("Comentários: ").append(comentarios).append("]");
        return sb.toString();
    }
}
