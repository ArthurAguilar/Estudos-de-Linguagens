package Aulas.Matriz;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Criando a matriz
        System.out.print("Digite a qtd de linhas da matriz: ");
        int linhaMatriz = sc.nextInt();
        System.out.print("Digite a qtd de colunas da matriz: ");
        int colunaMatriz = sc.nextInt();
        int[][] matriz = new int[linhaMatriz][colunaMatriz];
        int totalNumNegativos = 0;

        // Valorando a matriz
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("Posição %d x %d: ", i, j);
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] < 0) {
                    totalNumNegativos += 1;
                }
            }
        }

        // Imprimindo a matriz completa
        System.out.println();
        System.out.println("Matriz completa: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Imprimindo a diagonal da matriz
        System.out.println();
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        //Imprimindo os valores negativos da matriz
        System.out.printf("\nNúmeros negativos: %d", totalNumNegativos);

        sc.close();
    }
}
