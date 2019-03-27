/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for DepositTransaction
 *
 * @see examples.nbank.DepositTransaction
 * @author gtrofimov
 */
public class DepositTransactionTest {

	/**
	 * Parasoft Jtest UTA: Test for apply(Account)
	 *
	 * @see examples.nbank.DepositTransaction#apply(Account)
	 * @author gtrofimov
	 */
	@Test
	public void testApply() throws Throwable {
		// Given
		int amount = 0; // UTA: default value
		DepositTransaction underTest = new DepositTransaction(amount);

		// When
		Account account = mockAccount();
		boolean result = underTest.apply(account);

		// Then
		// assertFalse(result);
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Customer
	 */
	private static Customer mockCustomer() throws Throwable {
		Customer getCustomerResult = mock(Customer.class);
		String getNameResult = ""; // UTA: default value
		when(getCustomerResult.getName()).thenReturn(getNameResult);
		return getCustomerResult;
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Account
	 */
	private static Account mockAccount() throws Throwable {
		Account account = mock(Account.class);
		int getBalanceResult = 0; // UTA: default value
		when(account.getBalance()).thenReturn(getBalanceResult);

		Customer getCustomerResult = mockCustomer();
		when(account.getCustomer()).thenReturn(getCustomerResult);
		return account;
	}

	/**
	 * Parasoft Jtest UTA: Test for fee()
	 *
	 * @see examples.nbank.AbstractTransaction#fee()
	 * @author gtrofimov
	 */
	@Test
	public void testFee() throws Throwable {
		// Given
		int amount = 0; // UTA: default value
		DepositTransaction underTest = new DepositTransaction(amount);

		// When
		int result = underTest.fee();

		// Then
		// assertEquals(0, result);
	}
}