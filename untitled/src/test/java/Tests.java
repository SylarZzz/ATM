import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Tests {
    private Account account;

    @Before
    public void setUp() {
        account = new Account(123, "User001", 1000.00); // Assuming these are the params
    }

    @Test
    public void testDeposit() {
        account.deposit(500);
        assertEquals(1500.00, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        boolean result = account.withdraw(300);
        assertTrue(result);
        assertEquals(700.00, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        boolean result = account.withdraw(1200);
        assertFalse(result);
        assertEquals(1000.00, account.getBalance(), 0.001); // Balance should not change
    }

    @Test
    public void testGetBalance() {
        assertEquals(1000.00, account.getBalance(), 0.001);
    }
}
