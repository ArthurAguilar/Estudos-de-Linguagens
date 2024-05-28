package Banco2;

import java.util.Scanner;
import Banco2.entities.banking;

public class appBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        banking bank;
        
        System.out.print("Enter the account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter the account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit? [y/n]");
        String depositDecision = sc.nextLine();

        if (depositDecision.equals("s")) {
            System.out.print("Enter the initial deposit value: ");
            int initialDeposit = sc.nextInt();
            bank.showAccount();
        }



        
        
        sc.close();
    }
}
