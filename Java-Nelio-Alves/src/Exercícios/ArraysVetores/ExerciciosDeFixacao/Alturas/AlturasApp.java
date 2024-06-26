package ArraysVetores.ExerciciosDeFixacao.Alturas;

import java.util.Locale;
import java.util.Scanner;

import ArraysVetores.ExerciciosDeFixacao.Alturas.Entities.DadosPessoa;


public class AlturasApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Quantas pessoas serão digitadas? ");
        int totalDigitado = sc.nextInt();
        sc.nextLine();
        DadosPessoa[] grupoPessoa = new DadosPessoa[totalDigitado];
        float somaAlturas = 0;
        float mediaAlturas = 0;

        //Adicionar dados no vetor.
        for (int i = 0; i < totalDigitado; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            float altura = sc.nextFloat();
            sc.nextLine();
            somaAlturas += altura;
            grupoPessoa[i] = new DadosPessoa(nome, idade, altura);
        }

        //Calcular média.
        mediaAlturas = somaAlturas / grupoPessoa.length;
        System.out.printf("A média das alturas é: %.2f%n", mediaAlturas);


        //Filtrar pessoas com menos de 16 anos.
        int pessoaMenos16 = 0;
        for (int i = 0; i < grupoPessoa.length; i++) {
            if (grupoPessoa[i].getIdade() < 16) {
                pessoaMenos16 += 1;
            }
        }
        float percentualMenores = ((float)pessoaMenos16 / totalDigitado) * 100;
        System.out.println("Porcentagem de pessoas com menos de 16 anos: " + percentualMenores);
        
        //Nomes das pessoas com -16 anos.
        System.out.println("Nome das pessoas com menos de 16 anos: ");
        for (int i = 0; i < grupoPessoa.length; i++) {
            if (grupoPessoa[i].getIdade() < 16) {
                System.out.println(grupoPessoa[i].getNome());
            }
        }
        

        
        sc.close();
    }
}
