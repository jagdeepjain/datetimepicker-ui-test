package org.datetimepicker.ui.common;

import static org.junit.Assert.*;

import org.datetimepicker.ui.TimePickerBasicExample1;
import org.openqa.selenium.WebDriver;
/**
 * @author Jagdeep Jain
 *
 */
public class ResultProcessing {
	
	ScreenShotMaker screenShotMaker = new ScreenShotMaker();
	AutomationUtil automationUtil = new AutomationUtil();
	AppConfig appConfig = new AppConfig();
	TimePickerBasicExample1 timePickerBasicExample1 = new TimePickerBasicExample1();

	
	// verify and save screen shot in case of test failure
	public void verifyResults(String validationText, WebDriver driver,
			String className) {
		try {
			assertTrue(timePickerBasicExample1.getDateTime(driver).equals(validationText));
			
		} catch (Error e) {
			screenShotMaker.takeScreenShot(driver, e, className);
			System.out
					.println(appConfig.verificationErrors.append(e.toString()));
			appConfig.verificationErrors.append(e.toString());
		}
	}

}
