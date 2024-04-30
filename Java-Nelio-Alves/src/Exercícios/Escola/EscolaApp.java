package Exercícios.Escola;
import java.util.Scanner;
import Exercícios.Escola.entities.Notas;

public class EscolaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Notas notas = new Notas();

        System.out.print("Digite o nome do aluno: ");
        notas.nome = sc.nextLine();

        do {
            System.out.print("Digite a nota do 1º trimestre: ");
            notas.primeiraNota = sc.nextDouble();
            if (notas.primeiraNota > 30) {
                System.out.print("Erro: Digite um número ATÉ 30\n");
            }
        } while (notas.primeiraNota > 30);
        
        do {
            System.out.print("Digite a nota do 2º trimestre: ");
            notas.segundaNota = sc.nextDouble();
            if (notas.segundaNota > 35) {
                System.out.print("Erro: Digite um número ATÉ 35\n");
            }
        } while (notas.segundaNota > 35);

        do {
            System.out.print("Digite a nota do 3º trimestre: ");
            notas.terceiraNota = sc.nextDouble();
            if (notas.terceiraNota > 35) {
                System.out.print("Erro: Digite um número ATÉ 35\n");
            }
        } while (notas.terceiraNota > 35);
        
        System.out.print(notas.calcularNotas());
        sc.close();
    }
}
