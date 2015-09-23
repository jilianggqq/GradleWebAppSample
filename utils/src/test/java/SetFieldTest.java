

import java.lang.reflect.Field;

import org.apache.log4j.Logger;

import edu.gqq.apputils.Log4jUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SetFieldTest extends TestCase {

	Logger logger = Log4jUtil.getLogger(SetFieldTest.class);

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public SetFieldTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(SetFieldTest.class);
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
	public void testSetField() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		ClassWithField cwf = new ClassWithField();
		Field field = cwf.getClass().getDeclaredField("v");
		field.setAccessible(true);
		field.set(cwf, 3.0f);
		assertEquals(cwf.getV(), 3.0f);
		System.out.println(cwf.getV());
		logger.info(cwf.getV());
	}
}

class ClassWithField {
	private float v;

	public float getV() {
		return v;
	}

	public void setV(float v) {
		this.v = v;
	}
}
