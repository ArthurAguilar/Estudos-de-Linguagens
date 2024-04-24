package Funções;
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int higher = max(x, y, z);
        showResults(higher);
        
        sc.close();
    }

    public static int max(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c) ? b : c;
    }

    public static void showResults(int higherValue) {
        System.out.print("O maior valor é: " + higherValue);
    }
}
