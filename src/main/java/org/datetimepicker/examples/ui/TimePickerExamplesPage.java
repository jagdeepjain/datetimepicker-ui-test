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
  By datePickerDoneButtonLocator = By.xpath("//*[@id='ui-datepicker-div']/div[3]/button[2]");
  By datePickerNowButtonLocator = By.xpath("//*[@id='ui-datepicker-div']/div[3]/button[1]");
  
  // constructor
  public TimePickerExamplesPage(WebDriver driver) {
    this.driver = driver;
  }
  
  // get page title
  public String getPageTitle() {
    return driver.findElement(pageTitleLocator).getText();
  }
  
  // click on examples tab
  public TimePickerExamplesPage clickExamplesTab() {
    driver.findElement(examplesLinkLocator).click();
    return this;
  }
  
  // use calendar to set date and time
  public TimePickerExamplesPage setDateTime(int month, int startHour,
      int startMinute, String date) {
    driver.findElement(basicExamplesLinkLocator).click();
    
    WebElement calendar = driver.findElement(datePickerDivLocator);
    
    for (int i = 1; i <= month; i++) {
      calendar.findElement(By.linkText("Next")).click();
    }
    List<WebElement> column = calendar.findElements(By.tagName("td"));
    for (WebElement cell : column) {
      if (cell.getText().equals(date)) {
        cell.findElement(By.linkText(date)).click();
        break;
      }
    }
    // set hour
    for (int i = 1; i <= startHour; i++) {
      driver.findElement(calendarHourLocator).sendKeys(Keys.ARROW_RIGHT);
    }
    // set minute
    for (int i = 1; i <= startMinute; i++) {
      driver.findElement(calendarMinuteLocator).sendKeys(Keys.ARROW_RIGHT);
    }
    return this;
  }
  
  // get the entered date and time
  public String getDateTime() {
    return driver.findElement(basicExamplesLinkLocator).getAttribute("value");
  }
  
}
