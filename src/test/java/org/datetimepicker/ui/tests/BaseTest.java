/**
* @author jagdeepjain
*
*/
package org.datetimepicker.ui.tests;

import static org.junit.Assert.*;

import org.datetimepicker.ui.common.SetupBrowser;
import org.openqa.selenium.WebDriver;
import org.ui.test.config.InitConfig;

public class BaseTest {
	InitConfig appInitConfig = new InitConfig();
	SetupBrowser setupAppUnderTest = new SetupBrowser();
	
	public WebDriver driver;
		
	public void setUp() throws Exception {
		driver = setupAppUnderTest.getBrowser(driver);
		appInitConfig.openURL(driver);
		
	}
	
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorsString = appInitConfig.verificationErrors.toString();
		if (!"".equals(verificationErrorsString)) {
			fail(verificationErrorsString);
		}
	}
	
}
