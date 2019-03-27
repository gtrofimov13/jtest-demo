/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Account
 *
 * @see examples.nbank.Account
 * @author gtrofimov
 */
public class AccountTest {

	/**
	 * Parasoft Jtest UTA: Test for apply(ITransaction)
	 *
	 * @see examples.nbank.Account#apply(ITransaction)
	 * @author gtrofimov
	 */
	@Test
	public void testApply() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: default value
		Account underTest = new Account(customer, initial_balance);

		// When
		ITransaction transaction = mockITransaction();
		underTest.apply(transaction);

	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of ITransaction
	 */
	private static ITransaction mockITransaction() throws Throwable {
		ITransaction transaction = mock(ITransaction.class);
		boolean applyResult = false; // UTA: default value
		when(transaction.apply(nullable(Account.class))).thenReturn(applyResult);

		int feeResult = 0; // UTA: default value
		when(transaction.fee()).thenReturn(feeResult);
		return transaction;
	}

	/**
	 * Parasoft Jtest UTA: Test for getBalance()
	 *
	 * @see examples.nbank.Account#getBalance()
	 * @author gtrofimov
	 */
	@Test
	public void testGetBalance() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: default value
		Account underTest = new Account(customer, initial_balance);

		// When
		int result = underTest.getBalance();

		// Then
		// assertEquals(0, result);
	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer()
	 *
	 * @see examples.nbank.Account#getCustomer()
	 * @author gtrofimov
	 */
	@Test
	public void testGetCustomer() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: default value
		Account underTest = new Account(customer, initial_balance);

		// When
		Customer result = underTest.getCustomer();

		// Then
		// assertNotNull(result);
	}

	/**
	 * Parasoft Jtest UTA: Test for getID()
	 *
	 * @see examples.nbank.Account#getID()
	 * @author gtrofimov
	 */
	@Test
	public void testGetID() throws Throwable {
		// Given
		Customer customer = mockCustomer();
		int initial_balance = 0; // UTA: default value
		Account underTest = new Account(customer, initial_balance);

		// When
		String result = underTest.getID();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Customer
	 */
	private static Customer mockCustomer() throws Throwable {
		Customer customer = mock(Customer.class);
		String getSSNResult = ""; // UTA: default value
		when(customer.getSSN()).thenReturn(getSSNResult);
		return customer;
	}

	/**
	 * Parasoft Jtest UTA: Test for getStatus()
	 *
	 * @see examples.nbank.Account#getStatus()
	 * @author gtrofimov
	 */
	@Test
	public void testGetStatus() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: default value
		Account underTest = new Account(customer, initial_balance);

		// When
		String result = underTest.getStatus();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for isOverdrawn(int)
	 *
	 * @see examples.nbank.Account#isOverdrawn(int)
	 * @author gtrofimov
	 */
	@Test
	public void testIsOverdrawn() throws Throwable {
		// Given
		Customer customer = mockCustomer2();
		int initial_balance = 0; // UTA: default value
		Account underTest = new Account(customer, initial_balance);

		// When
		int balance = 0; // UTA: default value
		boolean result = underTest.isOverdrawn(balance);

		// Then
		// assertFalse(result);
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Customer
	 */
	private static Customer mockCustomer2() throws Throwable {
		Customer customer = mock(Customer.class);
		String getNameResult = ""; // UTA: default value
		when(customer.getName()).thenReturn(getNameResult);

		String getSSNResult = ""; // UTA: default value
		when(customer.getSSN()).thenReturn(getSSNResult);
		return customer;
	}

	/**
	 * Parasoft Jtest UTA: Test for setBalance(int)
	 *
	 * @see examples.nbank.Account#setBalance(int)
	 * @author gtrofimov
	 */
	@Test
	public void testSetBalance() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: default value
		Account underTest = new Account(customer, initial_balance);

		// When
		int balance = 0; // UTA: default value
		underTest.setBalance(balance);

	}
}