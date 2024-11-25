package ContractsInterface.model.services;

public class PaypalService implements OnlinePaymentService{
    private static final double INSTALLMENT_TAX = 0.01;
    private static final double PAYMENT_TAX = 0.02;    

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * INSTALLMENT_TAX * months;
    }
    @Override
    public Double paymentFee(Double amount) {
        return amount * PAYMENT_TAX;
    }
}
