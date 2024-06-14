package Aulas.DesignPattern.Builder;

public class PessoaBuilder {
        String nome;
        String sobrenome;
        String apelido;
        int idade;
    

        public PessoaBuilder() {
        }
    
        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }
    
        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }
    
        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }
    
        public PessoaBuilder idade(int idade) {
            this.idade = idade;
            return this;
        }
    
        public Pessoa criarPessoa() {
            return new Pessoa(nome, sobrenome, apelido, idade);
        }
    }

