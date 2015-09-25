/**
 * @author jagdeepjain
 *
 */
package org.jagdeep.example.datetimepicker.examples.ui.tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.jagdeep.example.datetimepicker.examples.ui.TimePickerExamplesPage;
import org.jagdeep.example.test.common.ScreenShotMaker;
import org.jagdeep.example.test.common.Util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class TimePickerBasicExample1Test extends BaseTest {
    
    private String actual;
    private String expected;
    
    @Before
    public void setUp() {
        super.setUp();
    }
    
    @After
    public void tearDown() {
        super.tearDown();
    }
    
    @Test
    public void test() throws AssertionError, IOException {
        TimePickerExamplesPage timePickerExamplesPage = PageFactory
                .initElements(driver, TimePickerExamplesPage.class);
        
        // save fully qualified class name to used in test reports
        String className = this.getClass().getCanonicalName();
        timePickerExamplesPage.clickExamplesTab();
        
        // next month on 9th at 9:10 AM
        timePickerExamplesPage.setDateTime(1, 9, 9, 10);
        
        // getting the actual date in the format of date time picker mm/dd/yyyy hh:mm
        expected = Util.getDateTime(1, 9, 9, 10);
        
        // get the date which was set by setDateTime()
        actual = timePickerExamplesPage.getDateTimeValue();
        try {
            assertTrue(expected.equals(actual));
        } catch (AssertionError ae) {
            ScreenShotMaker.getInstance().takeScreenShot(driver, className);
            throw ae;
        }
    }
}
