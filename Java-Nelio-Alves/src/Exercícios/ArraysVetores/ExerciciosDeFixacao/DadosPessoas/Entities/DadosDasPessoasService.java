package ArraysVetores.ExerciciosDeFixacao.DadosPessoas.Entities;

import java.util.Scanner;

public class DadosDasPessoasService {
    
    public static int getQuantidadePessoas (Scanner sc) {
        System.out.print("Quantas pessoas serão digitadas? ");
        int qtdPessoasDigitadas = sc.nextInt();
        sc.nextLine();
        return qtdPessoasDigitadas;
    }
    
    public static DadosDasPessoas[] coletarDados(Scanner sc, int qtdPessoas) {
        DadosDasPessoas[] dadosPessoais = new DadosDasPessoas[qtdPessoas];

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.printf("Altura da %dª pessoa: ", i + 1);
            float altura = sc.nextFloat();
            sc.nextLine(); //Limpeza do buffer

            char genero;
            while (true) {
                System.out.printf("Gênero da %dª pessoa [M/F]: ", i + 1);
                try {
                    String generoInput = sc.nextLine().toUpperCase();;
                    if (generoInput.equals("M") || generoInput.equals("F")) {
                        genero = generoInput.charAt(0);
                        break;
                    } else {
                        throw new IllegalArgumentException("Gênero inválido: 'M' para Masculino e 'F' para Feminino");
                    }
                } catch (Exception e) {
                    System.out.print(e.getMessage());    
                } 
            }
            dadosPessoais[i] = new DadosDasPessoas(altura, genero);
        }
        return dadosPessoais;
    }

    public static float calcularMenorAltura(DadosDasPessoas[] dadosPessoais) {
        float menorAltura = Float.MAX_VALUE;

        for (DadosDasPessoas dadosDasPessoas : dadosPessoais) {
            if (dadosDasPessoas.getAltura() < menorAltura) {
                menorAltura = dadosDasPessoas.getAltura();
            }
        }

        return menorAltura;
    }

    public static float calcularMaiorAltura(DadosDasPessoas[] dadosPessoais) {
        float maiorAltura = Float.MIN_VALUE;

        for (DadosDasPessoas dadosDasPessoas : dadosPessoais) {
            if (dadosDasPessoas.getAltura() > maiorAltura) {
                maiorAltura = dadosDasPessoas.getAltura();
            }
        }

        return maiorAltura;
    }

    public static int calcularQuantidadeDeHomens(DadosDasPessoas[] dadosPessoais) {
        int quantidadeHomens = 0;

        for (DadosDasPessoas dadosDasPessoas : dadosPessoais) {
            if (dadosDasPessoas.getGenero() == 'M') {
                quantidadeHomens++;
            }
        }

        return quantidadeHomens;
    }

    public static int calcularQuantidadeMulheres(DadosDasPessoas[] dadosPessoais) {
        int quantidadeMulheres = 0;

        for (DadosDasPessoas dadosDasPessoas : dadosPessoais) {
            if (dadosDasPessoas.getGenero() == 'F') {
                quantidadeMulheres++;
            }
        }

        return quantidadeMulheres;
    }
}
