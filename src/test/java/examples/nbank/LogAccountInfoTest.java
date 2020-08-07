/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for LogAccountInfo
 *
 * @see examples.nbank.LogAccountInfo
 * @author gtrofimov
 */
public class LogAccountInfoTest {

	/**
	 * Parasoft Jtest UTA: Test for log(Account)
	 *
	 * @see examples.nbank.LogAccountInfo#log(Account)
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testLog() throws Throwable {
		// Given
		LogAccountInfo underTest = new LogAccountInfo();

		// When
		Customer customer = NbankFactory.createCustomer();
		Account account = NbankFactory.createAccount(customer);
		boolean result = underTest.log(account);

		// Then
		// assertFalse(result);
	}
}