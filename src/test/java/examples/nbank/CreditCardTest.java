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
 * Parasoft Jtest UTA: Test class for CreditCard
 *
 * @see examples.nbank.CreditCard
 * @author gtrofimov
 */
public class CreditCardTest {

	/**
	 * Parasoft Jtest UTA: Test for displayStatement()
	 *
	 * @see examples.nbank.CreditCard#displayStatement()
	 * @author gtrofimov
	 */
	@Test
	public void testDisplayStatement() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = ""; // UTA: default value
		String securityNumber = ""; // UTA: default value
		String name = ""; // UTA: default value
		String zipcode = ""; // UTA: default value
		String creditCardNumber = ""; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		underTest.displayStatement();

	}

	/**
	 * Parasoft Jtest UTA: Test for get_creditCardNumber()
	 *
	 * @see examples.nbank.CreditCard#get_creditCardNumber()
	 * @author gtrofimov
	 */
	@Test
	public void testGet_creditCardNumber() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = ""; // UTA: default value
		String securityNumber = ""; // UTA: default value
		String name = ""; // UTA: default value
		String zipcode = ""; // UTA: default value
		String creditCardNumber = ""; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String result = underTest.get_creditCardNumber();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for get_currentBalance()
	 *
	 * @see examples.nbank.CreditCard#get_currentBalance()
	 * @author gtrofimov
	 */
	@Test
	public void testGet_currentBalance() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = ""; // UTA: default value
		String securityNumber = ""; // UTA: default value
		String name = ""; // UTA: default value
		String zipcode = ""; // UTA: default value
		String creditCardNumber = ""; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		int result = underTest.get_currentBalance();

		// Then
		// assertEquals(0, result);
	}

	/**
	 * Parasoft Jtest UTA: Test for get_customerId()
	 *
	 * @see examples.nbank.CreditCard#get_customerId()
	 * @author gtrofimov
	 */
	@Test
	public void testGet_customerId() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = ""; // UTA: default value
		String securityNumber = ""; // UTA: default value
		String name = ""; // UTA: default value
		String zipcode = ""; // UTA: default value
		String creditCardNumber = ""; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String result = underTest.get_customerId();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for get_customerName()
	 *
	 * @see examples.nbank.CreditCard#get_customerName()
	 * @author gtrofimov
	 */
	@Test
	public void testGet_customerName() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = ""; // UTA: default value
		String securityNumber = ""; // UTA: default value
		String name = ""; // UTA: default value
		String zipcode = ""; // UTA: default value
		String creditCardNumber = ""; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String result = underTest.get_customerName();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for get_socialSecurityNumber()
	 *
	 * @see examples.nbank.CreditCard#get_socialSecurityNumber()
	 * @author gtrofimov
	 */
	@Test
	public void testGet_socialSecurityNumber() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = ""; // UTA: default value
		String securityNumber = ""; // UTA: default value
		String name = ""; // UTA: default value
		String zipcode = ""; // UTA: default value
		String creditCardNumber = ""; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String result = underTest.get_socialSecurityNumber();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for get_zipcode()
	 *
	 * @see examples.nbank.CreditCard#get_zipcode()
	 * @author gtrofimov
	 */
	@Test
	public void testGet_zipcode() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = ""; // UTA: default value
		String securityNumber = ""; // UTA: default value
		String name = ""; // UTA: default value
		String zipcode = ""; // UTA: default value
		String creditCardNumber = ""; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String result = underTest.get_zipcode();

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: Test for makePayment(Account)
	 *
	 * @see examples.nbank.CreditCard#makePayment(Account)
	 * @author gtrofimov
	 */
	@Test
	public void testMakePayment() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = ""; // UTA: default value
		String securityNumber = ""; // UTA: default value
		String name = ""; // UTA: default value
		String zipcode = ""; // UTA: default value
		String creditCardNumber = ""; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		Account account = mockAccount();
		underTest.makePayment(account);

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

	/**
	 * Parasoft Jtest UTA: Test for set_creditCardNumber(String)
	 *
	 * @see examples.nbank.CreditCard#set_creditCardNumber(String)
	 * @author gtrofimov
	 */
	@Test
	public void testSet_creditCardNumber() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = ""; // UTA: default value
		String securityNumber = ""; // UTA: default value
		String name = ""; // UTA: default value
		String zipcode = ""; // UTA: default value
		String creditCardNumber = ""; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String cardNumber = ""; // UTA: default value
		underTest.set_creditCardNumber(cardNumber);

	}

	/**
	 * Parasoft Jtest UTA: Test for set_currentBalance(int)
	 *
	 * @see examples.nbank.CreditCard#set_currentBalance(int)
	 * @author gtrofimov
	 */
	@Test
	public void testSet_currentBalance() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = ""; // UTA: default value
		String securityNumber = ""; // UTA: default value
		String name = ""; // UTA: default value
		String zipcode = ""; // UTA: default value
		String creditCardNumber = ""; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		int balance2 = 0; // UTA: default value
		underTest.set_currentBalance(balance2);

	}

	/**
	 * Parasoft Jtest UTA: Test for set_customerId(String)
	 *
	 * @see examples.nbank.CreditCard#set_customerId(String)
	 * @author gtrofimov
	 */
	@Test
	public void testSet_customerId() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = ""; // UTA: default value
		String securityNumber = ""; // UTA: default value
		String name = ""; // UTA: default value
		String zipcode = ""; // UTA: default value
		String creditCardNumber = ""; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String id2 = ""; // UTA: default value
		underTest.set_customerId(id2);

	}

	/**
	 * Parasoft Jtest UTA: Test for set_customerName(String)
	 *
	 * @see examples.nbank.CreditCard#set_customerName(String)
	 * @author gtrofimov
	 */
	@Test
	public void testSet_customerName() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = ""; // UTA: default value
		String securityNumber = ""; // UTA: default value
		String name = ""; // UTA: default value
		String zipcode = ""; // UTA: default value
		String creditCardNumber = ""; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String name2 = ""; // UTA: default value
		underTest.set_customerName(name2);

	}

	/**
	 * Parasoft Jtest UTA: Test for set_socialSecurityNumber(String)
	 *
	 * @see examples.nbank.CreditCard#set_socialSecurityNumber(String)
	 * @author gtrofimov
	 */
	@Test
	public void testSet_socialSecurityNumber() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = ""; // UTA: default value
		String securityNumber = ""; // UTA: default value
		String name = ""; // UTA: default value
		String zipcode = ""; // UTA: default value
		String creditCardNumber = ""; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String securityNumber2 = ""; // UTA: default value
		underTest.set_socialSecurityNumber(securityNumber2);

	}

	/**
	 * Parasoft Jtest UTA: Test for set_zipcode(String)
	 *
	 * @see examples.nbank.CreditCard#set_zipcode(String)
	 * @author gtrofimov
	 */
	@Test
	public void testSet_zipcode() throws Throwable {
		// Given
		int balance = 0; // UTA: default value
		String id = ""; // UTA: default value
		String securityNumber = ""; // UTA: default value
		String name = ""; // UTA: default value
		String zipcode = ""; // UTA: default value
		String creditCardNumber = ""; // UTA: default value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		String _zipcode = ""; // UTA: default value
		underTest.set_zipcode(_zipcode);

	}

	/**
	 * Parasoft Jtest UTA: Test for validate(int[], String)
	 *
	 * @see examples.nbank.CreditCard#validate(int[], String)
	 * @author gtrofimov
	 */
	@Test
	public void testValidate() throws Throwable {
		// When
		int[] digLengths = new int[0]; // UTA: default value
		String input = ""; // UTA: default value
		boolean result = CreditCard.validate(digLengths, input);

		// Then
		// assertFalse(result);
	}
}