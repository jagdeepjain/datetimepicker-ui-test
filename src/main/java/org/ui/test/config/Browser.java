/**
* @author jagdeepjain
*
*/
package org.ui.test.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	InitConfig appConfig = new InitConfig();
	
	//using fireFox to test application
	public WebDriver setBrowser(WebDriver driver) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	//TODO add support for other browsers
	
	public WebDriver getBrowser(WebDriver driver) {
		return setBrowser(driver);
		
	}
	
}
