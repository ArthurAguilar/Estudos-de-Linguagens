package Aulas.EstruturasRepetitivas.exercises;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o final do loop: ");
        int finalLoop = sc.nextInt();

        if (finalLoop >= 0 && finalLoop <= 1000) {
            for (int i = 0; i <= finalLoop; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }    
        }       

        sc.close();
    }
}
