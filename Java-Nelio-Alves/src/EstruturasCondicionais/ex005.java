package EstruturasCondicionais;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo consumido em minutos: ");
        int minutos = sc.nextInt();
        double conta = 50;

        if (minutos > 100) {
            conta += (minutos - 100) * 2;
        }

        System.out.printf("Valor final: R$%.2f", conta);
        sc.close();
    }
}