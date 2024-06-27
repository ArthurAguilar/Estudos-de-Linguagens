package ArraysVetores.ExerciciosDeFixacao.SomaVetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetoresApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Quantos valores vai ter cada vetor? ");
        int qtdNum = sc.nextInt();
        sc.nextLine();

        int[] vetorA = new int[qtdNum];
        int[] vetorB = new int[qtdNum];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Digite o %dº valor do vetor A:", (i+1));
            vetorA[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("-#-#-#-#-#-#-#-#-#-#-#-#-#-#-");

        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("Digite o %dº valor do vetor B:", (i+1));
            vetorB[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Vetor Resultante: ");
        for (int i = 0; i < qtdNum; i++) {
            System.out.println(vetorA[i] +  vetorB[i]);
        }
        
        sc.close();
    }
}
