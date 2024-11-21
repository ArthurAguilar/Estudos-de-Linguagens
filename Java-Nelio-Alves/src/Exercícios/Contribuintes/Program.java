package Contribuintes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Contribuintes.entities.Company;
import Contribuintes.entities.Individual;
import Contribuintes.entities.TaxPayer;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Locale.setDefault(Locale.US);

        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int taxPayers = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < taxPayers; i++) {
            System.out.printf("Tax Payer #%d Data: %n", i + 1);

            char type;
            while (true) {
                System.out.print("Individual or Company? (I / C): ");
                type = sc.nextLine().toUpperCase().charAt(0);

                if (type == 'I' || type == 'C') {
                    break;
                } else {
                    System.out.println("Erro! Tente novamente.");
                }
            }

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            sc.nextLine();

            if (type == 'I') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                sc.nextLine();

                taxPayerList.add(new Individual(name, anualIncome, healthExpenditures));
            } else if (type == 'C') {
                System.out.print("Number of employees: ");
                int numberOfEmployeer = sc.nextInt();
                sc.nextLine();

                taxPayerList.add(new Company(name, anualIncome, numberOfEmployeer));
            }
        }

        System.out.println("\nTaxes Paid: ");

        Double totalTaxes = 0.0;
        for (TaxPayer taxPayer : taxPayerList) {
            System.out.printf("%s: R$%.2f%n", taxPayer.getName(), taxPayer.tax());
            totalTaxes += taxPayer.tax();
        }

        System.out.printf("\nTotal taxed: %.2f", totalTaxes);

        sc.close();
    }
}
