package ArraysVetores.ExerciciosDeFixacao.Aprovados;

import java.util.Locale;
import java.util.Scanner;

import ArraysVetores.ExerciciosDeFixacao.Aprovados.Entities.Boletim;

public class AprovadosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Quantos alunos serão digitados? ");
        int qtdAlunos = sc.nextInt();
        sc.nextLine();

        Boletim[] boletimAluno = new Boletim[qtdAlunos];
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            System.out.print("Digite a 1ª nota do aluno: ");
            float primeiraNota = sc.nextFloat();
            System.out.print("Digite a 2ª nota do aluno: ");
            float segundaNota = sc.nextFloat();
            sc.nextLine();
            boletimAluno[i] = new Boletim(nome, primeiraNota, segundaNota);
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < boletimAluno.length; i++) {
            if (boletimAluno[i].getMediaAnual() >= 6) {
                System.out.println(boletimAluno[i].getNome());
            }
        }
        
        sc.close();
    }
}
