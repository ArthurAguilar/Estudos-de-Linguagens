package ArraysVetores.ExerciciosDeFixacao.DadosPessoas;


import java.util.Locale;
import java.util.Scanner;

import ArraysVetores.ExerciciosDeFixacao.DadosPessoas.Entities.DadosDasPessoasService;
import ArraysVetores.ExerciciosDeFixacao.DadosPessoas.Entities.DadosDasPessoas;

public class DadosPessoasApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Quantas pessoas serão digitadas? ");
        int qtdPessoas = sc.nextInt();
        sc.nextLine();

        DadosDasPessoasService.coletarDados(sc, qtdPessoas);

        System.out.printf("Menor altura: ", DadosDasPessoasService.calcularMenorAltura(null));


        
        
        sc.close();
    }
}
