package org.ui.test.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
  
  InitConfig appConfig = new InitConfig();
  
  // using fireFox to test application
  public WebDriver setBrowser() {
    WebDriver fireFoxDriver = new FirefoxDriver();
    fireFoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return fireFoxDriver;
  }
  
  public WebDriver getBrowser() {
    return setBrowser();
    
  }
  
}
