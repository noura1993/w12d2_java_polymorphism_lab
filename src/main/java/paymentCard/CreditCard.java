package paymentCard;

public class CreditCard extends PaymentCard{
    public CreditCard(long cardNumber, String expiryDate, int securityNumber, double transactionCostRate) {
        super(cardNumber, expiryDate, securityNumber, transactionCostRate);
    }
}

