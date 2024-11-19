package Aulas.UpDowncasting;

import Aulas.UpDowncasting.entities.BusinessAccount;
import Aulas.UpDowncasting.entities.SavingAccounts;
import Aulas.UpDowncasting.entities.Account;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(10, "Tuuzano", 1500);
        BusinessAccount bacc = new BusinessAccount(11, "Mandioca", 3000, 5000);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(12, "Renner", 4000, 10000);
        // Account acc3 = new SavingAccounts(13, "Gaby", 6000, .5);

        System.out.println("1º " + acc1);
        System.out.println("2º " + acc2);

        // DOWNCASTING

        BusinessAccount bacc1 = (BusinessAccount) acc2;
        // SavingAccounts sacc = new SavingAccounts(14, "Sofhia", 12000, .5);

        System.out.println("3º " + bacc1);

        if (acc instanceof Account) {
            System.out.println("É uma instância de Account!");
        } else {
            System.out.println("Não é uma Account!");
        }

        if (bacc1 instanceof BusinessAccount) {
            System.out.println("É uma instancia de Business Account!");
        } else {
            System.out.println("Não é uma Business Account!");
        }

        if (acc1 instanceof SavingAccounts) {
            System.out.println("É uma instancia de Saving Account!");
        } else {
            System.out.println("Não é uma Saving Account!");
        }

    }
}
