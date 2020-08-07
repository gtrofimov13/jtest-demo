/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Bank
 *
 * @see examples.nbank.Bank
 * @author gtrofimov
 */
public class BankTest {

	/**
	 * Parasoft Jtest UTA: Test for addAccount(Account)
	 *
	 * @see examples.nbank.Bank#addAccount(Account)
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testAddAccount() throws Throwable {
		// Given
		Bank underTest = new Bank();

		// When
		Customer customer = NbankFactory.createCustomer();
		Account account = NbankFactory.createAccount(customer);
		Boolean result = underTest.addAccount(account);

		// Then
		// assertFalse(result);
	}

	/**
	 * Parasoft Jtest UTA: Test for closeAccounts(List)
	 *
	 * @see examples.nbank.Bank#closeAccounts(List)
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testCloseAccounts() throws Throwable {
		// Given
		Bank underTest = new Bank();

		// When
		List list = new ArrayList(); // UTA: default value
		underTest.closeAccounts(list);

	}

	/**
	 * Parasoft Jtest UTA: Test for endMaintenance()
	 *
	 * @see examples.nbank.Bank#endMaintenance()
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testEndMaintenance() throws Throwable {
		// Given
		Bank underTest = new Bank();

		// When
		underTest.endMaintenance();

	}

	/**
	 * Parasoft Jtest UTA: Test for getAccount(String, String)
	 *
	 * @see examples.nbank.Bank#getAccount(String, String)
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testGetAccount() throws Throwable {
		// Given
		Bank underTest = new Bank();

		// When
		String id = ""; // UTA: default value
		String name = ""; // UTA: default value
		Account result = underTest.getAccount(id, name);

		// Then
		// assertNotNull(result);
	}

	/**
	 * Parasoft Jtest UTA: Test for isMaintenanceMode()
	 *
	 * @see examples.nbank.Bank#isMaintenanceMode()
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testIsMaintenanceMode() throws Throwable {
		// Given
		Bank underTest = new Bank();

		// When
		Boolean result = underTest.isMaintenanceMode();

		// Then
		// assertFalse(result);
	}

	/**
	 * Parasoft Jtest UTA: Test for setAccountsLimit(Integer)
	 *
	 * @see examples.nbank.Bank#setAccountsLimit(Integer)
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testSetAccountsLimit() throws Throwable {
		// When
		Integer limit = 0; // UTA: default value
		Bank.setAccountsLimit(limit);

	}

	/**
	 * Parasoft Jtest UTA: Test for startMaintenance()
	 *
	 * @see examples.nbank.Bank#startMaintenance()
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testStartMaintenance() throws Throwable {
		// Given
		Bank underTest = new Bank();

		// When
		underTest.startMaintenance();

	}
}