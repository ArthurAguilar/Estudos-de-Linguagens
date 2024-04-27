package Exercícios.App001;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String nome = "Arthur";
        int idade = 25;
        double salario = 1200.553235;

        System.out.printf("Meu nome é %s e tenho %d anos. Atualmente meu salário é um big 0, mas vamos fingir que é R$%.2f! :D", nome, idade, salario);
    }

    public static class Main {
        public static void main(String[] args) {
            String nome = "Arthur";
            int idade = 25;

            System.out.printf("Meu nome é %s e tenho %d anos.", nome, idade);

        }
    }
}
