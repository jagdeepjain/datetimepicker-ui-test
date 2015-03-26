package org.datetimepicker.ui.tests;

import org.openqa.selenium.WebDriver;

import org.ui.test.config.Browser;

public class BaseTest {
  public WebDriver driver;
  
  Browser trentrichardson = new Browser(driver);
  
  public void setUp() throws Exception {
    driver = trentrichardson.getBrowser();
    trentrichardson.openURL();
  }
  
  public void tearDown() throws Exception {
    driver.quit();
  }
  
}
