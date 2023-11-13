package entities;
import java.util.ArrayList;
import java.util.List;

public class PostagemPremium extends Postagem{
    private String video;
    private List<Usuario> marcacao = new ArrayList<>();

    public PostagemPremium(String titulo, String texto, String imagem, String video, List<Usuario> marcacao) {
        super(titulo, texto, imagem);
        this.video = video;
        this.marcacao = marcacao;
    }
    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public List<Usuario> getMarcacao() {
        return marcacao;
    }

    public void setMarcacao(List<Usuario> marcacao) {
        this.marcacao = marcacao;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PostagemPremium [");
        sb.append("Título: ").append(getTitulo()).append(", ");
        sb.append("Texto: ").append(getTexto()).append(", ");
        sb.append("Imagem: ").append(getImagem()).append(", ");
        sb.append("Video: ").append(video).append(", ");
        sb.append("Marcação: ").append(marcacao).append("]");
        return sb.toString();
    }
}
