package onlineAccount;

import java.util.ArrayList;

public class ReportingSoftware {

    private ArrayList<Double> transactionCosts;

    public ReportingSoftware() {
        this.transactionCosts = new ArrayList<Double>();
    }

    public void addTransactionCost(double charge) {
        this.transactionCosts.add(charge);
    }

    public ArrayList<Double> getTransactionCosts() {
        return this.transactionCosts;
    }
}
