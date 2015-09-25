/**
 * @author jagdeepjain
 *
 */
package org.jagdeep.example.datetimepicker.examples.ui.tests;

import org.jagdeep.example.test.config.Browser;
import org.openqa.selenium.WebDriver;

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
