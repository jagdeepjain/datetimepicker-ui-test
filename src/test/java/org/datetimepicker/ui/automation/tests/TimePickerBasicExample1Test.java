/**
 * @author jagdeepjain
 *
 */
package org.datetimepicker.ui.automation.tests;

import org.datetimepicker.examples.TimePickerExample;
import org.datetimepicker.ui.common.AutomationUtil;
import org.datetimepicker.ui.common.Assertion;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimePickerBasicExample1Test extends BaseTest {

	TimePickerExample timePickerBasicExample1 = new TimePickerExample();
	AutomationUtil automationUtil = new AutomationUtil();
	Assertion assertTest = new Assertion();

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
		assertTest.trueEquals(automationUtil.datePickedByUser(1, 10, 9, 0),
						driver, className);

	}

}
