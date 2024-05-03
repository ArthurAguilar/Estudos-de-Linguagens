package Banco;
import java.util.Scanner;
import Banco.entities.acoesBancarias;

public class AppBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        acoesBancarias banco;
        
        System.out.print("Digite o número da conta: ");
        int numConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do titular: ");
        String nomeTitular = sc.nextLine();
        System.out.print("Gostaria de realizar um depósito inicial? [S/N] ");
        String decisaoDepositoInicial = sc.nextLine();

        if (decisaoDepositoInicial.equals("s")) {
            System.out.print("Digite o valor desejado: ");
            double valorDepositoInicial = sc.nextDouble();
            banco = new acoesBancarias(numConta, nomeTitular, valorDepositoInicial);
            banco.mostrarConta();
        } else { 
            banco = new acoesBancarias(numConta, nomeTitular);
            banco.mostrarConta();
        }

        System.out.print("\nQual valor desejado para depósito? ");
        double deposito = sc.nextDouble();
        banco.depositarValor(deposito);
        banco.mostrarConta();

        System.out.print("\nQual valor desejado para saque? (R$5,00 de taxa) ");
        double saque = sc.nextDouble();
        banco.sacarValor(saque);
        banco.mostrarConta();

        sc.close();
    }
}
