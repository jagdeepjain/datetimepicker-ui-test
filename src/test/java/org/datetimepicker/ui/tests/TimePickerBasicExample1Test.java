/**
 * @author jagdeepjain
 *
 */
package org.datetimepicker.ui.tests;

import org.datetimepicker.examples.TimePickerExample;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.ui.test.assertions.Assertion;
import org.ui.test.util.Utility;

public class TimePickerBasicExample1Test extends BaseTest {

	TimePickerExample timePickerBasicExample1 = new TimePickerExample();
	Utility util = new Utility();
	Assertion assertTest = new Assertion();
	private String actual;
	private String expected;

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void test() {
		String className = this.getClass().getCanonicalName();
		timePickerBasicExample1.clickExamplesLink(driver);
		// next month from current date on 10th at 9:00 AM
		timePickerBasicExample1.setTimeStamp(driver, 1, 9, 0, "10");
		// converting to date format for comparison
		expected = util.getTimeStamp(1, 10, 9, 0);
		actual = timePickerBasicExample1.getTimeStamp(driver);
		assertTest.trueEquals(expected, actual,driver, className);
	}

}
