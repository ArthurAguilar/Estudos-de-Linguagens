package Aulas.EstruturasCondicionais;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("PAR!");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}