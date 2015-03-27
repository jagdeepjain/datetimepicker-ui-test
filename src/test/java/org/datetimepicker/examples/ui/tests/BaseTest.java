/**
 * @author jagdeepjain
 *
 */
package org.datetimepicker.examples.ui.tests;

import org.openqa.selenium.WebDriver;
import org.ui.test.config.Browser;

public class BaseTest {
  public WebDriver driver;
  
  Browser trentrichardson = new Browser(driver);
  
  // setting up test infrastructure
  public void setUp() throws Exception {
    driver = trentrichardson.getBrowser();
    trentrichardson.openURL();
  }
  
  // tearing down test infrastructure
  public void tearDown() throws Exception {
    driver.quit();
  }
  
}
