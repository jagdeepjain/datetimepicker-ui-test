/**
* @author jagdeepjain
*
*/
package org.ui.elements;

import org.datetimepicker.examples.DateTimePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input implements UIElement {
	
	DateTimePicker calendarPicker = new DateTimePicker();

	public void done(WebDriver driver) {
	}
	public void now(WebDriver driver) {		
	}
	public void basicExample1(WebDriver driver, int month, int startHr, int startMin, String date) {
		driver.findElement(By.id(basicExample1)).click();
		calendarPicker.getCalendarMonth(driver, month);
		calendarPicker.getCalendarDate(driver, date);
		calendarPicker.getCalendarTime(driver, startHr, startMin);
	}
}
