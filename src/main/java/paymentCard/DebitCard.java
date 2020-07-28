package paymentCard;

public class DebitCard extends PaymentCard{

  private int sortCode;
  private int accountNumber;

  public DebitCard(long cardNumber, String expiryDate, int securityNumber, int sortCode, int accountNumber) {
    super(cardNumber, expiryDate, securityNumber, 0.01);
    this.sortCode = sortCode;
    this.accountNumber = accountNumber;
  }


  public int getSortCode() {
    return this.sortCode;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }
}
