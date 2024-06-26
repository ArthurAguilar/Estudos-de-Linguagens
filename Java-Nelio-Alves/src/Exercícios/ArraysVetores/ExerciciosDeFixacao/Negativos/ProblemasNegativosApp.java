package ArraysVetores.ExerciciosDeFixacao.Negativos;

import java.util.Scanner;

public class ProblemasNegativosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos números serão digitados? ");
        int totalNumeros = sc.nextInt();
        int[] vetorNumeros = new int[totalNumeros]; 

        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Digite um número: ");
            vetorNumeros[i] = sc.nextInt();
        }

        System.out.println("Números negativos: ");
        for (int i = 0; i < vetorNumeros.length; i++) {
            if(vetorNumeros[i] < 0) {
                System.out.println(vetorNumeros[i]);
            }
        }
        
        sc.close();
    }
}
