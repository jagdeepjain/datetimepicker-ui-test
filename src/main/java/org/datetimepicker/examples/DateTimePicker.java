/**
* @author jagdeepjain
*
*/
package org.datetimepicker.examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.ui.elements.UIElement;

public class DateTimePicker {
	
	public void getCalendarMonth(WebDriver driver, int month) {
		WebElement calMonth = driver.findElement(By.id(UIElement.datePickerDiv));
		for (int i = 1; i <= month; i++) {
			calMonth.findElement(By.linkText("Next")).click();
		}
	}
	public void getCalendarDate(WebDriver driver, String day) {
		WebElement dateWidget = driver.findElement(By.id(UIElement.datePickerDiv));
		//List<WebElement> rows = dateWidget.findElements(By.tagName("tr"));
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
		for (WebElement cell : columns) {
			if (cell.getText().equals(day)) {
				cell.findElement(By.linkText(day)).click();
				break;
			}
		}
	}
	public void getCalendarTime(WebDriver driver, int hr, int min) {
		WebElement sliderHr = driver.findElement(By.id(UIElement.datePickerDiv));
		sliderHr = driver.findElement(By.xpath(UIElement.calendarHr));
		for (int i = 1; i <= hr; i++) {
			sliderHr.sendKeys(Keys.ARROW_RIGHT);
		}
		WebElement sliderMin = driver.findElement(By.id(UIElement.datePickerDiv));
		sliderMin = driver.findElement(By.xpath(UIElement.calendarMinute));
		for (int i = 1; i <= min; i++) {
			sliderMin.sendKeys(Keys.ARROW_RIGHT);
		}
	}
}
