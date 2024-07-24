package Aulas.EstruturasCondicionais;
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("POSITIVO!");
        } else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
