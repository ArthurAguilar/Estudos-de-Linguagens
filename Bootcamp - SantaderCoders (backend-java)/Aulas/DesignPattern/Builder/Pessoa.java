package Aulas.DesignPattern.Builder;

public class Pessoa {
    String nome;
    String sobrenome;
    String apelido;
    int idade;

    public Pessoa(String nome, String sobrenome, String apelido, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.apelido = apelido;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + 
            ", sobrenome=" + sobrenome + 
            ", apelido=" + apelido + 
            ", idade=" + idade + "]";
    }
}
