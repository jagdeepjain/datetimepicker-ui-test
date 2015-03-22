/**
 * @author jagdeepjain
 *
 */
package org.datetimepicker.ui.automation.tests;

import org.datetimepicker.ui.examples.TimePickerExample;
import org.datetimepicker.ui.common.AutomationUtil;
import org.datetimepicker.ui.common.ResultProcessing;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimePickerBasicExample1Test extends BaseTest {

	TimePickerExample timePickerBasicExample1 = new TimePickerExample();
	AutomationUtil automationUtil = new AutomationUtil();
	ResultProcessing resultProcessing = new ResultProcessing();

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
		timePickerBasicExample1.goToExamples(driver);
		// next month from current date on 10th at 9:00 AM
		timePickerBasicExample1.setDateTime(driver, 1, 9, 0, "10");
		resultProcessing
				.verifyResults(automationUtil.datePickedByUser(1, 10, 9, 0),
						driver, className);

	}

}
