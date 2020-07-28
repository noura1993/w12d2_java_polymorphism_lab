package paymentCard;

import java.util.ArrayList;

public abstract class PaymentCard implements IChargeable {

    private long cardNumber;
    private String expiryDate;
    private int securityNumber;
    private ArrayList<Double> charges;
    private double transactionCostRate;

    public PaymentCard(long cardNumber, String expiryDate, int securityNumber, double transactionCostRate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.charges = new ArrayList<Double>();
        this.transactionCostRate = transactionCostRate;
    }

    public long getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public int getSecurityNumber() {
        return this.securityNumber;
    }

    public double getTransactionCost(double purchaseAmount) {
        return purchaseAmount * this.transactionCostRate;
    }

    public ArrayList<Double> getCharges() {
        return charges;
    }

    public void charge(double purchaseAmount) {
        this.charges.add(purchaseAmount);
    }
}
