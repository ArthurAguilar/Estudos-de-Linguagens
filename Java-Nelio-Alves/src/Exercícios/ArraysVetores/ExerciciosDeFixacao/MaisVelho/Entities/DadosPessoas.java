package ArraysVetores.ExerciciosDeFixacao.MaisVelho.Entities;

public class DadosPessoas {
    private String nome;
    private int idade;

    public DadosPessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }
}
