package ArraysVetores.ExerciciosDeFixacao.MaisVelho;

import java.util.Locale;
import java.util.Scanner;

import ArraysVetores.ExerciciosDeFixacao.MaisVelho.Entities.DadosPessoas;

public class MaisVelhoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Quantas pessoas serão digitadas? ");
        int qtdPessoas = sc.nextInt();
        sc.nextLine();

        DadosPessoas[] dadosPessoais = new DadosPessoas[qtdPessoas];
        int indexPessoaMaisVelha = 0;
        int idadePessoaMaisVelha = 0;
        for (int i = 0; i < qtdPessoas; i++) {
            System.out.printf("Digite os dados da %dª pessoa: %n", i + 1);
            System.out.print("Nome: ");
            String nomePessoa = sc.nextLine();
            System.out.print("Idade: ");
            int idadePessoa = sc.nextInt();
            sc.nextLine();
            dadosPessoais[i] = new DadosPessoas(nomePessoa, idadePessoa);
            if (idadePessoa > idadePessoaMaisVelha) {
                idadePessoaMaisVelha = idadePessoa;
                indexPessoaMaisVelha = i;
            }
        }

        System.out.println();
        for (DadosPessoas dadosPessoas : dadosPessoais) {
            System.out.print(dadosPessoas.getNome() + "-");
            System.out.println(dadosPessoas.getIdade());
        }

        System.out.println();
        System.out.println("Pessoa mais velha: " + dadosPessoais[indexPessoaMaisVelha].getNome());
        
        sc.close();
    }
}
