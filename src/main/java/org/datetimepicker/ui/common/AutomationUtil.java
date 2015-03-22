/**
* @author jagdeepjain
*
*/
package org.datetimepicker.ui.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.datetimepicker.ui.components.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationUtil {

	// checking if text present on the page or not, for validation purpose
	public boolean isTextPresent(String textToBeVerified, WebDriver driver) {
		boolean exists = true;
		String pageText = driver.findElement(By.tagName("Body")).getText();
		if (!pageText.contains(textToBeVerified)) {
			exists = false;
		}
		return exists;
	}

	public void calMonth(WebDriver driver, int month) {
		WebElement calMonth = driver.findElement(By.id("ui-datepicker-div"));
		for (int i = 1; i <= month; i++) {
			calMonth.findElement(By.linkText("Next")).click();
		}
	}

	public void goToCalendar(WebDriver driver) {
		driver.findElement(By.id("ui-datepicker-div"));
	}

	public void calDate(WebDriver driver, String day) {
		WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));
		List<WebElement> rows = dateWidget.findElements(By.tagName("tr"));
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

		for (WebElement cell : columns) {
			if (cell.getText().equals(day)) {
				cell.findElement(By.linkText(day)).click();
				break;
			}
		}
	}

	public void calTime(WebDriver driver, int hr, int min) {
		WebElement sliderHr = driver.findElement(By.id("ui-datepicker-div"));
		sliderHr = driver.findElement(By.xpath(XPath.calHr));
		for (int i = 1; i <= hr; i++) {
			sliderHr.sendKeys(Keys.ARROW_RIGHT);
		}

		WebElement sliderMin = driver.findElement(By.id("ui-datepicker-div"));
		sliderMin = driver.findElement(By.xpath(XPath.calMinute));
		for (int i = 1; i <= min; i++) {
			sliderMin.sendKeys(Keys.ARROW_RIGHT);
		}
	}
	
	public String datePickedByUser (int month, int day, int hr, int min) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.add(Calendar.MONTH, month);
		cal.set(Calendar.HOUR, hr);
		cal.set(Calendar.MINUTE, min);
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm");
		String date = dateFormat.format(cal.getTime());
		return date;	
	}
}
