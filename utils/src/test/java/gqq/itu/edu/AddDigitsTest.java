package gqq.itu.edu;

import java.lang.reflect.Field;

import org.apache.log4j.Logger;

import edu.gqq.apputils.Log4jUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AddDigitsTest extends TestCase {

	Logger logger = Log4jUtil.getLogger(AddDigitsTest.class);

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AddDigitsTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AddDigitsTest.class);
	}

	/**
	 * Rigourous Test :-)
	 * 
	 * @throws SecurityException
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	@org.junit.Test
	public void testDigitAdds() {
		assertEquals(8, addDigits(17));
	}

	public int addDigits(int num) {
		if (num < 10) {
			return num;
		}
		char[] charArray = String.valueOf(num).toCharArray();
		int total = 0;
		for (char c : charArray) {
//			do not use (int), it will return the ASC2
			int i = Character.getNumericValue(c);
			total += i;
		}
		return addDigits(total);
	}
}
