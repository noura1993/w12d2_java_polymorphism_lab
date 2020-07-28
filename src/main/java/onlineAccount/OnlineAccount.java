package onlineAccount;

import paymentCard.DebitCard;
import paymentCard.ICharge;

import java.util.ArrayList;

public class OnlineAccount {

    private String name;

    //    private ArrayList<ICharge> paymentMethods;

    private ReportingSoftware reportingSoftware;
    public OnlineAccount(String name) {
        this.name = name;
//        this.paymentMethods = new ArrayList<ICharge>();
        this.reportingSoftware = new ReportingSoftware();
    }

    public String getName() {
        return this.name;
    }

    public ReportingSoftware getReportingSoftware() {
        return reportingSoftware;
    }

    public void chargeCustomer(double purchaseAmount, ICharge chargeable) {
        chargeable.charge(purchaseAmount);
        if(chargeable.getTransactionCost(purchaseAmount) > 0) {
            this.reportingSoftware.addTransactionCost(chargeable.getTransactionCost(purchaseAmount));
        }
    }
}
