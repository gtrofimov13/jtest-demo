/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
	@Test(timeout = 1000)
	public void testApply() throws Throwable {
		// Given
		int amount = 0; // UTA: default value
		WithdrawalTransaction underTest = new WithdrawalTransaction(amount);

		// When
		Customer customer = NbankFactory.createCustomer();
		Account account = NbankFactory.createAccount(customer);
		boolean result = underTest.apply(account);

		// Then
		// assertFalse(result);
	}

	/**
	 * Parasoft Jtest UTA: Test for fee()
	 *
	 * @see examples.nbank.AbstractTransaction#fee()
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
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