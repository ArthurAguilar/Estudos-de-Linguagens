package Banco2;

import java.util.Scanner;
import Banco2.entities.banking;

public class appBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        banking bank;
        
        System.out.print("Enter the account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit? [y/n] ");
        String depositDecision = sc.nextLine();

        if (depositDecision.equals("y")) {
            System.out.print("\nEnter the initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bank = new banking(accountNumber, accountHolder, initialDeposit);
            bank.showAccount();
        } else {
            bank = new banking(accountNumber, accountHolder);
            bank.showAccount();
        }

        System.out.print("\nEnter a deposit value: ");
        double depositValue = sc.nextDouble();
        bank.depositMoney(depositValue);
        System.out.print("Updated ");
        bank.showAccount();

        System.out.print("\nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bank.withdrawMoney(withdrawValue);
        System.out.print("Updated ");
        bank.showAccount();        
        
        sc.close();
    }
}
