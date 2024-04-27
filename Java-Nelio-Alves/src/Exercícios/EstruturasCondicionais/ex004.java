package Exercícios.EstruturasCondicionais;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int duracao;

        System.out.print("Digite a hora inicial: ");
        int horaInicial = sc.nextInt();
        System.out.print("Digite a hora final: ");
        int horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou: " + duracao);

        sc.close();
    }
}