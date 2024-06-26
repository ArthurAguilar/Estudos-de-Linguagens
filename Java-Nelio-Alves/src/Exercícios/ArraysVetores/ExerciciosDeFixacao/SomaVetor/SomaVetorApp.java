package ArraysVetores.ExerciciosDeFixacao.SomaVetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Quantos números serão digitados? ");
        int totalNumeros = sc.nextInt();
        double[] numero = new double[totalNumeros];
        double somaNumeros = 0;
        double mediaNumeros = 0;

        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Digite um número: ");
            numero[i] = sc.nextDouble();
            somaNumeros += numero[i];
        }

        for (double cadaNumero : numero) {
            System.out.print(cadaNumero + " - ");
        }
        
        mediaNumeros = somaNumeros / numero.length;
        System.out.printf("\nSoma dos números do vetor: %.2f", somaNumeros);
        System.out.printf("\nMedia dos números do vetor: %.2f", mediaNumeros);


        sc.close();
    }
}
