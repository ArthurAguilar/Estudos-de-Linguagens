package Aulas.EstruturasRepetitivas.exercises;
import java.util.Scanner;
public class ex03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do loop: ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int x = sc.nextInt();

            if (x < 10 || x > 20) {
                out += 1;
            } else {
                in += 1;
            }
        }
        
        System.out.printf("%d in", in);
        System.out.printf("%d out", out);

        sc.close();
    }

}
