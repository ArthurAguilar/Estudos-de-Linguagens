package EstruturasSequenciais;

import java.util.Scanner;

public class testando {
    public static void main(String[] args) {
        System.out.println("Digite os números: ");

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.printf("Você digitou %s, %d e %f", x, y, z);
        sc.close()
    }
}
