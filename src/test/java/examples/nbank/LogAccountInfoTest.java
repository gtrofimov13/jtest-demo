/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertFalse;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;

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
	@Test
	public void testLog() throws Throwable {
		// Given
		LogAccountInfo underTest = new LogAccountInfo();

		// When
		Account account = mockAccount();
		boolean result = underTest.log(account);

		// Then
		// assertFalse(result);
	}

	/**
	 * Parasoft Jtest UTA: Helper method to generate and configure mock of Account
	 */
	private static Account mockAccount() throws Throwable {
		Account account = mock(Account.class);
		String getIDResult = ""; // UTA: default value
		when(account.getID()).thenReturn(getIDResult);
		return account;
	}
}