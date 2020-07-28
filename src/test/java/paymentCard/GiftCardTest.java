package paymentCard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GiftCardTest {

    GiftCard giftCard;

    @Before
    public void before() {
        giftCard = new GiftCard("Zara", 200);
    }

    @Test
    public void getVendor() {
        assertEquals("Zara", giftCard.getVendor());
    }

    @Test
    public void getBalance() {
        assertEquals(200, giftCard.getBalance(), 0.01);
    }

    @Test
    public void getTransactionCost() {
        assertEquals(0, giftCard.getTransactionCost(50), 0.01);
    }

    @Test
    public void charge() {
        giftCard.charge(100);
        assertEquals(100, giftCard.getBalance(), 0.01);
    }
}