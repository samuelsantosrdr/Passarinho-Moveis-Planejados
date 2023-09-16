package cliente;

public class Cliente {
    private String nome, endereco, nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Cliente(String nome, String endereco, String nascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.nascimento = nascimento;
    }

    public Cliente() {
    }
}
