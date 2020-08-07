/**
 * 
 */
package examples.nbank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
	@Test(timeout = 1000)
	public void testDisplayStatement() throws Throwable {
		// Given
		CreditCard underTest = NbankFactory.createCreditCard();

		// When
		underTest.displayStatement();

	}

	/**
	 * Parasoft Jtest UTA: Test for get_creditCardNumber()
	 *
	 * @see examples.nbank.CreditCard#get_creditCardNumber()
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testGet_creditCardNumber() throws Throwable {
		// Given
		CreditCard underTest = NbankFactory.createCreditCard();

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
	@Test(timeout = 1000)
	public void testGet_currentBalance() throws Throwable {
		// Given
		CreditCard underTest = NbankFactory.createCreditCard();

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
	@Test(timeout = 1000)
	public void testGet_customerId() throws Throwable {
		// Given
		CreditCard underTest = NbankFactory.createCreditCard();

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
	@Test(timeout = 1000)
	public void testGet_customerName() throws Throwable {
		// Given
		CreditCard underTest = NbankFactory.createCreditCard();

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
	@Test(timeout = 1000)
	public void testGet_socialSecurityNumber() throws Throwable {
		// Given
		CreditCard underTest = NbankFactory.createCreditCard();

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
	@Test(timeout = 1000)
	public void testGet_zipcode() throws Throwable {
		// Given
		CreditCard underTest = NbankFactory.createCreditCard();

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
	@Test(timeout = 1000)
	public void testMakePayment() throws Throwable {
		// Given
		CreditCard underTest = NbankFactory.createCreditCard();

		// When
		Customer customer = NbankFactory.createCustomer();
		Account account = NbankFactory.createAccount(customer);
		underTest.makePayment(account);

	}

	/**
	 * Parasoft Jtest UTA: Test for set_creditCardNumber(String)
	 *
	 * @see examples.nbank.CreditCard#set_creditCardNumber(String)
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testSet_creditCardNumber() throws Throwable {
		// Given
		CreditCard underTest = NbankFactory.createCreditCard();

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
	@Test(timeout = 1000)
	public void testSet_currentBalance() throws Throwable {
		// Given
		CreditCard underTest = NbankFactory.createCreditCard();

		// When
		int balance = 0; // UTA: default value
		underTest.set_currentBalance(balance);

	}

	/**
	 * Parasoft Jtest UTA: Test for set_customerId(String)
	 *
	 * @see examples.nbank.CreditCard#set_customerId(String)
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testSet_customerId() throws Throwable {
		// Given
		CreditCard underTest = NbankFactory.createCreditCard();

		// When
		String id = ""; // UTA: default value
		underTest.set_customerId(id);

	}

	/**
	 * Parasoft Jtest UTA: Test for set_customerName(String)
	 *
	 * @see examples.nbank.CreditCard#set_customerName(String)
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testSet_customerName() throws Throwable {
		// Given
		CreditCard underTest = NbankFactory.createCreditCard();

		// When
		String name = ""; // UTA: default value
		underTest.set_customerName(name);

	}

	/**
	 * Parasoft Jtest UTA: Test for set_socialSecurityNumber(String)
	 *
	 * @see examples.nbank.CreditCard#set_socialSecurityNumber(String)
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testSet_socialSecurityNumber() throws Throwable {
		// Given
		CreditCard underTest = NbankFactory.createCreditCard();

		// When
		String securityNumber = ""; // UTA: default value
		underTest.set_socialSecurityNumber(securityNumber);

	}

	/**
	 * Parasoft Jtest UTA: Test for set_zipcode(String)
	 *
	 * @see examples.nbank.CreditCard#set_zipcode(String)
	 * @author gtrofimov
	 */
	@Test(timeout = 1000)
	public void testSet_zipcode() throws Throwable {
		// Given
		CreditCard underTest = NbankFactory.createCreditCard();

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
	@Test(timeout = 1000)
	public void testValidate() throws Throwable {
		// When
		int[] digLengths = new int[0]; // UTA: default value
		String input = ""; // UTA: default value
		boolean result = CreditCard.validate(digLengths, input);

		// Then
		// assertFalse(result);
	}
}