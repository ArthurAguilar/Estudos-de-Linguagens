package Conversao;
import java.util.Scanner;
import Conversao.Entities.ConversorMoedas;

public class appConversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual o preço do dolar? ");
        double precoDolar = sc.nextDouble();
        System.out.print("Quantos doláres você deseja comprar? ");
        double qtdDolar = sc.nextDouble();

        System.out.printf("Total a ser pago em REAIS: R$%.2f", ConversorMoedas.conversor(precoDolar, qtdDolar));
        
        sc.close();
    }
}
