package Aulas.EstruturasCondicionais;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();
        int z = sc.nextInt();

        if (x % z == 0 || z % x == 0) {
            System.out.println("São múltiplos!");
        } else {
            System.out.println("Não são múltiplos!");
        }
        sc.close();
    }
}