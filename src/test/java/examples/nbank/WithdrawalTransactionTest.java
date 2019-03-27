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
 * Parasoft Jtest UTA: Test class for WithdrawalTransaction
 *
 * @see examples.nbank.WithdrawalTransaction
 * @author gtrofimov
 */
public class WithdrawalTransactionTest {

	/**
	 * Parasoft Jtest UTA: Test for apply(Account)
	 *
	 * @see examples.nbank.WithdrawalTransaction#apply(Account)
	 * @author gtrofimov
	 */
	@Test
	public void testApply() throws Throwable {
		// Given
		int amount = 0; // UTA: default value
		WithdrawalTransaction underTest = new WithdrawalTransaction(amount);

		// When
		Account account = mockAccount();
		boolean result = underTest.apply(account);

		// Then
		// assertFalse(result);
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Account
	 */
	private static Account mockAccount() throws Throwable {
		Account account = mock(Account.class);
		int getBalanceResult = 0; // UTA: default value
		when(account.getBalance()).thenReturn(getBalanceResult);
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
		WithdrawalTransaction underTest = new WithdrawalTransaction(amount);

		// When
		int result = underTest.fee();

		// Then
		// assertEquals(0, result);
	}
}