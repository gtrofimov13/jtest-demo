/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
	@Test(timeout = 1000)
	public void testApply() throws Throwable {
		// Given
		Customer customer = NbankFactory.createCustomer();
		Account underTest = NbankFactory.createAccount(customer);

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
	@Test(timeout = 1000)
	public void testGetBalance() throws Throwable {
		// Given
		Customer customer = NbankFactory.createCustomer();
		Account underTest = NbankFactory.createAccount(customer);

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
	@Test(timeout = 1000)
	public void testGetCustomer() throws Throwable {
		// Given
		Customer customer = NbankFactory.createCustomer();
		Account underTest = NbankFactory.createAccount(customer);

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
	@Test(timeout = 1000)
	public void testGetID() throws Throwable {
		// Given
		Customer customer = NbankFactory.createCustomer();
		Account underTest = NbankFactory.createAccount(customer);

		// When
		String result = underTest.getID();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for getStatus()
	 *
	 * @see examples.nbank.Account#getStatus()
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testGetStatus() throws Throwable {
		// Given
		Customer customer = NbankFactory.createCustomer();
		Account underTest = NbankFactory.createAccount(customer);

		// When
		String result = underTest.getStatus();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for setBalance(int)
	 *
	 * @see examples.nbank.Account#setBalance(int)
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testSetBalance() throws Throwable {
		// Given
		Customer customer = NbankFactory.createCustomer();
		Account underTest = NbankFactory.createAccount(customer);

		// When
		int balance = 0; // UTA: default value
		underTest.setBalance(balance);

	}
}