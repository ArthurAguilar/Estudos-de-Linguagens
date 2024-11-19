package Aulas.Sobreposicao;

import Aulas.Sobreposicao.entities.SavingAccounts;
import Aulas.Sobreposicao.entities.BusinessAccount;
import Aulas.Sobreposicao.entities.Account;

public class Program {
    public static void main(String[] args) {


        //Withdraw da classe Account (com taxa);
        Account acc1 = new Account(1, "Arthur", 1000);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        //Withdaw da classe SavingAccount (sem taxa);
        SavingAccounts acc2 = new SavingAccounts(2, "Amanda", 1000, 0.5);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());

        //Withdraw da classe BussinessAccount (com taxa) via Super:

        BusinessAccount acc3 = new BusinessAccount(3, "Tuuzano", 1000, 2000.00);
        acc3.withdraw(200);;
        System.out.println(acc3.getBalance());



    }
}
