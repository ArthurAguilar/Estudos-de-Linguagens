package ArraysVetores.DesafioVetor.Entities;

import java.util.Scanner;

public class Pensionado {
    private String nome;
    private String email;
    
    public Pensionado(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //###############################################################//#endregion

    public static int getNumEstudantes(Scanner sc) {
        System.out.print("Quantos estudantes vão alugar quartos? ");
        int numEstudantes = sc.nextInt();
        sc.nextLine();
        return numEstudantes;
    }

    public static Pensionado[] alugarQuarto(Scanner sc, int numEstudantes) {
        Pensionado[] dadosPensionado = new Pensionado[10];

        for (int i = 0; i < numEstudantes; i++) {
            System.out.println("Aluguel #" + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Número do quarto desejado [0 - 9]: ");
            int numQuartoDesejado = sc.nextInt();
            sc.nextLine();

            dadosPensionado[numQuartoDesejado] = new Pensionado(nome, email);
        }
        return dadosPensionado;
    }

    public static void mostrarRelatorio(Pensionado[] quartosAlugados) {
        System.out.println("\n\nRelatório Completo dos Quartos: ");
        for (int i = 0; i < quartosAlugados.length; i++) {
            if (quartosAlugados[i] != null) {
                System.out.println("-----------------------------");
                System.out.printf("Quarto: %d%n", i);
                System.out.printf("Nome: %s%n", quartosAlugados[i].getNome());
                System.out.printf("Email: %s%n", quartosAlugados[i].getEmail());
            }
        }
    }
}

