/**
 * @author jagdeepjain
 *
 */
package org.datetimepicker.examples.ui;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TimePickerExamplesPage {
  private final WebDriver driver;
  // locators
  By pageTitleLocator = By.tagName("h1");
  By examplesLinkLocator = By.id("ui-id-5");
  By basicExamplesLinkLocator = By.id("basic_example_1");
  By datePickerDivLocator = By.id("ui-datepicker-div");
  By calendarHourLocator = By.xpath("//*[@id='ui-datepicker-div']/div[2]/dl/dd[2]/div/span");
  By calendarMinuteLocator = By.xpath("//*[@id='ui-datepicker-div']/div[2]/dl/dd[3]/div/span");
  By calendarNextButtonLocator = By.linkText("Next");
  By calendarDateContainer = By.tagName("td");
  // constructor
  public TimePickerExamplesPage(WebDriver driver) {
    this.driver = driver;
  }

  // get date from calendar
  private By goToCalendarDate(String date) {
    return By.linkText(date);
  }
  // get By elements
  private WebElement getElement(By element) {
    return driver.findElement(element); 
  }  
  // get page title
  public String getPageTitle() {
    return getElement(pageTitleLocator).getText();
  }
  
  // click on examples tab
  public TimePickerExamplesPage clickExamplesTab() {
    getElement(examplesLinkLocator).click();
    return this;
  }
  
  // use calendar to set date and time
  public TimePickerExamplesPage setDateTime(int month, int startHour, int startMinute, String date) {
    // show calendar
    getElement(basicExamplesLinkLocator).click();
    
    // set month
    WebElement calendar = getElement(datePickerDivLocator);
    for (int i = 1; i <= month; i++) {
      calendar.findElement(calendarNextButtonLocator).click();
    }
    //set date
    List<WebElement> column = calendar.findElements(calendarDateContainer);
    for (WebElement cell : column) {
      if (cell.getText().equals(date)) {
        cell.findElement(goToCalendarDate(date)).click();
        break;
      }
    }
    // set hour
    for (int i = 1; i <= startHour; i++) {
      getElement(calendarHourLocator).sendKeys(Keys.ARROW_RIGHT);
    }
    // set minute
    for (int i = 1; i <= startMinute; i++) {
      getElement(calendarMinuteLocator).sendKeys(Keys.ARROW_RIGHT);
    }
    return this;
  }
  
  // get the entered date and time
  public String getDateTime() {
    return driver.findElement(basicExamplesLinkLocator).getAttribute("value");
  }
  
}
