/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Customer
 *
 * @see examples.nbank.Customer
 * @author gtrofimov
 */
public class CustomerTest {

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see examples.nbank.Customer#equals(Object)
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testEquals() throws Throwable {
		// Given
		Customer underTest = NbankFactory.createCustomer();

		// When
		Object o = new Object(); // UTA: default value
		boolean result = underTest.equals(o);

		// Then
		// assertFalse(result);
	}

	/**
	 * Parasoft Jtest UTA: Test for getName()
	 *
	 * @see examples.nbank.Customer#getName()
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testGetName() throws Throwable {
		// Given
		Customer underTest = NbankFactory.createCustomer();

		// When
		String result = underTest.getName();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for getSSN()
	 *
	 * @see examples.nbank.Customer#getSSN()
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testGetSSN() throws Throwable {
		// Given
		Customer underTest = NbankFactory.createCustomer();

		// When
		String result = underTest.getSSN();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for hashCode()
	 *
	 * @see examples.nbank.Customer#hashCode()
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testHashCode() throws Throwable {
		// Given
		Customer underTest = NbankFactory.createCustomer();

		// When
		int result = underTest.hashCode();

		// Then
		// assertEquals(0, result);
	}

	/**
	 * Parasoft Jtest UTA: Test for loadCustomer()
	 *
	 * @see examples.nbank.Customer#loadCustomer()
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testLoadCustomer() throws Throwable {
		// Given
		Customer underTest = NbankFactory.createCustomer();

		// When
		boolean result = underTest.loadCustomer();

		// Then
		// assertFalse(result);
	}

	/**
	 * Parasoft Jtest UTA: Test for main(String[])
	 *
	 * @see examples.nbank.Customer#main(String[])
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testMain() throws Throwable {
		// When
		String[] args = new java.lang.String[0]; // UTA: default value
		Customer.main(args);

	}

	/**
	 * Parasoft Jtest UTA: Test for setName(String)
	 *
	 * @see examples.nbank.Customer#setName(String)
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testSetName() throws Throwable {
		// Given
		Customer underTest = NbankFactory.createCustomer();

		// When
		String name = ""; // UTA: default value
		underTest.setName(name);

	}

	/**
	 * Parasoft Jtest UTA: Test for setSSN(String)
	 *
	 * @see examples.nbank.Customer#setSSN(String)
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testSetSSN() throws Throwable {
		// Given
		Customer underTest = NbankFactory.createCustomer();

		// When
		String ssn = ""; // UTA: default value
		underTest.setSSN(ssn);

	}

	/**
	 * Parasoft Jtest UTA: Test for toStrng()
	 *
	 * @see examples.nbank.Customer#toStrng()
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testToStrng() throws Throwable {
		// Given
		Customer underTest = NbankFactory.createCustomer();

		// When
		String result = underTest.toStrng();

		// Then
		// assertEquals("", result);
	}
}