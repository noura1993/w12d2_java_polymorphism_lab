package paymentCard;

import java.util.ArrayList;

public abstract class PaymentCard implements IChargeable {

    private long cardNumber;
    private String expiryDate;
    private int securityNumber;
    private ArrayList<Double> charges;

    public PaymentCard(long cardNumber, String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.charges = new ArrayList<Double>();
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

    public ArrayList<Double> getCharges() {
        return charges;
    }

    public void charge(double purchaseAmount) {
        this.charges.add(purchaseAmount);
    }
}
