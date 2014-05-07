/**
 * 
 */
package org.datetimepicker.ui.automation.tests;

import static org.junit.Assert.*;

import org.datetimepicker.ui.common.AppConfig;
import org.datetimepicker.ui.common.SetupBrowser;
import org.openqa.selenium.WebDriver;

/**
 * @author Jagdeep Jain
 *
 */

public class BaseTest {
	AppConfig appConfig = new AppConfig();
	SetupBrowser setupAppUnderTest = new SetupBrowser();
	
	public WebDriver driver;
		
	public void setUp() throws Exception {
		driver = setupAppUnderTest.getBrowser(driver);
		appConfig.openURL(driver);
		
	}
	
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorsString = appConfig.verificationErrors.toString();
		if (!"".equals(verificationErrorsString)) {
			fail(verificationErrorsString);
		}
	}
	
}
