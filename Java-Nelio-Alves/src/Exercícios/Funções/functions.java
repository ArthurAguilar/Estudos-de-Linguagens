package Exercícios.Funções;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite três números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int maiorValor = max(n1, n2, n3);
        mostrarResultado(maiorValor);
        
        sc.close();
    }

    public static int max(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c) ? b : c;
    }

    public static void mostrarResultado(int resultado) {
        System.out.printf("O maior valor digitado foi: %s", resultado);
    }
}
