package paymentCard;

import com.sun.tools.javac.util.List;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardTest {

    PaymentCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard(9567932, "11/20", 555, 5000, 5);
    }

    @Test
    public void getCardNumber() {
        assertEquals(9567932, creditCard.getCardNumber());
    }

    @Test
    public void getExpiryDate() {
        assertEquals("11/20", creditCard.getExpiryDate());
    }

    @Test
    public void getSecurityNumber() {
        assertEquals(555, creditCard.getSecurityNumber());
    }

    @Test
    public void getTransactionCost() {
        assertEquals(10, creditCard.getTransactionCost(100), 0.01);
    }

    @Test
    public void charge() {
        creditCard.charge(100);
        assertEquals(4900.0, ((CreditCard) creditCard).getLimit(), 0.01);
        assertEquals(List.of(100.0), creditCard.getCharges());
    }
}