/**
* @author jagdeepjain
*
*/
package org.datetimepicker.ui.components;

import org.datetimepicker.examples.DateTimePicker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.ui.elements.AbstractInputBox;

public class InputBox extends AbstractInputBox {

	DateTimePicker calendarPicker = new DateTimePicker();
	private final String basicExample1 = "basic_example_1";
	
	public void basicExample1(WebDriver driver, int month, int startHr, int startMin, String date) {
		driver.findElement(By.id(basicExample1)).click();
		calendarPicker.getCalendarMonth(driver, month);
		calendarPicker.getCalendarDate(driver, date);
		calendarPicker.getCalendarTime(driver, startHr, startMin);
	}
	@Override
	public void button(WebDriver driver) {
		// TODO Auto-generated method stub
	}
	@Override
	public void inputBox(WebDriver driver) {
		// TODO Auto-generated method stub
	}

}
