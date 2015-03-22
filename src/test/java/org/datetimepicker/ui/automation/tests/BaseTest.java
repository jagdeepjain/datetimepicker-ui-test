/**
* @author jagdeepjain
*
*/
package org.datetimepicker.ui.automation.tests;

import static org.junit.Assert.*;

import org.datetimepicker.ui.common.InitConfig;
import org.datetimepicker.ui.common.SetupBrowser;
import org.openqa.selenium.WebDriver;

public class BaseTest {
	InitConfig appConfig = new InitConfig();
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
