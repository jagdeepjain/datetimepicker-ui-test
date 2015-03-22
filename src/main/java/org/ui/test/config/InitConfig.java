/**
* @author jagdeepjain
*
*/
package org.ui.test.config;

import org.openqa.selenium.WebDriver;

public class InitConfig {
			
	private String urlUnderTest = "http://trentrichardson.com/examples/timepicker/";
	
	public void openURL(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get(urlUnderTest);
	}
}
