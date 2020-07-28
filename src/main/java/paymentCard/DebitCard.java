package paymentCard;

public class DebitCard extends PaymentCard{

  private int sortCode;
  private int accountNumber;

  public DebitCard(long cardNumber, String expiryDate, int securityNumber, int sortCode, int accountNumber) {
    super(cardNumber, expiryDate, securityNumber);
    this.sortCode = sortCode;
    this.accountNumber = accountNumber;
  }


  public int getSortCode() {
    return this.sortCode;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public double getTransactionCost(double purchaseAmount) {
    return purchaseAmount * 0.01;
  }
}
