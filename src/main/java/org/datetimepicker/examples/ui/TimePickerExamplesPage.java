/**
 * @author jagdeepjain
 *
 */
package org.datetimepicker.examples.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimePickerExamplesPage {
  // locators
  @FindBy(tagName = "h1")
  protected WebElement pageTitleLocator;
  @FindBy(id = "ui-id-5")
  protected WebElement examplesLinkLocator;
  @FindBy(id = "basic_example_1")
  protected WebElement basicExamplesLinkLocator;
  
  @FindBy(id = "ui-datepicker-div")
  protected WebElement dateTimePickerLocator;
 
  protected By dateTimePickerMonthLocator = By.linkText("Next");
  protected By dateTimePickerDateLocator = By.tagName("td");
  protected By dateTimePickerHourMinuteLocator = By.className("ui-slider-handle");
  protected By dateTimePickerDoneLocator = By.className("ui-datepicker-close");
  
  // get page title
  public String getPageTitle() {
    return pageTitleLocator.getText();
  }
  
  // click on examples tab
  public TimePickerExamplesPage clickExamplesTab() {
    examplesLinkLocator.click();
    return this;
  }
  
  // use calendar to set date and time
  public TimePickerExamplesPage setDateTime(int month, int selectedDate, int startHour, int startMinute) {
    // show calendar
    basicExamplesLinkLocator.click();
    
    // set month
    for (int i = 1; i <= month; i++) {
      dateTimePickerLocator.findElement(dateTimePickerMonthLocator).click();
    }
    // set date
    int size = dateTimePickerLocator.findElements(dateTimePickerDateLocator).size();
    for (int i = 1; i <= size; i++) {
      String text = dateTimePickerLocator.findElements(dateTimePickerDateLocator).get(i).getText();
      int dateTimePickerDateLocatorText = 0;
      if (!" ".equals(text)) {
        dateTimePickerDateLocatorText = Integer.valueOf(text);
        if  (dateTimePickerDateLocatorText == selectedDate) {
          dateTimePickerLocator.findElements(dateTimePickerDateLocator).get(i).click();
          break;
        }
      }
    }
    // set hour
    for (int i = 1; i <= startHour; i++) {
      dateTimePickerLocator.findElements(dateTimePickerHourMinuteLocator).get(0).sendKeys(Keys.ARROW_RIGHT);
    }
    // set minute
    for (int i = 1; i <= startMinute; i++) {
      dateTimePickerLocator.findElements(dateTimePickerHourMinuteLocator).get(1).sendKeys(Keys.ARROW_RIGHT);
    }
    // clicking on done button
    dateTimePickerLocator.findElement(dateTimePickerDoneLocator).click();
    
    // returning on the same page as date picker does not navigate to any page
    return this;
  }
  
  // get the entered date and time
  public String getDateTimeValue() {
    return basicExamplesLinkLocator.getAttribute("value");
  }
  
}
