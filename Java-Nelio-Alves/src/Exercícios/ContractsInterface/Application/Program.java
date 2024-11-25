package ContractsInterface.Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import ContractsInterface.model.entities.Contract;
import ContractsInterface.model.entities.Installment;
import ContractsInterface.model.services.ContractService;
import ContractsInterface.model.services.PaypalService;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Número: ");
        int numContract = sc.nextInt();
        
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        Double totalValue = sc.nextDouble();

        Contract contract = new Contract(numContract, date, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int numInstallment = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, numInstallment);

        System.out.println("\nParcelas: ");
        for (Installment installment : contract.getInstallment()) {
            System.out.println("Parcela -> " + installment.getDueDate().format(fmt) + " - R$" + installment.getAmount());
        }

        sc.close();
    }
}
