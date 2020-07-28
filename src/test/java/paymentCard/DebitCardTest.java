package paymentCard;

import com.sun.tools.javac.util.List;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    PaymentCard debitCard;

    @Before
    public void before() {
        debitCard = new DebitCard(9567932, "11/20", 555, 659832, 897152648);
    }

    @Test
    public void getCardNumber() {
        assertEquals(9567932, debitCard.getCardNumber());
    }

    @Test
    public void getExpiryDate() {
        assertEquals("11/20", debitCard.getExpiryDate());
    }

    @Test
    public void getSecurityNumber() {
        assertEquals(555, debitCard.getSecurityNumber());
    }

    @Test
    public void getSortCode() {
        assertEquals(659832, ((DebitCard) debitCard).getSortCode());
    }

    @Test
    public void getAccountNumber() {
        assertEquals(897152648, ((DebitCard) debitCard).getAccountNumber());
    }

    @Test
    public void getTransactionCost() {
        assertEquals(10, debitCard.getTransactionCost(1000), 0.001);
    }

    @Test
    public void charge() {
        debitCard.charge(1000);
        assertEquals(List.of(1000.0), debitCard.getCharges());
    }
}