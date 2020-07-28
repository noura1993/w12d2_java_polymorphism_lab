package paymentCard;

import paymentCard.IChargeable;

public class GiftCard implements IChargeable {
    public double getTransactionCost(double purchaseAmount) {
        return 0;
    }

    public void charge(double purchaseAmount) {

    }
}
