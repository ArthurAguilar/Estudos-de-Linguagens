package ProblemaMatriz;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Criando a matriz e variáveis
        System.out.print("Quantidade linhas: ");
        int qtdLinhas = sc.nextInt();
        System.out.print("Quantidade colunas: ");
        int qtdColunas = sc.nextInt();
        sc.nextLine();
        int[][] matriz = new int[qtdLinhas][qtdColunas];


        // Valorando a matriz
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Posição %d x %d: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }


        // Selecionando elemento
        System.out.println();
        System.out.print("Digite o valor que deseja consultar: ");
        int valorConsulta = sc.nextInt();

        // Imprimindo informações sobre o elemento
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (valorConsulta == matriz[i][j]) {
                    System.out.printf("Posição: %d, %d%n", i, j);

                    if (j > 0) {
                        System.out.printf("Valor esquerda: %d%n", matriz[i][j-1]);
                    } else {
                        System.out.println("Não há um elemento a esquerda.");
                    }

                    if (j < matriz.length -1) {
                        System.out.printf("Valor direita: %d%n", matriz[i][j+1]);
                    } else {
                        System.out.println("Não há um elemento a direita.");
                    }

                    if (i > 0) {
                        System.out.printf("Valor acima: %d%n", matriz[i-1][j]);
                    } else {
                        System.out.println("Não há um elemento acima.");
                    }

                    if (i < matriz.length -1) {
                        System.out.printf("Valor abaixo: %d%n", matriz[i+1][j]);
                    } else {
                        System.out.println("Não há um elemento abaixo.");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
