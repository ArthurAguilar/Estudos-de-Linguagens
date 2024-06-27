package ArraysVetores.ExerciciosDeFixacao.MediaPares;

import java.util.Locale;
import java.util.Scanner;

public class MediaParesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtdEle = sc.nextInt();
        sc.nextLine();
        
        int[] numPar = new int[qtdEle];
        int qtdPares = 0;
        float somaPares = 0;

        for (int i = 0; i < qtdEle; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            numPar[i] = sc.nextInt();
            sc.nextLine();
            if(numPar[i] % 2 == 0) {
                somaPares += numPar[i];
                qtdPares++;
            }
        }

        float mediaPares;

        if (somaPares > 0) {
            mediaPares = somaPares / qtdPares;
            System.out.printf("Média dos valores PARES: %.1f", mediaPares);
        } else {
            System.out.println("Nenhum valor par");
        }


        sc.close();
    }
}
