package entities;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String email;
    private String senha;
    private Perfil perfil;
    private TipoDeConta tipoConta;
    private List<Postagem> postagens = new ArrayList<>();

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
        this.tipoConta = TipoDeConta.COMUM;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public List<Postagem> getPostagens() {
        return postagens;
    }

    public void setPostagens(List<Postagem> postagens) {
        this.postagens = postagens;
    }
    public TipoDeConta getTipoDeConta() {
        return tipoConta;
    }
    public void alteraTipoDeConta(){
        if (tipoConta.equals(TipoDeConta.COMUM)){
            this.tipoConta = TipoDeConta.PREMIUM;
        }
        else {
            throw new RuntimeException("Não é possível alterar o tipo premium ");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario [");
        sb.append("Email: ").append(email).append(", ");
        sb.append("Senha: ").append(senha).append(", ");
        return sb.toString();
    }
    public String toStringComplete() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario [");
        sb.append("Email: ").append(email).append(", ");
        sb.append("Senha: ").append(senha).append(", ");
        sb.append("Perfil: ").append(perfil).append(", ");
        sb.append("Tipo de Conta: ").append(tipoConta).append(", ");
        sb.append("Postagens: ").append(postagens).append("]");
        return sb.toString();
    }
}
