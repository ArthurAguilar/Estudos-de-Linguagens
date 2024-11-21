package BankAccount;

import java.util.Scanner;

import BankAccount.model.entities.Account;
import BankAccount.model.exceptions.BusinessException;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holderName = sc.nextLine();
        System.out.print("Initial balance: ");
        Double initialBalance = sc.nextDouble();
        System.out.print("Withdraw Limit: ");
        Double withdrawLimit = sc.nextDouble();
        sc.nextLine();

        Account acc = new Account(number, holderName, initialBalance, withdrawLimit);

        System.out.print("\nEnter the amount for withdraw: ");
        Double withdrawAmount = sc.nextDouble();


        try {
            acc.withdraw(withdrawAmount);
            System.out.println(acc);
        } catch (BusinessException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("\nPrograma Finalizado!");
        }

        sc.close();
    }
}
