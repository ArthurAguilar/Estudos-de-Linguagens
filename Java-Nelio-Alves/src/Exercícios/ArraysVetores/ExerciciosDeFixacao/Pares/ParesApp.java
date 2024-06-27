package ArraysVetores.ExerciciosDeFixacao.Pares;

import java.util.Locale;
import java.util.Scanner;

public class ParesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos números serão digitados: ");
        int qtdNum = sc.nextInt();
        sc.nextLine();

        int[] numVect = new int[qtdNum];

        for (int i = 0; i < qtdNum; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numVect[i] = sc.nextInt();
            sc.nextLine();
        }

        int qtdPares = 0;
        System.out.print("\nNúmeros pares: ");
        for (int i = 0; i < numVect.length; i++) {
            if (numVect[i] % 2 == 0) {
                System.out.print(numVect[i] + " ");
                qtdPares ++;
            }
        }
        
        System.out.println("\nQuantidade de pares: " + qtdPares);

        sc.close();
    }
}
