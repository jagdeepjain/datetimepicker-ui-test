/**
 * @author jagdeepjain
 *
 */
package org.datetimepicker.examples.ui.tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.datetimepicker.examples.ui.TimePickerExamplesPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.ui.test.common.ScreenShotMaker;

public class TimePickerExamplesPageTitleTest extends BaseTest {
    
    private String actual;
    private String expected = "Adding a Timepicker to jQuery UI Datepicker";
    
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }
    
    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
    
    @Test
    public void test() throws AssertionError, IOException {
        TimePickerExamplesPage timePickerExamplesPage = PageFactory
                .initElements(driver, TimePickerExamplesPage.class);
        
        // save fully qualified class name to be used in test reports
        String className = this.getClass().getCanonicalName();
        
        // get the page title
        actual = timePickerExamplesPage.getPageTitle();
        try {
            assertTrue(expected.equals(actual));
        } catch (AssertionError ae) {
            ScreenShotMaker.getInstance().takeScreenShot(driver, className);
            throw ae;
        }
    }
}
