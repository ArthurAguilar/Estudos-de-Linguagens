package Aulas.Herança;

import Aulas.Herança.entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {

        BusinessAccount account1 = new BusinessAccount();

        account1.deposit(500);

        System.out.printf("%.2f", account1.getBalance());
    }
}
