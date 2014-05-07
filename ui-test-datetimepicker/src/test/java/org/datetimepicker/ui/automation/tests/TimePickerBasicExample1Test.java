/**
 * 
 */
package org.datetimepicker.ui.automation.tests;

import org.datetimepicker.ui.TimePickerBasicExample1;
import org.datetimepicker.ui.common.AutomationUtil;
import org.datetimepicker.ui.common.ResultProcessing;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jagdeep Jain
 *
 */
public class TimePickerBasicExample1Test extends BaseTest {

	TimePickerBasicExample1 timePickerBasicExample1 = new TimePickerBasicExample1();
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
		timePickerBasicExample1.setDateTime(driver, 1, 9, 0, "10"); //next month on 10th at 9:00 AM
		resultProcessing.verifyResults(automationUtil.datePickedByUser(1, 10, 9, 0), driver, className);
		
	}

}
