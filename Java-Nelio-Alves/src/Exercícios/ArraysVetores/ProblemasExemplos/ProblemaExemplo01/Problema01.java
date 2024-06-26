package ArraysVetores.ProblemasExemplos.ProblemaExemplo01;

import java.util.Scanner;

public class Problema01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas que serão medidas: ");
        int qtdPessoas = sc.nextInt();
        double[] vetorPessoas = new double[qtdPessoas];

        double somaAlt = 0;
        for (int i = 0; i < qtdPessoas; i++) {
            System.out.print("Digite a altura da " + (i + 1) + " pessoa: ");
            vetorPessoas[i] = sc.nextDouble();
            somaAlt += vetorPessoas[i];
        }

        double mediaAlt = somaAlt / qtdPessoas;
        System.out.print(mediaAlt);

        sc.close();
    }
}
