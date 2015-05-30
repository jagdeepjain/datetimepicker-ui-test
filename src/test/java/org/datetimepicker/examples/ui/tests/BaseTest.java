/**
 * @author jagdeepjain
 *
 */
package org.datetimepicker.examples.ui.tests;

import org.openqa.selenium.WebDriver;
import org.ui.test.config.Browser;

public class BaseTest {
    protected WebDriver driver;
    
    private Browser trentrichardson = new Browser(driver);
    
    // setting up test infrastructure
    protected void setUp() {
        driver = trentrichardson.getBrowser();
        trentrichardson.openURL();
    }
    
    // tearing down test infrastructure
    protected void tearDown() {
        driver.quit();
    }
    
}
