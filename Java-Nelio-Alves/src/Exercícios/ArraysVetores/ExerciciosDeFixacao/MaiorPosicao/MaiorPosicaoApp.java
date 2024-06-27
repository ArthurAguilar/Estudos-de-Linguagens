package ArraysVetores.ExerciciosDeFixacao.MaiorPosicao;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicaoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Quantos números serão digitados? ");
        int qtdNum = sc.nextInt();
        sc.nextLine();

        float[] numVect = new float[qtdNum];
        float maiorNum = 0;
        int posMaiorNum = 0;
        
        for (int i = 0; i < qtdNum; i++) {
            System.out.print("Digite um número: ");
            numVect[i] = sc.nextFloat();
            sc.nextLine();
            if (numVect[i] > maiorNum) {
                maiorNum = numVect[i];
                posMaiorNum = i;
            }
        }

        System.out.printf("Maior valor: %.1f%n", maiorNum);
        System.out.printf("Posição do maior valor: %d", posMaiorNum);
        
        sc.close();
    }
}
