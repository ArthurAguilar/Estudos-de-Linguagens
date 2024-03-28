import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        int y;

        System.out.print("Digite o seu nome: ");
        x = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        y = sc.nextInt();
        sc.close();

        System.out.printf("Seu nome é %s e você tem %d anos. Prazer!", x, y);
    }
}
