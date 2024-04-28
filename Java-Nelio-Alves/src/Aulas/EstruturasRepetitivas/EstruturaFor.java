package Aulas.EstruturasRepetitivas;
import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Digite a quantidade de loops desejado: ");
        int n = sc.nextInt();
        int soma = 0;
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.printf("A soma final é: %d", soma);

        sc.close();
    }
}
