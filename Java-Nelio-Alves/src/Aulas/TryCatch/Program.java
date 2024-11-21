package Aulas.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] nameVect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(nameVect[position]);
        } catch (InputMismatchException e) {
            System.out.println("Input inválido!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida!");
        }

        System.out.println("Fim do programa...");

        sc.close();
    }
}
