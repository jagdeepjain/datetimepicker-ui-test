/**
* @author jagdeepjain
*
*/
package org.datetimepicker.ui.common;

import static org.junit.Assert.*;

import org.datetimepicker.examples.TimePickerExample;
import org.openqa.selenium.WebDriver;
import org.ui.test.config.InitConfig;
import org.ui.test.util.ScreenShotMaker;

public class Assertion {
	
	ScreenShotMaker screenShotMaker = new ScreenShotMaker();
	AutomationUtil automationUtil = new AutomationUtil();
	InitConfig appInitConfig = new InitConfig();
	TimePickerExample timePickerBasicExample1 = new TimePickerExample();

	// verify and save screen shot in case of test failure
	public void trueEquals(String validationText, WebDriver driver,
			String className) {
		try {
			assertTrue(timePickerBasicExample1.getTimeStamp(driver).equals(validationText));	
		} catch (Error e) {
			screenShotMaker.takeScreenShot(driver, e, className);
		}
	}

}
