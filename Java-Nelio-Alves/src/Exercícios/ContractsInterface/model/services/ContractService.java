package ContractsInterface.model.services;

import java.time.LocalDate;

import ContractsInterface.model.entities.Contract;
import ContractsInterface.model.entities.Installment;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

	public void processContract(Contract contract, int months) {
        double installmentValue = contract.getTotalValue() / months;
        
        for (int i = 0; i < months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double fee = onlinePaymentService.interest(installmentValue, i);
            double interest = onlinePaymentService.paymentFee(fee + installmentValue);

            double installmentTotalValue = installmentValue + fee + interest;

            contract.getInstallment().add(new Installment(dueDate, installmentTotalValue));
        }
    }
}
