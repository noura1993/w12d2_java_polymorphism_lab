package paymentCard;

public interface ICharge {
    double getTransactionCost(double purchaseAmount);
    void charge(double purchaseAmount);
}
