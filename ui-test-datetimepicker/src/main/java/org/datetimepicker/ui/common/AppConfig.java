/**
 * 
 */
package org.datetimepicker.ui.common;

import org.openqa.selenium.WebDriver;

/**
 * @author Jagdeep Jain
 *
 */
public class AppConfig {
	
	//verification error
	public StringBuffer verificationErrors = new StringBuffer();
			
	private String urlUnderTest = "http://trentrichardson.com/examples/timepicker/";
	
	public void openURL(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get(urlUnderTest);
	}
}
