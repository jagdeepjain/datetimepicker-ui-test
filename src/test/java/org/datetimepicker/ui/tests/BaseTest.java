/**
* @author jagdeepjain
*
*/
package org.datetimepicker.ui.tests;

import org.openqa.selenium.WebDriver;
import org.ui.test.config.Browser;
import org.ui.test.config.InitConfig;

public class BaseTest {
	InitConfig appInitConfig = new InitConfig();
	Browser fireFoxInstance = new Browser();
	
	public WebDriver driver;
		
	public void setUp() throws Exception {
		driver = fireFoxInstance.getBrowser(driver);
		appInitConfig.openURL(driver);
	}
	
	public void tearDown() throws Exception {
		driver.quit();
	}
	
}
