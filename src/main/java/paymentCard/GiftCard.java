package paymentCard;

public class GiftCard implements ICharge {

    private String vendor;
    private double balance;

    public GiftCard(String vendor, double balance) {
        this.vendor = vendor;
        this.balance = balance;
    }

    public String getVendor() {
        return this.vendor;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getTransactionCost(double purchaseAmount) {
        return 0;
    }

    public void charge(double purchaseAmount) {
        this.balance -= purchaseAmount;
    }
}
