package paymentCard;

public class CreditCard extends PaymentCard{
    private double limit;
    private final double riskMultiplier;

    public CreditCard(long cardNumber, String expiryDate, int securityNumber, double limit, double riskMultiplier) {
        super(cardNumber, expiryDate, securityNumber);
        this.limit = limit;
        this.riskMultiplier = riskMultiplier;
    }

    public double getLimit() {
        return limit;
    }

    public double getTransactionCost(double purchaseAmount) {
        return purchaseAmount * 0.02 * riskMultiplier;
    }

    @Override
    public void charge(double purchaseAmount) {
        this.limit -= purchaseAmount;
        super.charge(purchaseAmount);
    }
}

