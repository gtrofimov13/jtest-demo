/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for BankState
 *
 * @see examples.nbank.BankState
 * @author gtrofimov
 */
public class BankStateTest {

	/**
	 * Parasoft Jtest UTA: Test for endMaintenance()
	 *
	 * @see examples.nbank.BankState#endMaintenance()
	 * @author gtrofimov
	 */
	@Test
	public void testEndMaintenance() throws Throwable {
		// When
		BankState.endMaintenance();

	}

	/**
	 * Parasoft Jtest UTA: Test for isMaintenanceMode()
	 *
	 * @see examples.nbank.BankState#isMaintenanceMode()
	 * @author gtrofimov
	 */
	@Test
	public void testIsMaintenanceMode() throws Throwable {
		// When
		Boolean result = BankState.isMaintenanceMode();

		// Then
		// assertFalse(result);
	}

	/**
	 * Parasoft Jtest UTA: Test for startMaintenance()
	 *
	 * @see examples.nbank.BankState#startMaintenance()
	 * @author gtrofimov
	 */
	@Test
	public void testStartMaintenance() throws Throwable {
		// When
		BankState.startMaintenance();

	}
}