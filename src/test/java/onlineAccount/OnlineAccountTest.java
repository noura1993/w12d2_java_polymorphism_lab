package onlineAccount;

import com.sun.tools.javac.util.List;
import org.junit.Before;
import org.junit.Test;
import paymentCard.CreditCard;
import paymentCard.DebitCard;
import paymentCard.GiftCard;

import java.util.Collections;

import static org.junit.Assert.*;

public class OnlineAccountTest {

    OnlineAccount onlineAccount;

    @Before
    public void before() {
        onlineAccount = new OnlineAccount("Zara.com");
    }

    @Test
    public void getName() {
        assertEquals("Zara.com", onlineAccount.getName());
    }

    @Test
    public void chargeCustomerWithCreditCard() {
        CreditCard creditCard = new CreditCard(123, "123", 123, 1000, 10);
        onlineAccount.chargeCustomer(100, creditCard);
        assertEquals(900, creditCard.getLimit(), 0.01);
        assertEquals(List.of(100.0), creditCard.getCharges());
        assertEquals(List.of(20.0), onlineAccount.getReportingSoftware().getTransactionCosts());
    }

    @Test
    public void chargeCustomerWithGiftCard() {
        GiftCard giftCard = new GiftCard("Zara", 500);
        onlineAccount.chargeCustomer(100, giftCard);
        assertEquals(400, giftCard.getBalance(), 0.01);
        assertEquals(Collections.emptyList(), onlineAccount.getReportingSoftware().getTransactionCosts());
    }
}