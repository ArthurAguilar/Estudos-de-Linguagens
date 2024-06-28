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

        DadosDasPessoas[] dadosPessoais = DadosDasPessoasService.coletarDados(sc, qtdPessoas);

        float menorAltura = DadosDasPessoasService.calcularMenorAltura(dadosPessoais);
        System.out.printf("\nMenor altura: %.2f", menorAltura);     
        
        float maiorAltura = DadosDasPessoasService.calcularMaiorAltura(dadosPessoais);
        System.out.printf("\nMaior altura: %.2f", maiorAltura);

        int quantidadeHomens = DadosDasPessoasService.calcularQuantidadeDeHomens(dadosPessoais);
        System.out.printf("\nQuantidade de homens: %d", quantidadeHomens);

        int quantidadeMulheres = DadosDasPessoasService.calcularQuantidadeMulheres(dadosPessoais);
        System.out.printf("\nQuantidade de mulheres: %d", quantidadeMulheres);
        
        sc.close();
    }
}
