package ArraysVetores.ExerciciosDeFixacao.AbaixoDaMedia;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMediaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtdEle = sc.nextInt();
        sc.nextLine();

        float[] vetor = new float[qtdEle];
        float somaEle = 0;

        for (int i = 0; i < qtdEle; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = sc.nextFloat();
            somaEle += vetor[i];
        }

        float mediaVetor = somaEle / vetor.length;
        System.out.printf("Média do vetor: %.2f%n", mediaVetor);

        System.out.print("Elementos abaixo da média: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < mediaVetor) {
                System.out.print(vetor[i] + " ");
            }
        }

        
        sc.close();
    }
}
