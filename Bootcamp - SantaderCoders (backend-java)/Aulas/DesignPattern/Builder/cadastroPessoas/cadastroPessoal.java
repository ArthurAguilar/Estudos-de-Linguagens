package Aulas.DesignPattern.Builder.cadastroPessoas;

public class cadastroPessoal {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Arthur", "Guido", "Tuuzão", 26);  
        System.out.println(pessoa1);
        
        Pessoa pessoa2 = new PessoaBuilder()
                                .apelido("Mandoca")
                                .idade(24)
                                .nome("Amanda")
                                .sobrenome("Rosa")
                                .build();
        System.out.println(pessoa2);
        
    }
}
