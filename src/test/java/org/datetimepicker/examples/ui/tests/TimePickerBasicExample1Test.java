/**
 * @author jagdeepjain
 *
 */
package org.datetimepicker.examples.ui.tests;

import static org.junit.Assert.assertTrue;

import org.datetimepicker.examples.ui.TimePickerExamplesPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.ui.test.common.ScreenShotMaker;
import org.ui.test.common.Util;

public class TimePickerBasicExample1Test extends BaseTest {
  
  private String actual;
  private String expected;

  @Before
  public void setUp() throws Exception {
    super.setUp();
  }
  
  @After
  public void tearDown() throws Exception {
    super.tearDown();
  }
  
  @Test
  public void test() throws Exception {
    TimePickerExamplesPage timePickerExamplesPage = PageFactory.initElements(driver, TimePickerExamplesPage.class);
    
    // save fully qualified class name to used in test reports
    String className = this.getClass().getCanonicalName();
    timePickerExamplesPage.clickExamplesTab();
    
    // next month from current date on 10th at 9:00 AM
    timePickerExamplesPage.setDateTime(1, 9, 0, "10");
    
    // getting the actual calendar
    expected = Util.getDateTime(1, 9, 0, 10);
    // get the date which was set by setDateTime()
    actual = timePickerExamplesPage.getDateTime();
    
    try {
      assertTrue(expected.equals(actual));
    } catch (Exception e) {
      ScreenShotMaker.getInstance().takeScreenShot(driver, className);
      throw e;
    }
  }
}
