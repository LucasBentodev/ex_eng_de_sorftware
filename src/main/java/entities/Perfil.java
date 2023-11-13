package entities;

public class Perfil {
    private String endereco;
    private String telefone;

    private Sexo sexo;
    private String dataDeNascimento;

    public Perfil(String endereco, String telefone, Sexo sexo, String dataDeNascimento) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
    }



    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Perfil [");
        sb.append("Endereço: ").append(endereco).append(", ");
        sb.append("Telefone: ").append(telefone).append(", ");
        sb.append("Sexo: ").append(sexo).append(", ");
        sb.append("Data de Nascimento: ").append(dataDeNascimento).append("]");
        return sb.toString();
    }
}
